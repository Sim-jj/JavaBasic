package simjj.CODP;

public class CODPVO {
    private int prdno;     // 제품번호
    private int ordno;     // 주문번호
    private int cid;       // 고객번호
    private String cname;  // 고개이름
    private String addr;   // 주소
    private String city;   // 시도
    private String post;   // 우편번호
    private String phone;  // 전화번호
    private String ordate; // 주문일
    private String dudate; // 납기일
    private int empid;     // 인사번호
    private int qty;       // 수량
    private String pname;  // 제품이름
    private String prdgo;  // 제품분류
    private int price;     // 단가
    private int stock;     // 재고량

    private int shppid;    // 운송id
    private String shname; // 운송이름
    private String tephone; // 담당자 전화번호
    private String resid;  // 주민등록번호
    private String name;   // 사원이름
    private String dept;   // 소속부서
    private String jobid;  // 직책
    private String hdate;  // 입사일


    public CODPVO() { }

    public CODPVO(int prdno, int ordno, int cid, String cname, String addr, String city,
                  String post, String phone, String ordate, String dudate, int empid,
                  int qty, String pname, String prdgo, int price, int stock) {
        this.prdno = prdno;
        this.ordno = ordno;
        this.cid = cid;
        this.cname = cname;
        this.addr = addr;
        this.city = city;
        this.post = post;
        this.phone = phone;
        this.ordate = ordate;
        this.dudate = dudate;
        this.empid = empid;
        this.qty = qty;
        this.pname = pname;
        this.prdgo = prdgo;
        this.price = price;
        this.stock = stock;
    }

    public CODPVO(int shppid, String shname, String tephone, String resid, String name,
                  String dept, String jobid, String hdate) {
        this.shppid = shppid;
        this.shname = shname;
        this.tephone = tephone;
        this.resid = resid;
        this.name = name;
        this.dept = dept;
        this.jobid = jobid;
        this.hdate = hdate;
    }

    public void setPrdno(int prdno) {
        this.prdno = prdno;
    }

    public void setOrdno(int ordno) {
        this.ordno = ordno;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setOrdate(String ordate) {
        this.ordate = ordate;
    }

    public void setDudate(String dudate) {
        this.dudate = dudate;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrdgo(String prdgo) {
        this.prdgo = prdgo;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setShppid(int shppid) {
        this.shppid = shppid;
    }

    public void setShname(String shname) {
        this.shname = shname;
    }

    public void setTephone(String tephone) {
        this.tephone = tephone;
    }

    public void setResid(String resid) {
        this.resid = resid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public int getPrdno() {
        return prdno;
    }

    public int getOrdno() {
        return ordno;
    }

    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public String getAddr() {
        return addr;
    }

    public String getCity() {
        return city;
    }

    public String getPost() {
        return post;
    }

    public String getPhone() {
        return phone;
    }

    public String getOrdate() {
        return ordate;
    }

    public String getDudate() {
        return dudate;
    }

    public int getEmpid() {
        return empid;
    }

    public int getQty() {
        return qty;
    }

    public String getPname() {
        return pname;
    }

    public String getPrdgo() {
        return prdgo;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getShppid() {
        return shppid;
    }

    public String getShname() {
        return shname;
    }

    public String getTephone() {
        return tephone;
    }

    public String getResid() {
        return resid;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getJobid() {
        return jobid;
    }

    public String getHdate() {
        return hdate;
    }
}
