package simjj;

import java.util.Scanner;

/**
 * 파일명 : sungJukV9Main
 * 작성일 : 2020.11.27
 *
 * 프로그램 설명: 성적처리프로그램 v9
 * 성적처리 프로그램에 저장기능을 추가함
 * 즉, Sungjuk.dat라는 파일을 생성해서 입력한 성적데이터를 여기에 저장해 둠
 *
 * SungJukService : readSungJuk, showSungJuk(전체목록), showOneSungJuk,
 *                  modifySungJuk, removeSungJuk, computerSungJunk,
 *                  displayMenu
 *
 */

public class SungJukV9Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukV9Service sjsrv = new SungJukV9Service();
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
