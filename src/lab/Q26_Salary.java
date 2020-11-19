package lab;

import java.util.Scanner;

/**
 * 사용자가 연봉과 결혼 여부를 입력하면 다음의 세금율에 의해 납부해야
 * 할 세금을 계산하는 프로그램을 작성하세요 (Tax)
 *
 * 가. 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%
 *
 * 나. 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%
 */
public class Q26_Salary {
    public static void main(String[] args) {

        int tax = 0;
        int marry = 0;
        int salary = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("사용자의 연봉을 입력해주세요 (천만원단위로 숫자만 입력)");
        salary = sc.nextInt();

        System.out.println("사용자의 결혼여부를 입력해주세요 *미혼이면 0,결혼했을시 1(숫자만)");
        marry = sc.nextInt();

        if(marry == 0 & salary<3000){
            tax = salary * 10 / 100;
        }else if(marry == 0 & salary>3000){
            tax = salary * 25 / 100;
        }else if(marry == 1 & salary<6000){
            tax = salary * 15 / 100;
        }else if(marry == 1 & salary>6000){
            tax = salary * 35 / 100;
        }
        System.out.printf("당신의 연봉은 %d만원 이며, 납부해야될 세금액은 : %d만원 입니다.",salary,tax);
    }
}
