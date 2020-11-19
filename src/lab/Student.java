package lab;

public class Student {

    int stdNo; //수식으로 사용된다면 정수형 데이터형으로 해야한다
    String name;
    String addr;
    String birth;
    String dept;
    String pro; //int 형보다 String형으로 보관하는게 메모리를 덜 잡아먹어서

    // 기본 생성자
    public Student(){
        stdNo = 201250006;
        name = "송혜교";
        addr = "서울영등포구";
        birth = "1988.9.17";
        dept = "컴퓨터";
        pro = "301";

    }

    // 매개변수를 이용한 생성자
    public Student(int stdNo, String name, String addr, String birth, String dept, String pro){
        this.stdNo = stdNo;
        this.name = name;
        this.addr = addr;
        this.birth = birth;
        this.dept = dept;
        this.pro = pro;
    }
}