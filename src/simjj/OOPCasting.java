package simjj;

// 클래스/인터페이스 형변환
// 특정 객체가 자식클래스/ 인터페이스의 타입에서
// 부모클래스/인터페이스 타입 또는 반대로 형변환하는 것을 의미

public class OOPCasting {
    public static void main(String[] args) {
        Unit u1 = new Unit();
        Marine m1 = new Marine();
        Firebat f1 = new Firebat();

        u1.attack();
        m1.attack();
        f1.attack();

        Unit unit = new Marine(); // unit이 부모고 marine은 자식이기 때문에 자식이 부모로 형변환 하는것은 가능하다
        // Marine 객체는 자동으로 Unit 객체로 형변환
        // 이처럼 상속관계에 있는 클라스간의 객체 생성시 자식클래스 타입의 객체를 부모클래스 타입의 객체로
        // 선언하는 경우를 업캐스팅(upcasting) 이라고함
        unit.attack(); // 타입은 Unit 이지만 attack 메소드는 Marine 객체에서 재정의한 데이터가 출력된다

        //Marine m2 = (Marine) new Unit();
        // Unit 객체를 Marine  객체로 형변환 하려면 명시적 형변환 필요
        // 이처럼 상속관계에 있는 클래스간의 객체생성시 부모클래스타입의 객체를 자식클래스타입의 객체로
        // 선언하는 경우 다운캐스팅(downcasting) 이라함
        // 단, 컴파일시에는 오류가 나지 않지만 실행시 오류 발생!
        // 부모를 자식으로 형변환은 불가능하다
        // m2.attack();

        Marine m3 = (Marine) unit; // 위에서 Marine을 Unit으로 형변환을 했기 때문에 다운캐스팅이 가능한 것!
        // Unit 객체변수를 Marine 객체로 다운캐스팅
        // 실행에는 아무 문제 없음
        // => unit변수는 Marine 객체를 Unit객체로 만든 것! 따라서, Marine 객체로의 형변환이 가능
        m3.attack();

        // Firebat f3 = (Firebat) unit; // 이것은 컴파일시에는 오류는 발생하지 않지만, Firebat은 위에서
                                        // nit unit = new Marine();과 같이 형변환을 한 기록이 없으므로 에러남
        // f3.attack();
    }
}

class Unit {
    protected int hp;
    protected int ap;

    public void attack(){
        System.out.println("공격중 입니다....");
    }
}

class Marine extends Unit {
    @Override
    public void attack() {
        System.out.println("해병대가 공격중...");;
    }
}
class Firebat extends Unit {
    @Override
    public void attack() {
        System.out.println("불곰이 공격중...");
    }
}