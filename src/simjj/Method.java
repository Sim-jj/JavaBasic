package simjj;

/**
        * 파일명 : sungJukV4
        * 작성일 : 2020.11.18
        *
        * 프로그램 설명: 성적처리프로그램 v4
        * 학생 3명의 성적데이터를 키보드로 입력받아
        * 총점,평균,학점을 계산하고 결과출력
        *
        * 단,평균은 소수점 첫째 자리까지 출력하고
        * 학점기준은 수우미양가로 하되, switch문으로 학점을 계산하도록 함
        * 만점은 100점으로, 10점단위로 학점을 평가
        * 100~90,89~80,79~70,69~60,59~50
        * name,kor,eng,mat,sum,mean(평균),grd(학점)
        *
        *단, 성적처리 결과 출력시 출력문을 하나만 사용하기로 함
        *
        *성적처리 기능을 구현함으로써 코드가 길어지고 내용파악이 어려워지는 것을 방지하기 위해
        *함수(메서드)로 재정의해서 코드를 개선함
        *
*/

public class Method {
    // *메서드
    // 특정 작업을 수행 하기 위해 작성한 명령어들의 집합(묶음)
    // C언어의 함수와 비슷한 성격을 가지는 프로그래밍 요소
    // 입력값을 통해 무언가를 하고 그 결과를 도출하는 수학의 함수(블랙박스)와 비슷한 개념

    // *메서즈의 목적
    // 프로그램을 작성하다 보면 반복적으로 쓰인 코드를 종종 보는데, 효율적으로 작성하려면 반복문으로
    // 처리하면 되지만, 만일, 반복문이 반복된다면? 메서드를 적용하면 기능별로 모듈화를 적용 할 수 있기
    // 때문에 프로그램의 가독성이 좋아지고, 협업시에도 유용하며, 기능변경시 유지보수에도 좋음

    // *메서즈 정의
    // 접근제한자 리턴값 메서드이름(타입 매개변수명){
    //          메서드 몸체
    // }
    public static void main(String[] args) {
        // 헬로, 월드! 메세지 출력
        //System.out.println("hello,world!");

        // 헬로, 월드! 메세지 3번출력
        //System.out.println("hello,world!");
        //System.out.println("hello,world!");
        //System.out.println("hello,world!");

        // 헬로, 월드! 메세지 3번출력(반복문)
       /* for(int i=0; i<3; i++){
            System.out.println("hello,world!");
        }*/

        // 헬로, 월드! 메세지 3번출력을 3번반복
        /*for(int i=0; i<3; i++){
            System.out.println("hello,world!");
        }
        for(int i=0; i<3; i++){
            System.out.println("hello,world!");
        }
        for(int i=0; i<3; i++){
            System.out.println("hello,world!");
        }*/

        // 헬로, 월드! 메세지 3번출력을 3번반복하는 코드에서 메세지 변경함 : Hello,Java!
        // hello, world!를 hello, Java!로 바꿈

        // 인사말 출력 메서드 호출(call)
        sayhello();
        System.out.println("---------------------");
        sayHello2();
        System.out.println("---------------------");
        sayHello3("Hello, Android!");
        System.out.println("---------------------");
        String result = sayHello4("안녕하세요, 세상아!"); // 메서드에서 보낸 리턴값을 메인메소드에서 받아(변수에 각납)하여
        System.out.println(result); // 변수를 지정해 출력
        System.out.println("---------------------");
        computerNum(8,10);
        System.out.println("---------------------");
        computerAllsum(5,1);

    }
    // 간단한 인사말 출력 메서드
    // public : 접근제한자, 외부 클래스의 메서드를 사용허가여부 (어떤 클래스던지 이 메소드를 호출할 수 있다)
    // static : 정적 메서드 (나중에...) , 객체생성 없이 바로 사용가능 메서드
    // void : 메서드가 반환하는 값이 없음
    public static void sayhello(){ // 메서드 정의
        System.out.println("Hello,world!");
    }

    // 간단한 인사말을 3번 출력하는 메서드 : sayHello2
    public static void sayHello2() {
        for(int i=0; i<3; i++){
            System.out.println("Hello,world!");
        }
    }

    // 간단한 인사말을 출력하는 메서드 : sayHello3
    // 단, 인삿말은 언제든 변경하도록 재작성
    // 매개변수 : 메서드 처리시 필요로 하는 입력값
    public static void sayHello3(String msg) { // String msg -> 매개변수, 메인메소드에서
        // call할때 지정한 매개변수인 String값을 받아서 출력)
        System.out.println(msg);
    }

    // 간단한 인사말을 출력하는 메서드 : sayHello4
    // 단, 인삿말을 언제든 변경하도록 재작성
    // 단, 인삿말 출력을 메서드가 바로 하지 않고 인삿말 생성후 호출한 대상으로 넘김
    // return : 메서드내에서 처리한 값을 외부로 보내려면 return이라는 명령문 사용
    // return시 값의 type과 return type은 반드시 일치해야함
    public static String sayHello4(String name) {
        return name;
    }

    // 두개의 정수를 매개변수로 선언하고 사칙연산한 결과를 출력하는 메서드 : computerNum
    // ? + ? = ?
    // ? - ? = ?
    // ? × ? = ?
    // ? ÷ ? = ?
    public static void computerNum(int num, int num2){
        int sum = num + num2;
        int mid = num - num2;
        int mul = num * num2;
        int avg = num / num2;
        System.out.println( num + "과" + num2 + "의 합은 : " + sum );
        System.out.println( num + "과" + num2 + "의 빼기는 : " + mid );
        System.out.println( num + "과" + num2 + "의 곱하기는 : " + mul );
        System.out.println( num + "과" + num2 + "의 나누기는 : " + avg );
    }

    // 두개의 정수를 매개변수로 선언하고 두 정수를 범위로 설정해서 그것의
    // 모든 합을 구하고 출력하는  : computerAllsum
    // ex) 5, 1(매개변수) -> 1+2+3+4+5 = 15

    public static void computerAllsum(int num, int num2){
        int sum = 0;

        if(num<num2) {
            for(int i=0;num<=num2;i++){
                sum = num + (num+i);
            }
        }else if(num>num2){
            for(int i=0; num2<=num;i++){
                sum = num2 + (num2+i);
            }
        }
        System.out.println(sum);
    }

}
