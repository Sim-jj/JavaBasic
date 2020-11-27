package simjj;

// 제네릭Generic
// 데이터 유형을 일반화(통일) 한다는 것을 의미
// 여러 유형의 데이터를 사용하는 클래스의 경우 매개변수의 유형을 Object 로 선언하는 경우
// 경우에 따라 원래의 유형으로 변환해야하는 번거로움이 존재하고 오류가 발생할 수 있는 가능성 존재

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        // 동물원 생성
        Object[] zoo = new Object[10];

        // 동물들을 동물원 우리에 가둠
        // 이반적으로 배열은 동일한 유형의 자료들을 저장하는 자료구조
        // 하지만, 배열의 유형을 Object로 선언하면 온갖 종류의 데이터들을 저장할 수 있음
        zoo[0] = new Tiger(); // upcasting 적용, Object는 모든 클래스의 조상이기 때문에 업캐스팅이 가능하다
        zoo[1] = new Lion();
        zoo[2] = new Zebra();

        // 우리에서 동물을 하나나씩 빼냄
        // 하지만, 배열에 저장된 데이터를 빼낼때는 적절한 형변환이 필요함
        // Tger t1 = zoo[0]; // 타입 불일치로 오류! zoo는 Object 타입이기 때문에 바로 다운캐스팅이 되지 않고 Tiger형을 기재하여 다운캐스팅을 해줘야함
        Tiger t1 = (Tiger) zoo[0]; // downcasting

        // Lion l1 = zoo[1];
        Lion l1 = (Lion) zoo[1];

        // Zebra z1 =  zoo[2];
        Zebra z1 = (Zebra) zoo[2];

        // 컬렉션 프레임워크
        // 다수의 데이터를 쉽고 효과적으로 처리할 수 있도록 표준화 방법을 제공하는 클래스
        // 데이터를 저장하는 자료구조와 처리하는 각종 알고리즘을 구조화하여 클래스로 구현한 것
        // 동적배열, 집합, 해시맵, 트리, 큐

        ArrayList zoo2 =  new ArrayList();
        // 컬렉션 프레임워크에서 제공하는 동적배열
        // 동적배열의 자료형은 기본적으로 Object

        // 동물원 우리에 동물 넣기
        zoo2.add(new Tiger()); // .add 데이터를 추가하는 메소드
        zoo2.add(new Lion());
        zoo2.add(new Zebra());

        // t1 = zoo2.get(0);
        // 동적배열을 사용했지만 앞의 경우와 동일하게 형변환시 오류발생!

        // 제네릭을 이용하면 데이터의 타입을 통일시켜 컴파일시 타입체크 오류방지와 불필요한 형변환을 없앨 수 있음
        // type-parameter (<>,기호) 를 이용해서 자료구조의 데이터유형을 미리 설정해 둠

        ArrayList<Tiger> zoo3 = new ArrayList<>(); // 이 arraylist는 tiger형의 데이터를 넣을 수 있다 라는 의미므로, Lione과 Zebra는 넣을 수 없다
        zoo3.add(new Tiger());
        zoo3.add(new Tiger());
        // zoo3.add(new Lion()); // 오류 발생!

        t1 = zoo3.get(0);
        // 자동으로 형변환 되기 때문에 오류없이 처리가능!

        ArrayList<Lion> zoo4 = new ArrayList<>();

        zoo4.add(new Lion());
        zoo4.add(new Lion());
        zoo4.add(new Lion());

        l1 = zoo4.get(0);

        // 각각 동물별 우리를 만들어야 하는 불편함이 있다.
   }
}

class Tiger {
}

class Lion {
}

class Zebra {
}