package lab;


public class Ex02 {
    public static void main(String[] args) {
        Student std = new Student();

        System.out.println(std); //std의 메모리상의 시작번지 주소가 출력
        System.out.println(std.name);
        System.out.println(std.addr);
        System.out.println(std.birth);

    }
}
