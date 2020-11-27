package simjj;

// 2차원 표형태의 데이터를 파일에 저장하기

import java.io.*;

public class FileReaderWriter2 {
    public static void main(String[] args) throws IOException {
        // 학번, 이름, 주소, 생년월일, 학과명, 교수 등으로 구성된 2차원 표형태의 데이터를 student.dat에 저장

        int hakbun = 201350050;
        String name = "전정국";
        String addr = "경기도 고양시";
        String birth = "1997.9.1";
        String dname = "컴퓨터";
        int prof = 504;

        int subNum = 205;
        String subName = "프로그래밍";
        String subIn = "자바 프로그래밍";
        int prof1 = 301;


        // 학생 기본정보를 저장할 파일 지정
        String fpath = "c:/java/student.dat";
        FileWriter fw = new FileWriter(fpath);
        // 각 항목들은 ,로 구분함
        // 기본정보를 저장할 형식 정의
        String fmt = "%s, %s, %s, %s, %s, %s";
        String data = String.format(fmt,hakbun,name,addr,birth,dname,prof);

        fw.write(data);

        fw.close();

        // 버퍼기능을 지원하는 Writer 사용하기
        fw = new FileWriter(fpath); // 위에 fw는 close 했으니 새로운 객체를 생성
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(data);

        bw.close();
        fw.close();

        /* 내가 한 연습 ①
        fpath = "c:/java/student1.dat";
        fmt = "%s, %s, %s, %s";
        data = String.format(fmt,subNum,subName,subIn,prof1);

        fw = new FileWriter(fpath);
        bw = new BufferedWriter(fw);

        bw.write(data);

        bw.close();
        fw.close();*/

        // 선생님과 한 연습 ①
        // 과목번호, 과목명, 과목개요, 담당교수등으로 구성된 2차원 표형태의 데이터를 subject.dat에 저장
        String sjNo = "0205";
        String sjName = "프로그래밍";
        String sjDesc = "자바 프로그래밍";
        int sjProf = 301;

        fpath = "c:/java/subject.dat"; // / => 를 역슬래쉬(\\)로 사용할 수도 있다
        fmt = "%s, %s, %s, %s";
        data = String.format(fmt,sjNo,sjName,sjDesc,sjProf);

        fw = new FileWriter(fpath);
        bw = new BufferedWriter(fw);

        bw.write(data);

        bw.close();
        fw.close();

        // 과목 정보가 저장된 파일을 읽어서 출력하기
        // 과목번호 : ~~
        // 과목이름 : ~~ ...
        FileReader fr = new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);
        fmt = "과목번호: %s\n과목명: %s\n과목개요: %s\n담당교수: %s\n";

        while(br.ready()){
            String line = br.readLine();
            // System.out.println(line);

            // 읽어온 split 메서드를 이용해 데이터를 ,단위로 분리해서 배열변수에 저장
            String[] items = line.split(",");

            String result = String.format(fmt,items[0],items[1],items[2],items[3]);
            System.out.println(result);
        }

        br.close();
        fr.close();
    }
}
