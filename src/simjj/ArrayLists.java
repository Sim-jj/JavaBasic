package simjj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 배열 크지 지정 -> 정적배열
// 배열 크기가 차면 자동으로 배열크기를 생성해 주는것 -> 동적배열

// ★ArrayList★
// 동적배열의 한 종류
// List 인터페이스를 구현해서 만든 컬렉션 프레임워크
// 요소의 저장순서가 유지
// 중복으로 데이터를저장할 수 있음
// 크기가 늘어나면 새로운 배열을 생성하고
// 기존요소들을 옮겨야 하는 복잡한 과정이 동반됨
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // 데이터 추가 : add(대상);
        names.add("지민");
        names.add("정국");
        names.add("석진");

        // 특정 위치에 데이터 추가 : add(위치,대상);
        names.add(1, "태형");


        // 요소 추출 : get(위치);
        System.out.println(names.get(1));

        // 요소 수정 : set(위치, 대상);
        names.set(1, "윤기");
        System.out.println(names.get(1));

        // 요소 삭제 : remove(위치);
        names.remove(1);
        System.out.println(names.get(1));
        // 컬렉션 자료구조에 저장된 데이터를 출력하려면 foreach 구문 사용
        for (String name : names) { //for( 데이터형 각납할임시변수명 : ArrayList명)
            System.out.println(name);
        }

        // 요소 모두 삭제 : clear();

        // 데이터 검색하기
        // 배열에서 원하는 데이터를 찾는 방법은 2가지
        // 위치로 찾음 : get(위치)
        // 실제값으로 찾음 : contains, indexOf
        String[] game = {"스타크래프트", "디아블로", "워크래프트"};

        // ArrayList<String> games = (ArrayList<String>) Arrays.asList(game);
        // 문법적으로는 문제없지만 실행시 다운캐스팅 오류발생

        List<String> games = Arrays.asList(game); // upcasting, 일반배열을 ArrayList 형으로 바꾸는법
        // 일반배열을 동적배열로 변환하려면
        // Arrays 클래스의 asList메서드를 사용함

        System.out.println(games);

        // games 동적배열에서 '스타크래프트' 를 찾아봄
        // .size -> 동적배열에서 크기를 알아봐주는 메서드
        // 전체를 흩어가며 대상을 찾기 때문에 성능이 나쁨
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).equals("디아블로")) { // ArrayList가 String형이며 문자열의 값을 비교하기 때문에 equals메서드를 사용한다
                System.out.println((i + 1) + "번째에서 찾음");
                break;
            }
        } // 위치 기반 검색

        for (String g : games) { //foreach문은 n번째 찾음 <- 을 표현 할 수 없다
            if (g.equals("디아블로")) {
                System.out.println("데이터 찾음");
            }
        } // 값 기반 검색

        // contains(); -> 값이 객체에 존재하는지 확인 가능, 간단함
        if (games.contains("디아블로")) {
            System.out.println("데이터 찾음!!!!!");
        } // 값 기반 검색

        // indexOf(); 매개변수로 준 값이 n번째 있는지 확인
        System.out.println(games.indexOf("디아블로") + 1); // 위치기반 검색 , 숫자로 반환하기 때문에 + 1 을 넣으면 1을 더한값이 출력된다

        // 게임 정보에 대한 객체 생성
        GameInfo g1 = new GameInfo("BE", 39000);
        GameInfo g2 = new GameInfo("PERSONA", 17900);
        GameInfo g3 = new GameInfo("Her", 16900);

        // 생성한 객체들은 동적배열에 저장
        List<GameInfo> games2 = new ArrayList<>(); // upcasting를 사용해서 생성하는게 낫다

        games2.add(g1);
        games2.add(g2);
        games2.add(g3);

        // 'PERSONA' 요소를 출력
        // ArrayList의 요소가 GameInfo의 객체이므로 GameInfo의 객체의 주소가 저장됨
        System.out.println(games2.get(1)); // 컬렉션은 객체들의 집합이기 때문에 출력시 주소만 나타나게된다

        // 따라서, GameInfo의 객체의 실제값을 출력하려면 대상.면수명 또는 대상.getter를 이용해야함
        System.out.println(games2.get(1).name); // games2.get(1) -> 대상
        System.out.println(games2.get(1).price);

        // 특정 요소를 검색하는 코드를 4가지(for, foreach, contains, indexOf) 버젼으로 작성
        for (int i = 0; i < games2.size(); i++) {
            if (games2.get(i).name.equals("PERSONA")) { // ArrayList에 객체생성하면서 값을 넣었을때는 .멤버변수명을 사용해 줘야한다
                // 데이터형이 위의 String과는 다르게 GameInfo 이기 때문에
                System.out.println((i + 1) + "번째 에서 찾음");
                break;
            }
        }

        for (GameInfo game2 : games2) {
            if (game2.name.equals("PERSONA")) {
                System.out.println("foreach 문을 이용해서 데이터를 찾았다!");
            }
        }

        for (GameInfo game2 : games2) {
            if (game2.name.contains("PERSONA")) {
                System.out.println("contains를 이용해서 데이터를 찾았다!");
                break;
            }
        }
        for (GameInfo game2 : games2) {
            if (game2.name.contains("PERSONA")) {
                System.out.println((game2.name.indexOf("PERSONA") + 1) + "번째에서 데이터를 찾았다!");
                break;
            }
        }
    }
}


class GameInfo {
    String name;
    int price;

    public GameInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }

}