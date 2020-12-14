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
        Scanner sc = new Scanner(System.in);
        String sql = "";

        System.out.println("도서번호는?");
        int bookid = Integer.parseInt(sc.nextLine());
        System.out.println("도서 제목은?");
        String name = sc.nextLine();
        System.out.println("도서 출판사는?");
        String pub = sc.nextLine();
        System.out.println("도서 가격은?");
        int price = Integer.parseInt(sc.nextLine());

        // 2. 입력받은 도서정보를 Books테이블에 저장하는 SQL문작성
        // insert into Books values(10,'자바','더조은',1000)
        // insert into Books values(bookid,bookname,pub,price)
        sql = "insert into books values (" + bookid + ",'" + name + "','" + pub + "'," + price  + ")";

        System.out.println(sql);

        // 3. 생성한 sql문을 JDBC를 통해 실행
        String DRV = "org.mariadb.jdbc.Driver"; // 외우기
        String URL = "jdbc:mariadb://mariadb.cgvl3q0iympc.ap-northeast-2.rds.amazonaws.com:3306/playground";
        String USR = "playground";
        String PWD = "playground2020";

        // a) JDBC드라이버 초기화화
       try {
            Class.forName(DRV); // 드라이브를 메모리에 올려두는 처리
        } catch (ClassNotFoundException cnf) {
            System.out.println("JDBC 드라이버를 설치하세요");
        }

        // b) 데이터베이스 서버에 접속하기
        Connection conn = null;

        try {
            conn = DriverManager.getConnection( // 데이터베이스에 접속하겠단 의미
                    URL, USR, PWD);
        } catch (SQLException se) {
            System.out.println("디비접속 주소나 아이디/비번을 확인해주세요");
        }

        // c) SQL문 객체를 생성하고 서버로 전송해서 실행함
        Statement stmt = null; // SQL문 처리용 Statement 객체 생성

        try {
            stmt = conn.createStatement(); // 데이터베이스로 sql문을 넘겨주기위한 사전처리
            Boolean isfail = stmt.execute(sql); // 질의문이 잘들어갔는지 참이면 isfail에게 반환
            if(!isfail) System.out.println("데이터 추가완료!");

        } catch (SQLException throwables) {
            System.out.println("JDBC - SQL 실행오류!!");
        }

        // d) JDBC 관련 객체는 메모리에서 제거
        if (stmt != null) { // 나중에 만든 객체를 먼저 닫는다
            try { stmt.close(); } catch (SQLException se) { } }
        if (conn != null) {
            try { conn.close(); } catch (SQLException se) { }
        }
    }
}
