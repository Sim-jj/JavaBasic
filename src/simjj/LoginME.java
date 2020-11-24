package simjj;

import java.util.Scanner;

/**
 * 로그인 확인 프로그램
 * 0. 인증용 아이디와 비밀전호를 하나 생성해 둠
 *  => abc123, 987xyz
 * 1. Scanner로 아이디, 비밀번호를 입력받음
 * 2a. 아이디와 비밀번호가 틀리면 "가입되지 않은 아이디!"
 * 2b. 아이디만 맞으면 "비밀번호가 틀렸음!"
 * 2c. 아이디와 비밀번호가 맞으면 "로그인 성공!"
 *
 */
public class LoginME {
    public static void main(String[] args) {
        String uId = "abc123"; // 저장된 아이디
        String pwd = "987xyz"; // 저장된 비밀번호
        String myUid = ""; // 키보드로 입력받은 값을 저장할 변수
        String myPwd = ""; // 키보드로 입력받은 값을 저장할 변수

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("아이디는? ");
            myUid = sc.nextLine();
            System.out.println("비밀번호는? ");
            myPwd = sc.nextLine();

            if (!uId.equals(myUid) && !pwd.equals(myPwd)) { // 문자열 값을 비교하기 때문에 equals 메서드 사용
                System.out.println("가입되지 않은 아이디!");
            } else if (uId.equals(myUid) && !pwd.equals(myPwd)) {
                System.out.println("비밀번호가 틀렸음!");
            } else if (uId.equals(myUid) && pwd.equals(myPwd)) {
                System.out.println("로그인 성공!");
                break;
            }
        }
    } // main
} // class
