package simjj.SungJuk;

import java.util.Scanner;

/**
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과출력
 *
 * 단,평균은 소수점 첫째 자리까지 출력하고
 * 학점기준은 수우미양가로 하되, switch문으로 학점을 계산하도록 함
 * 만점은 100점으로, 10점단위로 학점을 평가
 * 100~90,89~80,79~70,69~60,59~50
 * name,kor,eng,mat,sum,mean(평균),grd(학점)
 *
 */
public class SungJukService {
    // Service 클래스는 90% 메서드로만 구성되어 있다
    /**
     * 성적데이터 입력 메서드
     * @return 키보드로 입력받은 성적 데이터 SungJukVO로 보냄
     */
    public SungJukVO readSungJuk() { //SungJukVO 클래스를 리턴 하기 때문에 public SungJukVO 라고 함
        String name;
        int kor,eng,mat;

        System.out.print("이름을 입력하세요 : "); //print->는 줄바꿈을 안한다
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine(); //nextLine();-> 문자열 입력 받을때

        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt(); //nextInt();-> 정수형 입력 받을때 (참고 실수형은 nextDouble();)

        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();

        return new SungJukVO(name,kor,eng,mat,0,0,' '); //생성자 매개변수에 값을 넣음
        // 자바는 리턴값을 복수로 보낼 수 없음(아니면 다른타입의 리턴값을 복수로 보낼 수 없음)
        // 그러므로 클래스 자체를 리턴값으로 보내줘야 됨 Service 클래스는 처리 클래스 이고
        // setter, getter는 VO 클래스 이기 때문에 VO 클래스로 값을 보내줘야함
    } // readSungJuk

    /**
     * 입력받은 성적에 대해
     * 총점,평균,학점을 계산하는 메서드
     */
    public void computerSungJuk(SungJukVO sj){ // readSungJuk 메서드를 이용해서 값을 넣은
                                               // VO클래스를 그대로 매개변수로 받아야 하므로 SungJukVO sj(메인클래스에서 선언한)가 된다
                                               // 메인인클라스에서는 computerSungJuk 메소드를 호출할때 매개변수로써 (SungJukVO)sj를 준다

        sj.setSum(sj.getKor() + sj.getEng() + sj.getMat()); // sum에 kor,eng,mat 합한 데이터를 셋팅해야하므로  sum은 setter를
                                                            // kor,eng,mat는 입력받은 데이터를 불러와야 하므로 getter를 이용해서 불러온다
        sj.setMean((double)sj.getSum() / 3);

        switch((int)(sj.getMean()/10)) { //평균을 10으로 나누었을때 10,9,8...으로 떨어지기때문에(int형은 소수점이 생길경우 다 버린다/예를들어 9.8일경우 9)
            // ,mean이 실수형이기 때문에 int으로 캐스트하여 계산을 해준다
            case 10 :
            case 9 : sj.setGrd('수'); break;
            case 8 : sj.setGrd('우'); break;
            case 7 : sj.setGrd('미'); break;
            case 6 : sj.setGrd('양'); break;
            default: sj.setGrd('가');
        } // 참조형을 매개변수로 받아 셋터 겟터를 이용해 데이터를 수정하면 해당 매개변수 클래스에는 데이터가 변경됨
    } // computerSungJuk

    /**
     * 입력한 이름,국어,영어,수학과
     * 계산된 총점 평균 학점등을 출력하는 메서드
     */
    public void printSungJuk(SungJukVO sj){
        String fmt = // 처리의 대상이 되는 데이터이기 때문에 Service로 데리고옴
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총점: %d\n평균: %.1f\n학점: %c\n";
        String result; // 처리의 대상이 되는 데이터이기 때문에 Service로 데리고옴

        result = String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(),
                               sj.getMat(), sj.getSum(), sj.getMean(), sj.getGrd());

        System.out.println(result);
    } // printSungJuk
}
