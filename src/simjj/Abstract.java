package simjj;

// 추상 메서드 : 메서드의 선언부만 있고 몸체가 없는 메서드
// 메서드의 몸체는 이것을 상속하는 자식클래스에서 정의함

import javafx.animation.Animation;

// 따라서, 추상클래스는 불완전 클래스 이므로
// 객체화 할 수 없음
// 추상메서드나 추상 클래스는 abstract라는 키워드 사용
public class Abstract {
    public static void main(String[] args) {
        Cat2 cat = new Cat2();
        System.out.println(cat.cry());

        Dog2 dog = new Dog2();
        System.out.println();
        System.out.println(dog.cry());

    }
}

abstract class Animal2 {
    protected int weight;

    abstract String cry(); // 추상메서드
}

class Cat2 extends Animal2 { // 추상클래스를 상속한 경우는 추상클래스의 메서드를 꼭 사용해야한다

    @Override
    String cry() {
        return "야옹";
    }
}

class Dog2 extends Animal2 {

    @Override
    String cry() { return "멍멍"; }
}