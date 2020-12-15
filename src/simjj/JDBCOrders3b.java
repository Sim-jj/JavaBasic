package simjj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCOrders3b {
    public static void main(String[] args) {
        // 주문날짜로 주문데이터 조회
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from bookOrders where orderdate = ?;";
        StringBuilder sb = new StringBuilder();
        String fmt = "%s %s %s %s %s \n";
        Scanner sc = new Scanner(System.in);

        System.out.println("찾고자하는 주문날짜을 입력해주세요");
        String date = sc.nextLine();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,date);
            rs = pstmt.executeQuery();

            while(rs.next()){
                String ordid = rs.getString(1);
                String cuid = rs.getString(2);
                String bkid = rs.getString(3);
                String saprice = rs.getString(4);
                String ordate = rs.getString(5);

                String result = String.format(fmt,ordid,cuid,bkid,saprice,ordate);
                sb.append(result);
            }
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성 오류!");
        } JDBCUtil.destoryConn(pstmt,conn,rs);

        System.out.println(sb.toString());
    }
}
