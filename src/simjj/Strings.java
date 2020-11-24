package simjj;

// String 클래스
// C언어 에서는 문자열은 char형 배열로 표현
// 자바에서는 문자열처리를 위한 별도의 String 클래스 제공

// String 클래스의 객체는 한번 생성되면 그값을 읽기만 가능하고 변경할 수 없는 불변객체임
// 따라서, + 연산자로 문자열을 결합하는 경우
// 기존의 문자열이 변경 되는 것이 아니고 각각의 내용을 합쳐 새로운 객체를 생성 함

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World!!";

        str1 = str1 + str2;
        str1 = str1 + "wow";
        System.out.println(str1); // 메모리 낭비 심함 ( 변수마다 새로운 객체를 생성하여 합친다음 또 다른 새로운 객체를 생성하기 때문에)
        // => StringBuffer, StringBuilder 추천

        StringBuffer sb = new StringBuffer();
        sb.append("Hello ").append("world!! ").append("Wow~");
        // append 메서드 -> 문자를 이어주는 메소드
        System.out.println(sb);

        // 문자열 비교
        // [문자열 상수 풀] 이라는 개념 이해 필요
        // a 라는 객체 생성 => "Hello"를 SCP(문자열 상수 풀)에 저장
        // b 라는 객체 생성 => SCP에 이미 존재하므로 같은 값을 참조 하도록함
        // c 라는 객체 생성 => 새로운 위치에 "Hello"를 생성

        // 문자열 변수간 비교에서 == 연산자는 값을 비교하는 것이 아니고 값이 저장된 메모리상 위치를 비교함(중요!)
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello"); // 새로운 String 객체를 생성하였기 때문에 a,b가 가르키는 주소와 다르다

        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);

        // 따라서, 문자열간 값을 비교할때는 equals 메서드를 사용해야 함
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}