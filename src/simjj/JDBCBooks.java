package simjj;

import java.sql.*;
import java.util.Scanner;

public class JDBCBooks {
    // playground 데이터베이스의 Books 테이블에
    // 새로운 도서정보를 입력하는 JDBC프로그램을 작성하세요
    // 컬럼정보 : bookid, bookname, publisher, price
    // 입력은 Scanner 이용

    public static void main(String[] args) {

        // 1. 도서정보 입력
        int key = 11;
        String sql = "";
        Statement stmt = null;;

        Scanner sc = new Scanner(System.in);
        System.out.println("책 제목을 입력하세요");
        String name = sc.nextLine();

        System.out.println("출판사를 입력하세요");
        String pub = sc.nextLine();

        System.out.println("가격을 입력하세요");
        int price = sc.nextInt();

        // 2. 입력받은 도서정보를 Books테이블에 저장하는 SQL문작성
        StringBuffer sbf = new StringBuffer(); // appnen 메소드를 사용하기 위한(테스트용)
        sql = "insert into Books values (" + key + "," + name + "," + pub + "," + price  + ")";
        System.out.println(sql);

        sbf.append("insert into Books values (") // 테스트용
                .append(key).append(",").append(name).append(",")
                .append(pub).append(",").append(price).append(")");

        System.out.println(sbf); // 테스트용

        // 3. JDBC 드라이버를 메모리에 적재함
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이버를 설치하세요");
        }

        // 4. 데이터베이스 서버에 접속하기
        Connection conn = null;
        String url = "jdbc:mariadb://"
                + "mariadb.cgvl3q0iympc.ap-northeast-2.rds.amazonaws.com"
                + ":3306/playground";
        try {
            conn = DriverManager.getConnection( // 데이터베이스에서 연결객체 가져오기
                    url,
                    "playground",
                    "playground2020");
            if(!conn.isClosed()){ System.out.println("데이터베이스 접속 성공"); }

            stmt =  conn.createStatement();
            ResultSet srs = stmt.executeQuery(sql);

        } catch (SQLException sqlex) {
            System.out.println("디비접속 주소나 아이디/비번을 확인해주세요");
        }



    }
}
