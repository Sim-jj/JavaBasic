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
        String sub = number.substring(7, 8);
        String sub2 = number2.substring(7, 8);

        if (sub.equals("1")) {
            System.out.println("2000년 이전 남성");
        } else if (sub.equals("2")) {
            System.out.println("2000년 이전 여성");
        } else if (sub.equals("3")) {
            System.out.println("2000년 이후 남성");
        } else if (sub.equals("4")) {
            System.out.println("2000년 이후 여성");
        }

        if (sub2.equals("1")) {
            System.out.println("2000년 이전 남성");
        } else if (sub2.equals("2")) {
            System.out.println("2000년 이전 여성");
        } else if (sub2.equals("3")) {
            System.out.println("2000년 이후 남성");
        } else if (sub2.equals("4")) {
            System.out.println("2000년 이후 여성");
        }
    }
}
