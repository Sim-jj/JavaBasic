package lab;

public class Department {
    String dName;
    String phone;
    String office;
    String chief;

    // 기본 생성자
    public Department() {
        dName = "의상디자인";
        phone = "234-5678-9012";
        office = "A동 1층";
        chief = "301";
    }

    // 매개변수를 이용한 생성자
    public Department (String dName, String phone, String office, String chief){
        this.dName = dName;
        this.phone = phone;
        this.office = office;
        this.chief = chief;

    }
}
