package simjj;

import java.util.Scanner;

/**
 * 파일명 : sungJukV8Main
 * 작성일 : 2020.11.26
 *
 * 프로그램 설명: 성적처리프로그램 v8
 * 성적처리 프로그램을 체계적으로 만들려고 함
 * 객체지향 기법을 토대로 CRUD기능을 제공하도록 작성
 * 성적 데이터 입력/조회/수정/삭제 메뉴를 제공해서
 * 프로그램의 사용성을 높임임
 * 즉, 입력받은 성적데이터는 동적배열에 저장하고 저장된 성적데이터를 조회하거나 수정,삭제할 수 있도록 함
 *
 * SungJukService : readSungJuk, showSungJuk(전체목록), showOneSungJuk,
 *                  modifySungJuk, removeSungJuk, computerSungJunk,
 *                  displayMenu
 *
 */

public class SungJukV8Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukV8Service sjsrv = new SungJukV8Service();
        int menu = 0;

        while (true) { //메뉴를 띄우고 작업번호 입력을 반복
            sjsrv.displayMenu();
            menu = sc.nextInt();
            switch (menu) {
                case 1: sjsrv.newSungJuk(); break;
                case 2: sjsrv.readSungJuk(); break;
                case 3: sjsrv.readOneSungJuk(); break;
                case 4: break;
                case 5: break;
                case 0: System.exit(0); break; // 프로그램을 종료한다는 의미
                default:
                    System.out.println("잘못 입력하셨으니 다시 입력해 주세요"); // 숫자가 아닌 문자가 입력되었을시
            }
        }
    }
}
