package lab;

import java.util.Scanner;

/**
 * 30. 다음 조건에 따라 숫자 맞추기 프로그램을 작성해보세요. (CatchNumber)
 *
 * 가. 사용자로부터 1 - 100사이의 숫자를 입력 받으세요 (num1)
 *
 * 나. 변수에 임의의 숫자 3자리를 초기화합니다 (num2)
 *
 * 다.  num1이 num2보다 크면 “추측한 숫자가 큽니다”라고 출력하세요
 *
 * 라.  num1이 num2보다 작으면 “추측한 숫자가 작습니다”라고 출력하세요
 *
 * 마.  num1과 num2가 같으면 “빙고! 숫자를 맞췄습니다”라고 출력하고 종료
 */
public class Q30_CatchNum {
    public static void main(String[] args) {
        int num1 = 0;
        int[] num2 = {30,80,90};

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 맞추기~!");

        for(int i=0; i<num2.length; i++) {
                System.out.println("숫자를 입력해주세요(1~100사이로 입력해주세요");
                num1 = sc.nextInt();

                if (num1 > num2[i]) {
                    System.out.println("추측한 숫자가 큽니다!");
                } else if (num1 < num2[i]) {
                    System.out.println("추측한 숫자가 작습니다!");
                } else if (num1 == num2[i]) {
                    System.out.println("빙고! 숫자를 맞췄습니다!");
                    break;
                }
            }
        }
    }

