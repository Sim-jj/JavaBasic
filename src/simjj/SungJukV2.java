package simjj;

import java.util.Scanner;

/**
 * 파일명 : sungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리프로그램 v2b
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과출력
 *
 * 단,평균은 소수점 첫째 자리까지 출력하고
 * 학점기준은 수우미양가로 하되, switch문으로 학점을 계산하도록 함
 * 만점은 100점으로, 10점단위로 학점을 평가
 * 100~90,89~80,79~70,69~60,59~50
 * name,kor,eng,mat,sum,mean(평균),grd(학점)
 *
 *단, 성적처리 결과 출력시 출력문을 하나만 사용하기로 함
 * 그리고, Math.round(값)를 이용해서 평균은 소수점 둘째자리까지 출력
 */
public class SungJukV2 {
    public static void main(String[] args) {
        // 변수선언
        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';
        String fmt =
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총점: %d\n평균: %s\n학점: %c\n";
        String result;

        /*처리
        성적데이터를 키보드로 입력 받기위해
        Scanner 클래스 초기화*/

        System.out.print("이름을 입력하세요 : "); //print->는 줄바꿈을 안한다
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine(); //nextLine();-> 문자열 입력 받을때

        System.out.print("국어 점수를 입력하세요 : ");
        kor = sc.nextInt(); //nextInt();-> 정수형 입력 받을때 (참고 실수형은 nextDouble();)

        System.out.print("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        mat = sc.nextInt();

        //처리
        sum =  kor + eng + mat;
        mean = (double)sum / 3; // (kor + eng + mat)/3 해도댐 ,정수로 나누면 각납처가 double형이도 int형으로 저장된다

        switch((int)(mean/10)) { //평균을 10으로 나누었을때 10,9,8...으로 떨어지기때문에(int형은 소수점이 생길경우 다 버린다/예를들어 9.8일경우 9)
            // ,mean이 실수형이기 때문에 int으로 캐스트하여 계산을 해준다
            case 10 :  //간단한 경우 는 왠만하면 한줄로 코딩하는게 좋다 10,9는 같은 처리를 하기 때문에 9: 부분에만 처리값을 넣어줌
            case 9 : grd = '수'; break;
            case 8 : grd = '우'; break;
            case 7 : grd = '미'; break;
            case 6 : grd = '양'; break;
            default: grd = '가';
        }

        // Math.round(값) : 반올림 하는 메서드
        // 98765.4321 => round(반올림) => 98765
        // 98765.4321 * 100 => 9876543.21
        // round(9876543.21) => 9876543
        // 9876543 / 100 => 98765.43
        mean = Math.round(mean*100)/100.0; //나눌때 100.0으로해야지 실수형으로 출력된다 (100으로 하면 정수형으로만출력)
        
        //String.valueOf(값)->숫자를 문자로변환
        result = String.format(fmt, name,kor,eng,mat,sum,String.valueOf(mean),grd); //fmt 에 지정한 형식에대한 변수를 대입하여 값을 매치시킴

        //결과 출력
       /*
        System.out.printf("평균 : %.1f \n",mean); //소수점 1자릿수까지 표현
        System.out.println("평균 : " + mean);
        System.out.println("학점 : " + grd);
        System.out.println("이름 : " + name + "\n" +
                           "국어 : " + kor + "\n" +
                           "영어 : " + eng + "\n" +
                           "수학 : " + mat + "\n"); */
        //문자열 연결 연산자(+)로 문장을 만드는 경우
        //String 변수의 특성 때문에 성능 저하가 발생하게 된다

        System.out.println(result);
    }
}