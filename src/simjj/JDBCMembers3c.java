package simjj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCMembers3c {
    public static void main(String[] args) {
        // 고객 이름을 포함하는 도서정보 조회 (like절)
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from bookMembers where name like ?;";
        StringBuilder sb = new StringBuilder();
        String fmt = "%s %s %s %s \n";
        Scanner sc = new Scanner(System.in);

        System.out.println("찾을 고객명을 입력해주세요");
        String cname = sc.nextLine();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"%" + cname + "%");
            rs = pstmt.executeQuery();

            while(rs.next()){
                String custid = rs.getString(1);
                String name = rs.getString(2);
                String addr = rs.getString(3);
                String phone = rs.getString(4);

                String result = String.format(fmt,custid,name,addr,phone);
                sb.append(result);
            }
        } catch (SQLException ex) {
            System.out.println("JDBC 질의문 생성 오류!");
        }
        JDBCUtil.destoryConn(pstmt,conn,rs);

        System.out.println(sb.toString());
    }
}
