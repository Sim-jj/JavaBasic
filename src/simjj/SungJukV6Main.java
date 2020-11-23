package simjj;

/**
 * 파일명 : sungJukV6
 * 작성일 : 2020.11.23
 *
 * 프로그램 설명: 성적처리프로그램 v6
 * 중간고사와 기말고사 성적처리 프로그램을 만들려고 함
 * SungJukV1을 토대로 중간고사 성적과 기말고사 성적 클래스를
 * 상속을 이용해서 작성하세요
 *
 * 중간고사MidSungJuk : 국어kor,영어eng,수학nat
 * 기말고사FinalSungJuk : 국어, 영어,수학,미술art,과학sci
 * 성적처리 : computerSungJuk
 * 결과출력 : printSungJuk
 */
public class SungJukV6Main {
    public static void main(String[] args) {
        MidSungJuk mid = new MidSungJuk();
        FinalSungJuk fina = new FinalSungJuk();

        mid.computerSungJuk();
        mid.printSungJuk();

        fina.computerSungJuk();
        fina.printSungJuk();
    }

}

class MidSungJuk {
    String name = "재선";
    int kor = 99;
    int eng = 98;
    int mat = 99;
    int sum = 0;
    double mean = 0.0;
    char grd = '가';

    public MidSungJuk() {
    }

    public MidSungJuk(String name, int kor, int eng, int mat, int sum, double mean, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
    }

    protected void computerSungJuk () {
        sum =  kor + eng + mat;
        mean = (double)sum / 3; // (kor + eng + mat)/3 해도댐 ,정수로 나누면 각납처가 더블형이도 인트형으로 저장된다
        //삼항연산자
        grd = (mean >= 90) ? '수':
              (mean >= 80) ? '우':
              (mean >= 70) ? '미':
              (mean >= 60) ? '양': '가';
    }

    protected void printSungJuk () {
        System.out.println("중간고사 성적 결과");
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("--------------");
        System.out.println("총점 : " + sum);
        System.out.format("평균 : %.2f \n",mean); //소수점 2자릿수까지만 표현하고 싶기 때문에
        System.out.println("학점 : " + grd);
        System.out.println();
    }
}

class FinalSungJuk extends MidSungJuk {

    int art = 80, sci = 70;

    protected void computerSungJuk () {
        sum =  kor + eng + mat + art + sci;
        mean = (double)sum / 5; // (kor + eng + mat)/3 해도댐 ,정수로 나누면 각납처가 더블형이도 인트형으로 저장된다
        //삼항연산자
        grd = (mean >= 90) ? '수':
              (mean >= 80) ? '우':
              (mean >= 70) ? '미':
              (mean >= 60) ? '양': '가';
    }

    protected void printSungJuk () {
        System.out.println("기말고사 성적 결과");
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("미술 : " + art);
        System.out.println("과학 : " + sci);
        System.out.println("--------------");
        System.out.println("총점 : " + sum);
        System.out.format("평균 : %.2f \n",mean); //소수점 2자릿수까지만 표현하고 싶기 때문에
        System.out.println("학점 : " + grd);
    }

}
