package lab;

public class Book {
    // 멤버변수 선언
    String name;
    String write;
    String pubName;
    String pubDate;
    int price;
    double disCnt;
    String bkImg; // java.png

    // 기본 생성자

    public Book() {
    }

    // 매개변수 생성자

    public Book(String name, String write, String pubName, String pubDate,
                int price, double disCnt, String bkImg) {
        this.name = name;
        this.write = write;
        this.pubName = pubName;
        this.pubDate = pubDate;
        this.price = price;
        this.disCnt = disCnt;
        this.bkImg = bkImg;
    }
}
