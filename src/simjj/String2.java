package simjj;

// 문자열처리시 유용한 기기능을 제공하는 메서드

public class String2 {
    public static void main(String[] args) {
        String str = "Hello, World!!";

        // 문자열 검색
        // indexOf : 지정한 문자 찾기

        int idx = str.indexOf('W');
        System.out.println(idx);
        idx = str.indexOf("Hello"); // 문자열을 인수로 준 경우에는 첫번째 문자가 시작되는 자리번호를 출력한다
        System.out.println(idx);

        // 문자열 길이 : length
        System.out.println(str.length());

        // lastIndexOf(문자) : 오른쪽 기준 지정한 문자 찾기
        str = "Hello, Hi, Noon";
        idx = str.lastIndexOf('H');
        System.out.println(idx);

        // 문자 바꾸기 : replace
        // replace(찾을문자열, 바꿀문자열)
        str = "A*B*C*D";

        str = str.replace("*", "-"); // 메서드를 부른것만으로 값이 변경되지 않으므로 str 변수에 각납
        System.out.println(str);

        // 문자열 분리 : split
        // 지정한 문자를 기준으로 문자열을 나눠 배열에 저장
        // split(구분자)
        str = "201350050,김태희,경기도,1985.3.22,컴퓨터,504";
        String[] result = str.split(","); // 리턴 값은 배열임 배열을 새로정의해줌

      /*  for(int i=0; i<result.length;i++){
            System.out.println(result[i]);
        }*/
        for (String data : result) { // 세련된 for문
            System.out.println(data);
        } // 향상된 for 문을 사용하면 배열을 쉽게 다룰 수 있음

        // 문자열 추출 : subString
        // subString(시작위치, 끝위치-1);
        str = "Hello, World!";
        String world = str.substring(7, 12);
        System.out.println(world);

        // ex) 주민번호에서 성별체크하는 프로그램 작성
        // 123456-123456789, 987654-4567890
        // 1, 2 : 2000년 이전 남여 구분
        // 3, 4 : 2000년 이후 남여 구분

        String number = "123456-123456789";
        String number2 = "987654-4567890";
        String gender = number.substring(7, 8);
        String gender2 = number2.substring(7, 8);
        String result2 = "";
        String result3 = "";

        switch (gender) {
            case "1":
                result2 = "2000년 이전 남";
                break;
            case "2":
                result2 = "2000년 이전 여";
                break;
            case "3":
                result2 = "2000년 이후 남";
                break;
            case "4":
                result2 = "2000년 이후 여";
                break;
        }
        switch (gender2) {
            case "1":
                result3 = "2000년 이전 남";
                break;
            case "2":
                result3 = "2000년 이전 여";
                break;
            case "3":
                result3 = "2000년 이후 남";
                break;
            case "4":
                result3 = "2000년 이후 여";
                break;
        }
        System.out.println(result2);
        System.out.println(result3);

        // 지정한 위치의 문자 추출 메서드 : charAt (추출할 글자가 한개일때)
        str = "123456-1234567";
        System.out.println(str.charAt(7));

        // 정규표현식에 따라 일치여부 확인 메서드 : matches
        // 정규식 사용가능 메서드 : split, replaceAll
        int num = 1234567;
        String str1 = String.format("%d", num);
        String str2 = "1234567";
        System.out.println(str1.matches(str2));

        System.out.println(str1.matches("[a-z].+")); // str1에 a-z까지 반복되느냐 , +의 의미는 반복되느냐 의미
        System.out.println(str1.matches("[0-9].+")); // 0~9 사이 숫자 하나라도 포함되어있느냐

        // 정규표현식 regular expression
        // 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 사용하는 형식언어, -는 두 문자 사이의 범위표현
        // [] : 문자집합이나 범위를 나타냄
        // [0-9] : 숫자
        // [a-zA-z] : 영문자
        // [가-힣] : 한글
        // * : 0번 이상 무한개의 임의의 문자 반복
        // ab* : ab, aba, ab1, ...
        // + : 1번 이상 무한개의 임의의 문자 반복
        // ab+ : aba, ab1, abA, abaa, ...
        // ? : 0번 또는 1개의 임의의 문자 반복
        // ab? : aba, abb, ... ab0, abZ, abz
        // {n, m} : 최소 n개 이상 m개 이하 반복
        // [0-9]{3,4} : 123, 987, 1234, 9876
        // ^ : 문자열 시작
        // ^123 :  123으로 시작하는 문자열 의미
        // % : 문자열 끝
        // 123$ : 123으로 끝나는 문자열 의미
        // 1234567890
        // abcdefjhijklmnopqrstuvwxyz
        // 가나다라마바사아자차카타파하
        // . : 임의의 문자를 의미
        // .{3, } : 문자의 최소길이는 3임

        // 다음 문자열이 전화번호형식에 맞게 작성되었는지 알아보는 정규식을 작성하세요
        // 010-123-4567, 011-1234-5678

        System.out.println();
        String phone = "010-123-4567";
        String pattern1 = "[0-9]{3}-[0-9]{3}-[0-9]{4}"; // 정규표현식 첫번째 [010]{3자리}-[123]{3자리}-[4567]{4자리} 란 의미
        System.out.println(phone.matches(pattern1));

        phone = "011-1234-5678";
        pattern1 = "[0-9]{3}-[0-9]{4}-[0-9]{4}"; // 첫번째 [010]
        System.out.println(phone.matches(pattern1));

        // ex) 사용자 아이디가 다음 규칙제 적합하게 작성되었는지 확인
        // 영문자 소문자/대문자, 숫자, 특수기호
        // abc123!XYZ , 123jkl
        System.out.println();
        String uId = "abc123!XYZ";
        String uId2 = "123jkl";
        String pattern2 = "[a-zA-z0-9!]+"; // a~z,A~Z,0~9,!가 들어가있는지 확인

        System.out.println(uId.matches(pattern2));
        System.out.println(uId.matches(pattern2));

        // 첫글자는 영문자 소문자/대문자
        // 두번째 숫자, 특수기호()등이 포함
        // 최소 길이는 6~18자
        // abc123!XYZ , 123jkl
        //String uId3 = "abc123!XYZ";
        String uId3 = "a12345678901234567";
        String pattern3 = "^[a-zA-z][a-zA-Z0-9!]{5,17}+"; //^[a-zA-z][a-zA-Z0-9!]{6,18} -> ^[a-zA-z] : 첫글자는 영문자 소문자/대문자
                                                          //[a-zA-Z0-9!] : 두번째 글자부터는 숫자,영문자,특수기호 등포함
                                                          // {5,17} : 6~18자 란 의미(문자열 첫글자 자리번호는 0이기 때문에)
        System.out.println(uId.matches(pattern3));
    }
}
