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
 */
public class SungJukV1 {
    public static void main(String[] args) {

        String name = "심재선";
        String grd1 = "수", grd2 = "우", grd3 = "미", grd4 = "양", grd5 = "가";
        int kor = 98, eng = 99, mat = 99, sum;
        double mean;

        /*System.out.println("이름을 입력하세요");
        Scanner scanner = new Scanner(Syste.in);
        name = scanner.nextLine();

        System.out.println("국어 점수를 입력하세요");
        kor = scanner.nextInt();

        System.out.println("영어 점수를 입력하세요");
        eng = scanner.nextInt();

        System.out.println("수학 점수를 입력하세요");
        mat = scanner.nextInt();*/

        sum = kor + eng + mat;
        mean = (kor+eng+mat)/3;
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);

        System.out.println("-----------");

        System.out.println("총점 :" + sum);
        System.out.println("평균 :" + mean);

        if (mean >= 90 || mean <= 100) {
            System.out.println("학점은" + grd1 + "입니다");
        } else if (mean >= 80) {
            System.out.println("학점은" + grd2 + "입니다");
        } else if (mean >= 70) {
            System.out.println("학점은" + grd3 + "입니다");
        } else if (mean >= 60) {
            System.out.println("학점은" + grd4 + "입니다");
        } else System.out.println("학점은" + grd5 + "입니다");
    }
}