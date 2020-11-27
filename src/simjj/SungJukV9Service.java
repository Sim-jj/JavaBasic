package simjj;

import simjj.SungJuk.SungJukVO;
import simjj.SungJukV8Service;

import java.io.*;
import java.util.Scanner;


public class SungJukV9Service extends SungJukV8Service {

    private String fpath = "c:/Java/sungjuk.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    // 프로그램 최초시작시 파일에 저장된 모든 성적데이터를 List타입의 sjdata 변수에 저장
    public SungJukV9Service() {
        try {
            loadSungJuk(); // 게임시작시 로딩중...이런거
        } catch (IOException e) {
            System.out.println("성적데이터를 읽어오는 중 오류발생");
            e.printStackTrace();
        }
    }

    @Override
    public void displayMenu() {
        StringBuilder sb = new StringBuilder(); // + 연산자를 이용하면 메모리를 많이 잡아 먹기때문에 StringBuilder를 객체화 시켜
        // .append 메서드를 사용하여 문자를 이어준다.
        sb.append("-------------------\n")
                .append("성적 처리프로그램 v9\n")
                .append("-------------------\n")
                .append("1. 성적 데이터 입력\n")
                .append("2. 성적 데이터 조회\n")
                .append("3. 성적 데이터 상세조회\n")
                .append("4. 성적 데이터 수정\n")
                .append("5. 성적 데이터 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append(" 원하시는 작업은 ? [1,2,3,4,5,0]");
        System.out.print(sb);

    }

    /**
     * SungJukV8Service의 newSungJuk을 재정의
     */
    @Override
    public void newSungJuk() {

        // 성적데이터 입력받은 후 ArrayList 객체에 저장
        super.newSungJuk(); // v8 newSungJuk메서드 내용을 고대로 가져온다

        try {
            writeSungJuk(sj);
        } catch (IOException e) {
            System.out.println("파일 쓰기중 오류");
            e.printStackTrace();
        }
    }

    /**
     * writeSungJuk
     * 입력받은 성적데이터를 sungjuk.dat에 저장
     * 외부 노출할 필요없기 때문에 protected로 작성해준다
     */
    protected void writeSungJuk(SungJukVO sj) throws IOException { // 값이 저장되어 있는 SungJukVO에서 값을 가져와야 되므로 매개변수로서 받는다
        String fmt = "%s,%s,%s,%s,%s,%.1f,%s";

        // 파일 기록시 추가append 기능을 활성화시켜 중복저장이 가능하게 만듬
        fw = new FileWriter(fpath, true);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getSum(), sj.getMean(), sj.getGrd());
        // 데이터를 저장해야 되므로 SungJukVO에 저장되어있는 데이터를 꺼내기 위해 getter를 사용
        bw.write(data); // 데이터를 저장한 data를 .write메서드를 실행했을시 매개변수로 넘겨줌
        bw.newLine(); // 줄바꿈
        // FileWriter 클래스를 이용해서 파일에 데이터를 기록할때 다소 불편함
        // => PrintWriter 추천!

        bw.close();
        fw.close();
    }

    /**
     * loadSungJuk
     * 파일에 저장된 성적데이터를 List타입의 sjdata에 저장
     */
    protected void loadSungJuk() throws IOException { // 컴퓨터 파일로 저장된 데이터를 List타입에 저장
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while (br.ready()) { // .ready() 입력스트림이 사용할 준비가 되어있는지 확인 있으면 true 없으면 false를 반환
            String[] s = br.readLine().split(","); // split메서드를 사용하여 "," 문자를 기준으로 잘라 배열로 각납

            sj = new SungJukVO(s[0], // 자른 데이터를 SungJukVO에 저장(변수명: sj)
                    Integer.parseInt(s[1]), // int형,double형,char형은 형변환을 시켜줘야함
                    Integer.parseInt(s[2]),
                    Integer.parseInt(s[3]),
                    Integer.parseInt(s[4]),
                    Double.parseDouble(s[5]),
                    s[6].charAt(0));

            sjData.add(sj); // 데이터가 담긴 sj 정보를 sjData(List형/동적배열) 에 추가
        }
        br.close();
        fr.close();
    }
}
