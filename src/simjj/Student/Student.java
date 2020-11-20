package simjj.Student;

public class Student {
    String name;
    int grade;
    int money;

    // 기본 생성자
    public Student() {
    }

    // 매개변수를 이용한 생성자
    public Student(String name, int grade, int money){
        this.name = name;
        this.grade = grade;
        this.money = money;
    }

  /* public void takeBus(Bus bus){
        bus.takeBus(1000);
        money -= 1000;
   }

   public void takeSubway(Subway subway){
        subway.takeSubway(1500);
        money -= 1500;
   }*/

}
