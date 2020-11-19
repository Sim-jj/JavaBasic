package lab;

public class Professor {
    String proNo; // int형으로 해버리면 앞에 0이 사라지기때문에 이상한 숫자가 나온다. 이것은 고정데이터 이고 수식에 사용하지 않으므로 String형을 쓴다
    String proName;
    String mjField;

    // 기본 생성자
    public Professor() {
        proNo = "445";
        proName = "정약용";
        mjField = "의상디자인";
    }

    // 매개변수를 이용한 생성자
    public Professor(String proNo, String proName, String mjField){
        this.proNo = proNo;
        this.proName = proName;
        this.mjField = mjField;
    }
}
