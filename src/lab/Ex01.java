package lab;

public class Ex01 {
    public static void main(String[] args) {
        // 학생 클래스를 이용해서 객체 생성
        Student std = new Student();
        // 학과 클래스를 이용해서 객체 생성
        Department dept = new Department();
        // 과목 클래스를 이용해서 객체 생성
        Subject subj = new Subject();
        // 교수 클래스를 이용해서 객체 생성
        Professor pro = new Professor();

        // 각 객체에 대해 변수에 값 대입
        //학생
        std.stdNo = 201350050;
        std.name = "김태희";
        std.addr = "경기도고양시";
        std.birth = "1985.3.22";
        std.dept = "컴퓨터";
        std.pro = "504";
        //학과
        dept.dName = "컴퓨터공학";
        dept.phone = "123-4567-8901";
        dept.office= "E동 2층";
        dept.chief = "504";
        //과목
        subj.subNo = "0205";
        subj.subjName = "프로그래밍";
        subj.subjDesc = "자바 프로그래밍";
        subj.prof = "301";
        //교수
        pro.proNo = "0205";
        pro.proName = "이순신";
        pro.mjField = "프로그래밍";

        // 객체에 저장된 값 출력
        // 학생
        System.out.println("학번 : " + std.stdNo);
        System.out.println("이름 : " + std.name);
        System.out.println("주소 : " + std.addr);
        System.out.println("생년월일 : " + std.birth);
        System.out.println("학과명 : " + std.dept);
        System.out.println("교수 : " + std.pro);
        // 학과
        System.out.println();
        System.out.println("학과명 : " + dept.dName);
        System.out.println("전화번호 : " + dept.phone);
        System.out.println("사무실 위치 : " + dept.office);
        System.out.println("학과장 : " + dept.chief);
        // 과목
        System.out.println();
        System.out.println("과목번호 : " + subj.subNo);
        System.out.println("과목명 : " + subj.subjName);
        System.out.println("과목개요 : " + subj.subjDesc);
        System.out.println("담당교수 : " + subj.prof);
        // 교수
        System.out.println();
        System.out.println("교수번호 : " + pro.proNo);
        System.out.println("교수이름 : " + pro.proName);
        System.out.println("전공분야 : " + pro.mjField);
    }
}
