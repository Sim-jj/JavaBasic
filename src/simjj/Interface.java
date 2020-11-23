package simjj;

// 인터페이스
// 추상 메서드와 상수만으로 구성된 특수한 클래스
// 어떤 클래스를 만들때 추상메서드를 통해
// 기본이 되는 틀을 제공하여 규칙에 맞춰 코드를 짤수 있게 해줌 => 접근제한자가 public
// 클래스오는 달리 다중상속을 지원함

// 인터페이스 작성시 interface를 사용
// 인터페이스 구현할때는 implements를 사용

public class Interface {
    public static void main(String[] args) {
        Cat3 cat = new Cat3();
        Dog3 dog = new Dog3();

        System.out.println(cat.cry());
        System.out.println(dog.cry());
    }
}

class Animal3 {
    protected int weight;
    protected int height;
}

interface Animal3Action {
    // public static String COLOR = "brown"; -> 이렇게도 쓸 수 있고
    // static String COLOR = "brown"; -> 이렇게도 쓸 수 있고
    String COLOR = "brown"; // -> 이렇게도 쓸 수 있다 (인터페이스 안에는 상수로만으로 구성되기 때문에 자동적으로 public static가 붙여져 있다)

    // public abstract String cry(); -> 이렇게도 쓸 수 있고
    // abstract String cry(); -> 이렇게도 쓸 수 있고
    String cry(); // -> 이렇게도 쓸 수 있다 (인터페이스 안에는 추상메서드만으로 구성되기 때문에 자동적으로 public abstract가 붙여져 있다)
}

class Cat3 extends Animal3 implements Animal3Action{ // Animal3를 상속받고, Animal3Action 인터페이스 클래스도 상속받아 사용할 수 있다
    @Override
    public String cry() { return "야옹~ 야옹"; }
}

class Dog3 extends Animal3 implements Animal3Action {

    @Override
    public String cry() { return "멍! 멍!!!"; }
}

class Murloc extends Animal3 implements Animal3Action{

    @Override
    public String cry() { return "아훓훓훓~"; }
}