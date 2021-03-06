package simjj;

import java.util.Scanner;

/**
 * 파일명 : sungJukV4
 * 작성일 : 2020.11.18
 *
 * 프로그램 설명: 성적처리프로그램 v4
 * 학생 3명의 성적데이터를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과출력
 *
 * 단,평균은 소수점 첫째 자리까지 출력하고
 * 학점기준은 수우미양가로 하되, switch문으로 학점을 계산하도록 함
 * 만점은 100점으로, 10점단위로 학점을 평가
 * 100~90,89~80,79~70,69~60,59~50
 * name,kor,eng,mat,sum,mean(평균),grd(학점)
 *
 *단, 성적처리 결과 출력시 출력문을 하나만 사용하기로 함
 * 코드의 가독성과 유지보수를 용이하게 하기 위해
 * 메서드 기반 코드로 재작성
 *
 */
public class SungJukV4 {
    public static void main(String[] args) {
        // 배열 변수선언
        //자료형[] 변수명([]) = new 자료형[크기]
        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];
        int sum[] = new int[3];
        double mean[] = new double[3];
        char grd[] = new char[3];

        readSungJuk(name,kor,eng,mat); //데이터 입력받는 메서드 , 배열일 경우엔 배열명만 넘겨준다
        computerSungJuk(name,kor,eng,mat,sum,mean,grd); //총점,평균,학점을 계산하는 메서드
        printSungJuk(name,kor,eng,mat,sum,mean,grd); //출력하는 메서드

    } // main

    // 성적 데이터 입력 받기 : readSungJuk
    public static void readSungJuk(String[] name, int[] kor, int[] eng, int[] mat){ //배열을 매개변수로 줄때는 값을 하나하나 주는 것이 아닌 통째로 준다
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++) { //실질적으로 메인메소드에 정의한 배열에 값이 저장된다

            System.out.println((i+1) + "번째 학생 성적 입력중..");

            System.out.print("이름을 입력하세요 : "); //print->는 줄바꿈을 안한다
            name[i] = sc.nextLine(); //nextLine();-> 문자열 입력 받을때

            System.out.print("국어 점수를 입력하세요 : ");
            kor[i] = sc.nextInt(); //nextInt();-> 정수형 입력 받을때 (참고 실수형은 nextDouble();)

            System.out.print("영어 점수를 입력하세요 : ");
            eng[i] = sc.nextInt();

            System.out.print("수학 점수를 입력하세요 : ");
            mat[i] = sc.nextInt();


            sc.skip("\r\n|[\n\r]"); //엔터키 문자를 무시한다는 의미
        }
    }// readSungJuk

    // 성적 데이터 총점,평균,학점 처리 : computerSungJuk
    public static void computerSungJuk(
            String[] name, int[] kor, int[] eng, int[] mat,int[] sum,
            double[] mean, char[] grd){

        for(int i=0; i<mean.length;i++){
            sum[i] = kor[i] + eng[i] + mat[i];
            mean[i] = (double) sum[i] / 3; // (kor + eng + mat)/3 해도댐 ,정수로 나누면 각납처가 double형이도 int형으로 저장된다

            switch((int)(mean[i]/10)) { //평균을 10으로 나누었을때 10,9,8...으로 떨어지기때문에(int형은 소수점이 생길경우 다 버린다/예를들어 9.8일경우 9)
                // ,mean이 실수형이기 때문에 int으로 캐스트하여 계산을 해준다
                case 10 :  //간단한 경우 는 왠만하면 한줄로 코딩하는게 좋다 10,9는 같은 처리를 하기 때문에 9: 부분에만 처리값을 넣어줌
                case 9 : grd[i] = '수'; break;
                case 8 : grd[i] = '우'; break;
                case 7 : grd[i] = '미'; break;
                case 6 : grd[i] = '양'; break;
                default: grd[i] = '가';
            }
        }
    }// computerSungJuk

    // 처리 결과 출력 : printSungJuk
    public static void printSungJuk(
            String[] name, int[] kor, int[] eng, int[] mat,int[] sum,
            double[] mean, char[] grd){
        // fmt를 메인메소드에서 받아와도 되지만, 이것은 출력에만 특화된 변수이기 때문에 메서드 안에
        // 선언해주는게 좋다
        String fmt =
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총점: %d\n평균: %.2f\n학점: %c\n";

        for(int i=0;i<grd.length;i++){
            System.out.println((i+1) + "번째 학생 성적 데이터 출력");
            System.out.printf(fmt,name[i],kor[i],eng[i],mat[i],sum[i],mean[i],grd[i]);
        }
    }// printSungJuk

} // class