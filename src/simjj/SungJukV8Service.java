package simjj;

import simjj.SungJuk.SungJukVO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * SungJukV8Service
 * 성적처리 추상클래스(SungJukV8GenericService)를 상속해서 만든 클래스
 */
public class SungJukV8Service extends SungJukV8GenericService {

    // 멤버변수 선언
    // 입력받은 모든 성적데이터를 저장하는 독적배열 변수 선언
    List<SungJukVO> sjData = new ArrayList<>(); // SungJukVO클래스에 저장할 멤버변수들이 저장되어 있기 때문에

    // 입력받은 성적데이터를 저장하는 변수
    SungJukVO sj = null;

    /**
     * 이름과 국/영/수 성적데이터를 입력받아 총점,평균,학점을 계산한 뒤 동적배열에 추가함
     */
    @Override
    public void newSungJuk() {
        String name;
        int kor, eng, mat;

        System.out.print("이름을 입력하세요 : "); //print->는 줄바꿈을 안한다
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine(); //nextLine();-> 문자열 입력 받을때

        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt(); //nextInt();-> 정수형 입력 받을때 (참고 실수형은 nextDouble();)

        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();

        // 입력받은 성적데이터를 동적배열에 저장
        sj = new SungJukVO(name, kor, eng, mat);

        // 총점,평균 학점을 계산하는 성적처리
        computerSungJuk(sj);

        // 처리된 성적데이터를 동적배열에 저장
        sjData.add(sj);
    }

    /**
     * 저장된 성적 데이터들 중에서
     * 이름,국어,영어,수학만 뽑아서 리스트형태로 출력
     */
    @Override
    public void readSungJuk() {
        String fmt = "이름: %s, 국어: %d, 영어: %d, 수학: %d  \n";

        // 동적배열에 저장된 데이터들을 출력하기 위해 각 요소를 순회
        Iterator<SungJukVO> iter = sjData.iterator();
        while(iter.hasNext()){
           SungJukVO sj =  iter.next(); // 이름,국어,영어,수학 데이터를 출력해야되기 때문에 SungJukVO형을 만들어준다(데이터 관리를 VO에서 하기 때문)
            System.out.printf(fmt,sj.getName(),sj.getKor(),sj.getEng(),sj.getMat()); // fmt를 설정하여서 출력해도 되지만 스트링빌더를 객체화하여 append메소드로도 해본다
            /*StringBuilder st = new StringBuilder();
            st.append(sj.getName())
              .append(sj.getKor())
              .append(sj.getKor())
              .append(sj.getKor())
              .append(sj.getKor())*/
        }
    }

    /**
     * 상세 조회할 학생이름을 입력받아 이름,국어,영어,수학,총점,평균,학점을 출력
     */
    @Override
    public void readOneSungJuk() {
        String fmt = "이름: %s, 국어: %d, 영어: %d, 수학: %d\n총점: %.1f, 평균: %d, 학점: %s,";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 학생이름은? ");
        String name = sc.nextLine();

        // 입력받은 이름으로 데이터 검색 후 결과 출력
        for(SungJukVO sj : sjData) {
            if(sj.getName().equals((name))){
                System.out.printf(fmt, sj.getName(),sj.getKor(),sj.getEng(),
                                  sj.getMat(),sj.getSum(),sj.getMean(),sj.getGrd());
                break;
            }

        }

    }

    /**
     * 성적 처리 프로그램의 메뉴 출력 기능
     * 인터페이스에서 구현해도 되나, 값이 변하거나 그런 처리는 하지 않기 때문에 현재 클래스에서 정의해도 무방하다
     */
    public void displayMenu() {
        StringBuilder sb = new StringBuilder(); // + 연산자를 이용하면 메모리를 많이 잡아 먹기때문에 StringBuilder를 객체화 시켜
        // .append 메서드를 사용하여 문자를 이어준다.
        sb.append("-------------------\n")
                .append("성적 처리프로그램 v8\n")
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

    public void computerSungJuk(SungJukVO sj) {
        sj.setSum(sj.getKor() + sj.getEng() + sj.getMat()); // sum에 kor,eng,mat 합한 데이터를 셋팅해야하므로  sum은 setter를
        // kor,eng,mat는 입력받은 데이터를 불러와야 하므로 getter를 이용해서 불러온다
        sj.setMean((double) sj.getSum() / 3);

        switch ((int) (sj.getMean() / 10)) { //평균을 10으로 나누었을때 10,9,8...으로 떨어지기때문에(int형은 소수점이 생길경우 다 버린다/예를들어 9.8일경우 9)
            // ,mean이 실수형이기 때문에 int으로 캐스트하여 계산을 해준다
            case 10:
            case 9: sj.setGrd('수'); break;
            case 8: sj.setGrd('우'); break;
            case 7: sj.setGrd('미'); break;
            case 6: sj.setGrd('양'); break;
            default: sj.setGrd('가');
        }
    }
}
