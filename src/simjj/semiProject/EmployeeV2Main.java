package simjj.semiProject;

import java.util.Scanner;

/**
 * EmployeeV1Main
 * 인사정보 관리프로그램 진입점
 */
public class EmployeeV2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeV2Service emsc = new EmployeeV2Service();

        while (true) {
            int num = 0;

            emsc.displayMenu2();
            num = sc.nextInt();

            switch (num){
                case 1 : emsc.newEmployee(); break;
                case 2 : emsc.readEmployee(); break;
                case 3 : emsc.readOneEmployee(); break;
                case 4 : break;
                case 5 : break;
                case 0 : System.exit(0); break;
                default :
                    System.out.println("잘못입력 하셨습니다! 다시 입력하세요!"); break;
            }
        }
    }
}