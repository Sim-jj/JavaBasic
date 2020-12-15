package simjj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMembers {
    // playground 데이터베이스의 bookMembers 테이블에
    // 새로운 회원정보를 입력하는 JDBC프로그램을 작성하세요
    // 컬럼정보 : custid, name, address, phone
    // 입력은 Scanner 이용

    public static void main(String[] args) {
        // 1. 회원정보 입력하기
        Scanner sc = new Scanner(System.in);

        System.out.println("회원번호를 입력하세요");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("회원이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("회원주소를 입력하세요");
        String addr = sc.nextLine();
        System.out.println("폰번호를 입력하세요");
        String phone = sc.nextLine();

        String sql = "insert into bookMembers values (" + custid + ",'" + name + "','" + addr
                     + "','" + phone + "')";

        Connection conn = null;
        String drv = "org.mariadb.jdbc.Driver";
        String url = "jdbc:mariadb://mariadb.cgvl3q0iympc.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String usr = "playground";
        String pwd = "playground2020";
        Statement stmt = null;

        try {
            Class.forName(drv);
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이브를 설치하세요");
        }

        try {
            conn = DriverManager.getConnection(url,usr,pwd);
        } catch (SQLException se) {
            System.out.println("디비접속 주소나 아이디/비번을 확인해주세요");
        }

        try {
            stmt = conn.createStatement();
            Boolean isfail = stmt.execute(sql);
            if(!isfail) System.out.println("데이터 추가완료!");
        } catch (SQLException se) {
            System.out.println("JDBC - SQL 실행오류!!");
        }

        if (stmt != null) {
            try { stmt.close(); } catch (SQLException se) { } }
        if (stmt != null) {
            try { conn.close(); } catch (SQLException se) { } }
    }
}
