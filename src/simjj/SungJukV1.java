package simjj;

import java.util.Scanner;

/**
 * 파일명 : sungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리프로그램 v1
 * 이름,국어,영어,수학점수를 설정하면
 * 총점,평균,학점을 계산하고 결과출력
 * name,kor,eng,mat,sum,mean(평균),grd(학점)
 * 학점기준은 수우미양가로 함
 * 만점은 100점으로, 10점단위로 학점을 평가
 * 100~90,89~80,79~70,69~60,59~50
 *
 * 삼항연산자 : (조건식)? 참일때 처리 : 거짓일때 처리
 */
public class SungJukV1 {
    public static void main(String[] args) {
        // 변수선언
        String name = "재선";
        int kor = 99;
        int eng = 98;
        int mat = 99;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';

        //처리
        sum =  kor + eng + mat;
        mean = (double)sum / 3; // (kor + eng + mat)/3 해도댐 ,정수로 나누면 각납처가 더블형이도 인트형으로 저장된다
        //삼항연산자
        grd = (mean >= 90) ? '수':
              (mean >= 80) ? '우':
              (mean >= 70) ? '미':
              (mean >= 60) ? '양': '가';

        //결과 출력
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("--------------");
        System.out.println("총점 : " + sum);
        System.out.format("평균 : %2f \n",mean); //소수점 2자릿수까지만 표현하고 싶기 때문에
        System.out.println("학점 : " + grd);
    }
}