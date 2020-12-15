package simjj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCMembers3 {
    public static void main(String[] args) {
        // Members테이블 데이터를 모두 출력함
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from bookMembers;";
        StringBuilder sb = new StringBuilder();
        String fmt = "%s %s %s %s \n";

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(sql);
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
