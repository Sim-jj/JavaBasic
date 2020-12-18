package simjj.CODP;

import java.util.Scanner;

// 메인클래스
public class CODPMain {
    public static void main(String[] args) {
        CODPService codp = new CODPService();
        Scanner sc = new Scanner(System.in);

        while (true){
            int num = 0;

            codp.display();
            num = sc.nextInt();

            switch (num){
                case 1 : codp.readCODP(); break;
                case 2 : codp.readSOE(); break;
                case 0 : System.exit(0); break;
                default :
                    System.out.println("잘못입력 하셨습니다! 다시 입력하세요!"); break;
            }
        }

    }
}
