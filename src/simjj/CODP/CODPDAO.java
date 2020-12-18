package simjj.CODP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import simjj.JDBCUtil;

// sql처리 메서드가 모인 클래스
public class CODPDAO {
    public static ArrayList<CODPVO> selectCodp() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<CODPVO> codp = new ArrayList<>();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(CODPJDBC.selectcodp);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                CODPVO co = new CODPVO(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getInt(12),
                        rs.getString(13),
                        rs.getString(14),
                        rs.getInt(15),
                        rs.getInt(16));

                codp.add(co);
            }
        } catch (SQLException se) {
            System.out.println("selectCodp메서드에서 오류발생!");
        }
        JDBCUtil.destoryConn(pstmt,conn,rs);
        return codp;
    }


    public static ArrayList<CODPVO> selectSOE() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<CODPVO> codp = new ArrayList<>();

        conn = JDBCUtil.makeConn();
        try {
            pstmt = conn.prepareStatement(CODPJDBC.selecttsoe);
            rs = pstmt.executeQuery();

            while (rs.next()){
                CODPVO co = new CODPVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8) );

                codp.add(co);
            }
        } catch (SQLException se) {
            System.out.println("selectSOE메서드에서 오류발생!");
        }
        JDBCUtil.destoryConn(pstmt,conn,rs);
        return codp;
    }
}