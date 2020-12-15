package simjj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ptstm = null;
        String sql = "insert into bookMembers values (?,?,?,?)";

        Scanner sc = new Scanner(System.in);

        System.out.println("회원번호는?");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("회원이름은?");
        String name = sc.nextLine();
        System.out.println("회원주소는?");
        String addr = sc.nextLine();
        System.out.println("회원전화번호는?");
        String phone = sc.nextLine();

        // 쉐어의 목적이 있는거면 static붙이기 그렇지 않은 경우는 new 연산자로 객체화를 해야한다
        conn = JDBCUtil.makeConn(); // static변수가 붙어져 있기 때문에 클래스 객체화를 시키지 않고도 사용할 수 있나보다(공용으로 사용가능)

        try {
            ptstm = conn.prepareStatement(sql);
            ptstm.setInt(1,custid);
            ptstm.setString(2,name);
            ptstm.setString(3,addr);
            ptstm.setString(4,phone);
            int cnt = ptstm.executeUpdate();
            if(cnt>0) System.out.println("회원정보 데이터 추가 완료!");
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성오류");
        } finally {
            JDBCUtil.destoryConn(ptstm,conn);
        }
    }
}
