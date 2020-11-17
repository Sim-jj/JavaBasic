package simjj;

import java.util.Scanner;

/**
 * 파일명 : sungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리프로그램 v2
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과출력
 *
 * 단,평균은 소수점 첫째 자리까지 출력하고
 * 학점기준은 수우미양가로 하되, switch문으로 학점을 계산하도록 함
 * 만점은 100점으로, 10점단위로 학점을 평가
 *  * 100~90,89~80,79~70,69~60,59~50
 * name,kor,eng,mat,sum,mean(평균),grd(학점)
 *
 *
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

        //값을 입력받음
        System.out.println("이름을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("국어 점수를 입력하세요");
        kor = scanner.nextInt();

        System.out.println("영어 점수를 입력하세요");
        eng = scanner.nextInt();

        System.out.println("수학 점수를 입력하세요");
        mat = scanner.nextInt();

        //처리
        sum =  kor + eng + mat;
        mean = (double)sum / 3; // (kor + eng + mat)/3 해도댐 ,정수로 나누면 각납처가 더블형이도 인트형으로 저장된다

        //switch문
        switch((int)mean/10){ //평균을 10으로 나누었을때 10,9,8...으로 떨어지기때문에,mean이 실수형이기 때문에 int으로 캐스트하여 계산을 해준다
            case 10 : grd = '수';
            break;
            case 9 : grd = '수';
            break;
            case 8 : grd = '우';
            break;
            case 7 : grd = '미';
            break;
            case 6 : grd = '양';
            break;
            default: grd = '가';
        }

        //결과 출력
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("--------------");
        System.out.println("총점 : " + sum);
        System.out.format("평균 : %.1f \n",mean); //소수점 1자릿수까지 표현
        System.out.println("학점 : " + grd);
    }
}