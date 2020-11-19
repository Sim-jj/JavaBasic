package lab;

public class Ex01 {
    public static void main(String[] args) {
        // 학생 클래스를 이용해서 객체 생성
        Student kim = new Student();
        // 학과 클래스를 이용해서 객체 생성
        Subject kimSub = new Subject();
        // 과목 클래스를 이용해서 객체 생성
        MainSubject kimMainSub = new MainSubject();
        // 교수 클래스를 이용해서 객체 생성
        Professor lee = new Professor();

        // 각 객체에 대해 변수에 값 대입
        kim.stuNum = 201350050;
        kim.name = "김태희";
        kim.addres = "경기도고양시";
        kim.birth = "1985.3.22";
        kim.subject = "컴퓨터";
        kim.pro = 504;

        kimSub.subName = "컴퓨터공학";
        kimSub.phone = "123-4567-8901";
        kimSub.jobAdd = "E동 2층";
        kimSub.stuTop = 504;

        kimMainSub.subNum = 0205;
        kimMainSub.mainSubName = "프로그래밍";
        kimMainSub.summary = "자바 프로그래밍";
        kimMainSub.mainPro = 301;

        lee.proNum = 0205;
        lee.proName = "이순신";
        lee.chargeSub = "프로그래밍";

        // 객체에 저장된 값 출력
        System.out.println("학번 : " + kim.stuNum);
        System.out.println("이름 : " + kim.name);
        System.out.println("주소 : " + kim.addres);
        System.out.println("생년월일 : " + kim.birth);
        System.out.println("학과명 : " + kim.subject);
        System.out.println("교수 : " + kim.pro);

        System.out.println();
        System.out.println("학과명 : " + kimSub.subName);
        System.out.println("전화번호 : " + kimSub.phone);
        System.out.println("사무실 위치 : " + kimSub.jobAdd);
        System.out.println("학과장 : " + kimSub.stuTop);

        System.out.println();
        System.out.println("과목번호 : " + kimMainSub.subNum);
        System.out.println("과목명 : " + kimMainSub.mainSubName);
        System.out.println("과목개요 : " + kimMainSub.summary);
        System.out.println("담당교수 : " + kimMainSub.mainPro);

        System.out.println();
        System.out.println("교수번호 : " + lee.proNum);
        System.out.println("교수이름 : " + lee.proName);
        System.out.println("전공분야 : " + lee.chargeSub);
    }
}
