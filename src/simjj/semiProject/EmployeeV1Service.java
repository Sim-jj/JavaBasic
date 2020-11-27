package simjj.semiProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * EmployeeV1Service
 * 인사정보 처리 인터페이스를 구현한 클래스
 * 인사정보 처리에 대한 CRUD 코드를 작성해둠
 */

public class EmployeeV1Service extends EmployeeV1Generic {
    List<EmployeeVO> empl = new ArrayList<>();
   // 입력받은 인사정보 데이터를 저장하는 변수
    EmployeeVO emvo = null;

    /**
     * 인사정보 처리 UI 출력
     */
    public void displayMenu2() {
        StringBuilder str = new StringBuilder();

        str.append("-------------------\n")
           .append("인사 관리 프로그램 v1\n")
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

    @Override
    public void newEmployee() {
        /*int empId, sal, mgrId, deptId;
        String fName, lName, email, phone, hDate, jobId;
        double cmm;*/

        EmployeeVO emp = new EmployeeVO(1,"","","","","","",0,0.0,0,0);
        Scanner sc = new Scanner((System.in));

        // 모든 인사정보는 일단 문자형으로 받되
        // 필요에 따라 적절한 형변환을 해서 변수에 저장
        System.out.println("사원 넘버를 입력해주세요");
        emp.setEmpId(Integer.parseInt(sc.nextLine()));// 필요없는 변수선언은 최소화한다, 텍스트를 int형으로 바꿔야한다
        System.out.println("성(First Name)을 입력해주세요");
        emp.setfName(sc.nextLine());
        System.out.println("이름(Last Name)을 입력해주세요");
        emp.setlName(sc.nextLine());
        System.out.println("이메일을 입력해주세요");
        emp.setEmail(sc.nextLine());
        System.out.println("핸드폰 번호를 입력해주세요");
        emp.setPhone(sc.nextLine());
        System.out.println("입사일을 입력해주세요");
        emp.sethDate(sc.nextLine());
        System.out.println("사원 넘버를 입력해주세요");
        emp.setJobId(sc.nextLine());
        System.out.println("연봉을 입력해주세요");
        emp.setSal(Integer.parseInt(sc.nextLine()));
        System.out.println("커미션 퍼센트(소수점)을 입력해주세요");
        emp.setCmm(Double.parseDouble(sc.nextLine()));
        System.out.println("매니져 넘버를 입력해주세요");
        emp.setMgrId(Integer.parseInt(sc.nextLine()));
        System.out.println("부서 넘버를 입력해주세요");
        emp.setDeptId(Integer.parseInt(sc.nextLine()));

        // 스캐너로 입력받은 데이터를 VO클래스 넘겨줌(저장)
        emvo = new EmployeeVO(emp.getEmpId(), emp.getfName(), emp.getlName(), emp.getEmail(), emp.getPhone(),
                                         emp.gethDate(), emp.getJobId(), emp.getSal(), emp.getCmm(), emp.getMgrId(),
                                         emp.getDeptId());

        // 동적배열에 객체화시킨 VO클래스의 데이터를 넘김
        empl.add(emvo);
    }

    /**
     * 기본 인사정보 출력
     */
    @Override
    public void readEmployee() {
        // 데이터 출력시 간격유지를 위해  형식지정자에 숫자를 사용
        String fmt = "%8s\t%8s\t%8s\t%8s\t%8s\t%8s\n";

        System.out.printf(fmt,"사번","성","이메일","직책","상사번호","부서번호");
        Iterator<EmployeeVO> itr = empl.iterator();
        while(itr.hasNext()){
            EmployeeVO emvo = itr.next();
            System.out.printf(fmt,emvo.getEmpId(),emvo.getfName(),emvo.getEmail(),
                              emvo.getJobId(),emvo.getMgrId(),emvo.getDeptId());
        }
    }

    /**
     * 상세 인사정보 출력
     * 사원번호를 입력받아 출력함
     */
    @Override
    public void readOneEmployee() {
        String fmt = "%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s\n";

        EmployeeVO emp = new EmployeeVO();
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사원 번호는? ");
        emp.setEmpId(Integer.parseInt(sc.nextLine()));

        for(EmployeeVO e : empl){
            // 입력한 사원번호와 순회해서 읽어온 사원정보의 사원번호와 비교해서
            // 일치하면 이것을 출력하기 위해 다른변수에 저장함
            if(e.getEmpId() == emp.getEmpId()){ // 입력한 사원번호(emp.getEmpId())와 입력된 사원번호(e.getEmpId())가 같은지 비교
               emp = e; // 꺼내고 있는 e 데이터를 emp변수에 주소를 넣는다
            }
        }
        System.out.printf(fmt,emp.getEmpId(),emp.getfName(),emp.getlName(),emp.getEmpId(),
                          emp.getPhone(),emp.gethDate(),emp.getJobId(),emp.getSal(),emp.getCmm(),
                          emp.getMgrId(),emp.getDeptId());
    }
}
