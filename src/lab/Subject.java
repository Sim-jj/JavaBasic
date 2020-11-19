package lab;

public class Subject {
    String subNo; // int형으로 해버리면 앞에 0이 사라지기때문에 이상한 숫자가 나온다. 이것은 고정데이터 이고 수식에 사용하지 않으므로 String형을 쓴다
    String subjName;
    String subjDesc;
    String prof;

    // 기본 생성자
    public Subject(){
        subNo = "0211";
        subjName = "드레스 코드";
        subjDesc = "옷 입기의 기초";
        prof = "445";
    }

    // 매개변수를 이용한 생성자
    public Subject(String subNo, String subjName, String subjDesc, String prof){
        this.subNo = subNo;
        this.subjName = subjName;
        this.subjDesc = subjDesc;
        this.prof = prof;
    }
}
