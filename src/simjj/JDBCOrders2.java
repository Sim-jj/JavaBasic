package simjj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ptsmt = null;
        String sql = "insert into bookOrders values (?,?,?,?,?)";
        conn = JDBCUtil.makeConn();

        // 주문정보 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.println("주문번호를 입력하세요");
        int ordid = Integer.parseInt(sc.nextLine());
        System.out.println("고객번호를 입력하세요");
        int custid = Integer.parseInt(sc.nextLine());
        System.out.println("도서번호를 입력하세요");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.println("판매가격을 입력하세요");
        int saleprice = Integer.parseInt(sc.nextLine());
        System.out.println("주문일자를 입력하세요");
        String orddate = sc.nextLine();

        try {
            ptsmt = conn.prepareStatement(sql);
            ptsmt.setInt(1,ordid);
            ptsmt.setInt(2,custid);
            ptsmt.setInt(3,bookid);
            ptsmt.setInt(4,saleprice);
            ptsmt.setString(5,orddate);
            int cnt = ptsmt.executeUpdate();
            if(cnt > 0) System.out.println("주문정보 데이터 입력완료!");
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성오류");
        } finally {
            JDBCUtil.destoryConn(ptsmt,conn);
        }


    }
}
