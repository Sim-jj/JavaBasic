package simjj;
// 스트림Stream
// 데이터를 비트등의 단위로 조각내어 일련의 연속성을 갖도록 만든 데이터의 열
// 일반적으로 스트림이라하면 이러한 데이터의 열과 이것을 활용하기 위해 사용하는 모듈을 합쳐 부르는 것

// 스트림은 데이터를 읽고 쓰기 위한 공통된 방법 제공
// 자바에서 스트림 처리방식은 모든 데이터를 바이트로 보는 바이트 단위 스트림과
// 문자데이터만을 위한 문자 단위 스트림등이 있다

// 문자 스트림을 다루는 클래스 : java.io 패키지에 포함
// Reader/Writer => FileReader/FileWriter

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        // 자신의 이름, 키, 나이를 파일에 저장
        String name = "정국";
        int height = 179;
        int age = 24;

        // 파일에 기록
        // 데이터를 저장할 위치와 파일명 지정
        String fPath = "c:/java/info.txt"; // 저장할 파일 경로

        // 파일쓰기(문자출력) 객체 생성
        // FileWriter 변수명 = new FileWriter(데이터를 저장할 위치);
        FileWriter fw = new FileWriter(fPath); // FileWriter는 객체 생성시 반드시 예외처리를 추가

        // 파일에 내용쓰기
        // .write(변수명)
        fw.write(name + "\n");
        fw.write(height+"\n");
        fw.write(age+"\n");

        // 파일쓰기를 끝내고 작업 마무리
        fw.close(); // 반드시 close 메소드를 실행해야지 파일이 저장됨

        // 파일에 저장된 데이터를 화면에 출력하기 ①
        // 한 문자씩 읽어와서 출력

        // 읽어올 파일명 위치지정
        // FileReader 변수명 = new FileReader(데이터가 저장된 위치);
        FileReader fr = new FileReader(fPath);

        // 파일로 부터 문자 하나를 읽어서 화면에 출력
        // 이러한 작업을 더이상 읽을 문자가 없을때까지 반복
        // 아스키코드는 문자하나에 할당된 숫자코드
        int ch = 0;
        while((ch = fr.read()) != -1) {
            //read() 메서드를 이용해 문자를 읽은뒤 ch 변수를 넣어서 ch가 -1 이 아닐때까지 이 문자를 계속 반복( != -1 => 가지고 있지 않다면 즉 출력할 데이터가 없을때까지)
            // -1 = 데이터가 없다는 의미 (아스키코드 표 참조)
            System.out.println(ch + "/" + (char)ch); // ch만 입력시 아스키코드로만 출력이 되는데 '(char)ch' 를 추가해주면 문자 그대로 출력해준다
        }

        // 파일 읽기가 끝나면 작업 마무리
        fr.close();

        // 파일에 저장된 데이터를 화면에 출력하기 ②
        // 한 행씩 읽어와서 출력
        // BufferedReader를 이용해서 처리하면 입력속도를 높일 수 있음
        fr = new FileReader((fPath));
        BufferedReader br = new BufferedReader(fr);

        // 읽어올 데이터가 있는지 확인
        while(br.ready()){
            // .reday() => 만일, 읽어올 데이터가 있다면 한행씩 읽어서 화면 출력
            System.out.println(br.readLine()); //.readLine() => 한행씩 출력
        }

        // 파일읽기가 끝나면 작업 마무리

        br.close(); // 나중에 생성된 객체를 먼저 닫아야 하므로 BufferedReader 를 먼저닫아줌
        fr.close();
    }
}
