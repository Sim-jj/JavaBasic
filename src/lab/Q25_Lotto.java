package lab;

import java.util.Scanner;

/**
 * 프로그램명: 로또 프로그램
 *
 * 가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)
 *
 * 나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
 *
 * 다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
 *
 * 라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력
 */
public class Q25_Lotto {
    public static void main(String[] args) {
        int[] yourkey = new int[3];
        int[] lottokey = {20,30,40};
        int count = 0;

        Scanner sc = new Scanner(System.in);

        //복권 값 입력받기
        for(int i=0; i<yourkey.length; i++){
            System.out.println((i+1)+"번째 복권 숫자를 입력해주세요. (2자리수)");
            yourkey[i] = sc.nextInt();
        }

        //복권 당첨여부 확인
        for(int i=0; i<lottokey.length; i++){
            if(yourkey[i]==lottokey[i]){
                count++;
            }
        }

        //복권 당첨결과 확인
        if(count==3){
            System.out.println("축하합니다! 당첨되어 상금 1백만원을 지급합니다!");
        } else System.out.println("아쉽지만, 다음 기회를!");

        /*int yourkey = 0;
        int lottokey = 123;

        Scanner sc = new Scanner(System.in);

        System.out.println("복권 숫자 3자리를 입력하세요");
        yourkey = sc.nextInt();

        if(yourkey == lottokey) {
            System.out.println("축하합니다! 당첨되어 상금 1백만원을 지급합니다!");
        }else System.out.println("아쉽지만, 다음 기회를!");*/

    }
}
