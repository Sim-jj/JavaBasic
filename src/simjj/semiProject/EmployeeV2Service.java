package simjj.semiProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * EmployeeV1Service
 * 인사정보 처리 인터페이스를 구현한 클래스
 * 인사정보 처리에 대한 CRUD 코드를 작성해둠
 */

public class EmployeeV2Service extends EmployeeV1Service {
    private String fpath = "c:/Java/employee.dat";
    private FileWriter fw = null;
    private BufferedWriter bw = null;
    private FileReader fr = null;
    private BufferedReader br = null;

    public EmployeeV2Service() {
        try {
            loadEmployee();
        } catch (IOException e) {
            System.out.println("성적데이터를 읽어오는 중 오류발생");
            e.printStackTrace();
        }
    }

    @Override
    public void displayMenu2() {
        StringBuilder str = new StringBuilder();

        str.append("-------------------\n")
                .append("인사 관리 프로그램 v2\n")
                .append("-------------------\n")
                .append(" 1. 인사 정보 입력\n")
                .append(" 2. 인사 정보 조회\n")
                .append(" 3. 인사 정보 상세조회\n")
                .append(" 4. 인사 정보 수정 수정\n")
                .append(" 5. 인사 정보 삭제\n")
                .append(" . 프로그램 종료\n")
                .append("-------------------\n")
                .append(" 원하시는 작업은 ? " );

        System.out.println(str);

    }

    /**
     * EmployeeV8Service의 newEmployee을 재정의
     */
    @Override
    public void newEmployee() {
        super.newEmployee();
        try {
            writeEmployee(emvo);
        } catch (IOException e) {
            System.out.println("파일 쓰기중 오류");
            e.printStackTrace();
        }
    }
    /**
     * writeEmployee
     * 입력받은 성적데이터를 employee.dat에 저장
     * 외부 노출할 필요없기 때문에 protected로 작성해준다
     */
    protected void writeEmployee(EmployeeVO em) throws IOException {
        String fmt = "%s,%s,%s,%s,%s,%s,%s,%s,%.1f,%s,%s";

        fw = new FileWriter(fpath,true);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt,em.getEmpId(),em.getfName(),em.getlName(),em.getEmail(),em.getPhone(),em.gethDate(),
                                     em.getJobId(),em.getSal(),em.getCmm(),em.getMgrId(),em.getDeptId());
        bw.write(data);
        bw.newLine(); // 줄바꿈

        bw.close();
        fw.close();
    }
    /**
     * loadEmployee
     * 파일에 저장된 인사 정보 데이터를 List타입의 employee.dat에 저장
     */
    protected void loadEmployee() throws IOException{
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while(br.ready()){
            String[] s = br.readLine().split(",");

            emvo = new EmployeeVO(Integer.parseInt(s[0]),s[1],s[2],s[3],s[4],s[5], s[6],
                                  Integer.parseInt(s[7]),
                                  Double.parseDouble(s[8]),
                                  Integer.parseInt(s[9]),
                                  Integer.parseInt(s[10]));

            empl.add(emvo);
        }

        br.close();
        fr.close();

    }
}
