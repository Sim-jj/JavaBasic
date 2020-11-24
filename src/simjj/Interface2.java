package simjj;

// 인터페이스는 대상을 바라보는 관점으로 설명할 수 있음
// 1. 식당에서 한끼를 해결 하려는 손님 입장에서 "불닭 돈까스"는 하나의 메뉴임
// => 단순한 정보일 뿐 복잡한 정보는 필요없음

// 2. 식당에서 요리하는 요리사 입장에서 "불닭 돈까스"는 하나의 음식임
// => 요리이므로 복잡한 정보가 필요함

//3. 식당에서 고객과 요리를 관리하는 주인의 입장에서 "불닭 돈까스"는 하나의 상품임
// => 하나의 사업이므로 식당운영에 필요한 정보 필요

// 같은 대상이라도 자신의 입장에서 바라보는 시선이 다름
// => 프로그래밍 세계에서는 특정 대상에 대해 누구나 동일한 시선을 제공해야 할 필요가 있음
// => 인터페이스를 강제 할 수 있음

// 대부분의 음식점에서 "불닭 돈까스"를 요리하고 있음
// 하지만, 요리사의 역량에 따라 기본은 지켜가면서
// 제각각의 결과물을 만들어 냄
// 어느 음식점을 가더라도 조금의 차이는 존재하지만 "불닭 돈까스"라는 음식은 비슷하게 만들어 내고 있음

// 기본base클래스
// 인터페이스를 구현하면 자식클래스에 추상메서드를 반드시 재정의 해야함
// 만일, 재정의 하고 싶지 않거나, 재정의할 필요가 없는데도 재정의해야하는 불편함이 존재할 수 있음
// => 이럴 경우 추상클래스를 통해 임의로 구현한 다음 이 추상클래스를 상속해서 클래스를 만드는 것이 편리함
// 이때 만든 클래스를 기본클래스라 함

// 실질적인 예
// github.com/javaee/servlet-spec
// src/main -> java/javax/servlet -> Servlet.java
// src/main -> java/javax/servlet -> GenericServlet.java => 인터페이스와 추상클래스 상속 관련 소스들
// src/main -> java/javax/servlet/http -> HttpServlet.java  =>

public class Interface2 {
    public static void main(String[] args) {
        Cat4 cat4 = new Cat4();
        Dog4 dog4 = new Dog4();

        System.out.println(cat4.cry());
        System.out.println(dog4.cry());
    }
}

class Animal4 {
    protected int height;
    protected int weight;
}

interface Animal4Action {
    String cry();
}

abstract class Animal4Base extends Animal4 implements Animal4Action { //base 클래스

    @Override
    public String cry() { return "동물이 운다"; }
}

class Cat4 extends Animal4Base { } // base클래스에서 정의된 cry메소드 그대로 cat4 클래스 에서 사용할 수 있다. (출력값은 재정의를 하지 않았기 때문에 추상클래스에서 정의한 내용이 된다

class Dog4 extends Animal4Base{
    @Override
    public String cry() { // base클래스 에서 정의한 cry메소드를 Dog4클래스 에서 재정의 했기 때문에 메인메소드 에서 출력 값은 "멍멍!" 이 된다
        return "멍멍!";
    }
}

