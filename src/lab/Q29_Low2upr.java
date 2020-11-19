package lab;

import java.io.IOException;
import java.util.Scanner;

/**
 * 29. 사용자로부터 소문자를 입력 받아 대문자로 출력하는 프로그램을 작성해보세요.
 * 단, 소문자 이외의 숫자나 문자를 입력 받으면 “잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다. (UpperCase)
 */
public class Q29_Low2upr {
    public static void main(String[] args) throws IOException {
        int low;

        System.out.println("소문자를 입력하세요");
        low = System.in.read()-32;

       /* if()
        System.out.println(low);
*/
    }
}

