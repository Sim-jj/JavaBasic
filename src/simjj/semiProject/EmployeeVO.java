package simjj.semiProject;

/**
 * 인사 정보 프로그램
 * 사번empId, 이름fName, 성lName, 이메일email, 전화번호phone,
 * 입사일hDate, 사원번호jobId, 연봉sal, 커미션cmm, 상사번호mgrId, 부서번호deptId
 */
public class EmployeeVO {
    // 멤버변수
    private int empId;
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private String hDate;
    private String jobId;
    private int sal;
    private double cmm;
    private int mgrId;
    private int deptId;

    // 생성자
    public EmployeeVO() { }

    public EmployeeVO(int empId, String fName, String lName, String email, String phone, String hDate,
                      String jobId, int sal, double cmm, int mgrId, int deptId) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.hDate = hDate;
        this.jobId = jobId;
        this.sal = sal;
        this.cmm = cmm;
        this.mgrId = mgrId;
        this.deptId = deptId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void sethDate(String hDate) {
        this.hDate = hDate;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public void setCmm(double cmm) {
        this.cmm = cmm;
    }

    public void setMgrId(int mgrId) {
        this.mgrId = mgrId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String gethDate() {
        return hDate;
    }

    public String getJobId() {
        return jobId;
    }

    public int getSal() {
        return sal;
    }

    public double getCmm() {
        return cmm;
    }

    public int getMgrId() {
        return mgrId;
    }

    public int getDeptId() {
        return deptId;
    }
}
