package simjj;

// 캡슐화
// 클래스와 멤버변수 선언시 정보의 은닉정도를 부여
// 정보은닉 : 사용자가 굳이 알 필요가 없는 정보는 사용자로부터 숨겨야 한다는 개념
// 최소한의 정보만으로 보안과 보호를 구현 할 수 있음

// 자바에서 지원하는 4가지 접근 제한자
// public(모든곳에서 접근가능/공개정도가 가장큼) > default > protected(상속관계에서 나랑 관련있는 클래스만 보여주고 아니면 안보여준다) > private

public class CapsulLation {
    public static void main(String[] args) {
        Person2 p = new Person2();

        //p.name = "홍길동"; // 바로 값을 넣는것은 좋지않다. 접근제한자가 private인 경우에 메인메소드에서 직접대입할 수 없음
        // 캡슐화를 적용하지 않은 코딩(비추!!!)
        // private 선언된 멤버변수는 객체명.변수명으로 값을 대입하거나 읽어서 출력할 수 없음

        p.setName("홍길동");
        System.out.println(p.getName());
    }
}

class Person2 {
    // 멤버변수 선언 시캡슐화 적용하려면 접근제한자를 private 으로 사용
    private String name;
    private String job;
    private int age;
    private String gender;
    private String blood;

    // 기본 생성자

    // setter/getter 메서드
    // *setter
    // public void setXxx(매개변수) {
    //      this.변수 = 매개변수;
    //      }
    // *getter
    // public 반환값 getXxx(){
    //          return 변수;
    //      }

    public void setName(String name) {
        this.name = name;
    }

    public java.lang.String getName() {
        return name;
    }
}
// 자바 빈즈Beans : 식별가능하고, 재사용성이 높은 소프트웨어를 만들기위한 기본 규칙
// 멤버변수는 반드시 private으로 선언
// 기본생성자가 있어야함
// setter/getter 메서드가 정의되어야 함