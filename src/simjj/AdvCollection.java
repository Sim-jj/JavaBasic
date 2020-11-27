package simjj;

// set : 집합
// set 인터페이스를 구현한 컬렉션 클래스
// 요소의 저장순서가 유지 안됨
// 데이터를 중복으로 저장 불가

// HashSet : 해쉬 알고리즘을 이용해서 데이터를 저장하기 때문에 검색속도가 빠름

// hash : 일반적으로 저징된 자료의 양에 상관 없이 특정 데이터를 찾는데 걸리는 시간이 항상 일정할 순 없을까?
// => 해쉬테이블을 이용해서 실현

import java.util.*;

public class AdvCollection {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        // 데이터 추가 : add
        names.add("지민");
        names.add("지민");
        names.add("정국");
        names.add("석진");

        // 데이터 모두 출력 (해쉬코드순
        for(String n : names) {
            System.out.println(n);
        } // 2번 입력한 데이터가 하나로만 출력

        System.out.println("------------------------");
        // for(int i=0;i<names.size();i++){
           // System.out.println(names.get(i));
            // HashSet에서는 get 사용불가
       // }

        // 컬렉션 데이터 순회(iterate) 하기
        // 컬렉션 프레임워크에 저장된 각요소들을 읽어오는 방법을 표준화한 것
        // OOP프로그래밍에서 배열이나 그와 유사한 자료구조의 내부요소를 순회하는 객체를 의미
        // 간단해서 사용하기 용이
        Iterator<String> iter = names.iterator(); // 데이터를 조사할 전체적인 목록을 만드는것
        while(iter.hasNext()){ // hasNext() 요소 하나하나 데이터가 있는지 확인
            System.out.println(iter.next()); // next(); 순회중에 요소내용을 그대로 가져오는 메서드(값 출력)
        }

        System.out.println("--------------------------------------");
        // 데이터 수정 : set(사용불가)
        // names.set(0,"남준");
        // 따라서 먼저 remove한 후 add로 처리
        // 석진을 남준으로 바꾸는 경우
        names.remove("석진");
        names.add("남준");

        // Hashset에 다양한 유형의 값을 추가해 봄
        names.add("Jimin");
        names.add("Jungkook");
        names.add("Taehyung");

        names.add("0613");
        names.add("5813");
        names.add("1108");

        iter = names.iterator();
        while(iter.hasNext()){ // hasNext() 요소 하나하나 데이터가 있는지 확인
            System.out.println(iter.next()); // next(); 순회중에 요소내용을 그대로 가져오는 메서드(값 출력)
        } // 값들이 특이한 순서로 출력됨
        // => 각 데이터의 고유 해쉬값에 의해 정렬되어 출력
        System.out.println("------------------------");

        // https://url.kr/IJ7jdR
        // sha256 hash코드 생성기
        // sha (secure hash algorithm)
        // 256 : 256bit 길이의 코드생성

        // ex) 로또 6/45 프로그램 생성
        // 1~45사이 임의의 숫자 6개를 만드는 코드 작성
        // 단, 중복숫자는 허용하지 않음
        Set <Integer> lotto = new HashSet<>();
        int cnt = 0;

        while(true) {
            if (cnt < 6){
                lotto.add((int) (Math.random() * 45) + 1);
                cnt++;
        } else break;
        }

        Iterator<Integer> iter2 = lotto.iterator();
        System.out.println("로또 번호 생성기");
        while(iter2.hasNext()){ // hasNext() 요소 하나하나 데이터가 있는지 확인
            System.out.println(iter2.next()); // next(); 순회중에 요소내용을 그대로 가져오는 메서드(값 출력)
        }
        System.out.println("------------------------");
        // HashMap
        // 키와 값으로 저장하는 컬렉션 클래스
        // Map인터페이스를 구현해 컬렉션 클래스
        // 키와 값을 하나의 쌍으로 저장하는 방식을 사용
        // 키는 실질적으로 값을 찾기 위한 방편으로 사용
        // 요소의 저장순서는 유지되지 않음
        // 키는 중복 데이터를 저장할 수 없음
        // 단, 값은 중복으로 저장할 수 있음
        // 해시 알고리즘을 사용하기 때문에 검색속도가 매우 빠름

        // 데이터 추가 : put(키, 값);
        // 게임이름과 가격을 저장하는 해시맵을 생성
        Map<String,Integer> product = new HashMap<>(); // String은 키, Integer는 값

        product.put("BE",39000);
        product.put("PERSONA",17900);
        product.put("Her",16500);

        // 갑 조회 : get(키)
        System.out.println(product.get("BE")); // BE 앨범(키)의 값을 출력해줌

        // 모든 키 확인 : keySet();
        // keySet 메서드의 리턴값은 Set임
        Set <String> keys = product.keySet();

        for(String k : keys){
            System.out.println(k);
        }
        System.out.println("-----------------");

        // 모든 값 확인 : values
        // values 메서드의 리턴값은 Collection임! vlaues는 Integer형으로 받아줘야함
        Collection<Integer> vals = product.values();
        for(Integer k : vals){
            System.out.println(k);
        }

        System.out.println("------------------");
        Map<Integer,GameInfo> games = new HashMap<>();
        games.put(123,new GameInfo("스타크래프트",35000));
        games.put(234,new GameInfo("워크래프트",25000));
        games.put(345,new GameInfo("디아블로",35000));

        // key가 234인 게임의 정보 출력
        System.out.println(games.get(234).name); // 직접 객체를 생성하여 넣은 값은 멤버변수명 지정을 꼭 해줘야한다
        System.out.println(games.get(234).price); // 직접 객체를 생성하여 넣은 값은 멤버변수명 지정을 꼭 해줘야한다

        // GameInfo의 모든 게임정보 출력
        Set<Integer> keys2 = games.keySet();
        for(Integer key : keys2){
            System.out.println("키가" + key + "인 게임정보");
            System.out.println(games.get(key).name);
            System.out.println(games.get(key).price);
        }

        // 해시알고리즘
        // 해시함수 : 임의의 길이를 갖는 임의의 데이터에 대해 고정된 길이의 데이터로 매핑하는 함수
        // 해시값 : 해시함수를 적용해서 나온 값
        // 해시함수는 복잡한 알고리즘을 사용하지 않기 때문에 CPU연산이 많이 필요하지 않음
        // 같은 입력값에 대해서는 같은 출력값이 출력
        // 단, 해시함수 알고리즘에 따라 다르게 출력 가능
        // 간혹, 서로 다른 데이터에 대해 같은 결과값이 나오는 경우 발생 => 충돌
        // 대표적인 해시함수 : MD5, SHA256
        // 응용분야 : 레코드 검색, 유사 레코드 비교, 암호화

        // 로그인 비밀번호를 해시코드화(암호화) 시켜서 넣으면 보안상 우수하다
   }
}
