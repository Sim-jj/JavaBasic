package lab.movies;

public class Producer {
    private String name;
    private String addr;
    private String[] moive;

    public Producer() {
    }

    public Producer(String name, String addr, String[] moive) {
        this.name = name;
        this.addr = addr;
        this.moive = moive;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setMoive(String[] moive) {
        this.moive = moive;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String[] getMoive() {
        return moive;
    }
}
