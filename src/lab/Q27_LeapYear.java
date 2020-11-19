package lab;

import java.util.Scanner;

/**
 * 다음 조건을 이용해서 현재 연도를 입력하면 윤년 여부를
 * 출력하는 프로그램을 작성하세요. (LeapYear)
 *
 * 가. 현재 연도가 4로 나눠 떨어지지만, 100으로는 나눠 떨어지지 않음
 *
 * 나. 현재 연도가 400으로 나눠 떨어짐
 */
public class Q27_LeapYear {
    public static void main(String[] args) {
        int year = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("윤년 여부 확인");
        System.out.println("검색할 년도를 입력하세요 (숫자만)");
        year = sc.nextInt();

        if(year%4 == 0 & year%100!=0 || year%400==0){
            System.out.printf("%d는 윤년입니다",year);
        }else System.out.printf("%d는 윤년이 아닙니다.",year);
    }

}
