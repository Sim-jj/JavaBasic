package simjj.semiProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service extends EmployeeV1Generic {
    List<EmployeeVO> empl = new ArrayList<>();

    // 인사 관리 프로그램의 디스플레이를 보여주는 메소드
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
           .append(" 원하시는 작업은 ? ");

        System.out.println(str);
    }

    @Override
    public void newEmployee() {
        int empId, sal, mgrId, deptId;
        String fName, lName, email, phone, hDate, jobId;
        double cmm;

        Scanner sc = new Scanner((System.in));

        System.out.println("사원 넘버를 입력해주세요");
        empId = sc.nextInt();
        sc.skip("\r\n|[\n\r]");
        System.out.println("성(First Name)을 입력해주세요");
        fName = sc.nextLine();
        System.out.println("이름(Last Name)을 입력해주세요");
        lName = sc.nextLine();
        System.out.println("이메일을 입력해주세요");
        email = sc.nextLine();
        System.out.println("핸드폰 번호를 입력해주세요");
        phone = sc.nextLine();
        System.out.println("입사일을 입력해주세요");
        hDate = sc.nextLine();
        System.out.println("사원 넘버를 입력해주세요");
        jobId = sc.nextLine();
        System.out.println("연봉을 입력해주세요");
        sal = sc.nextInt();
        System.out.println("커미션 퍼센트(소수점)을 입력해주세요");
        cmm = sc.nextDouble();
        System.out.println("매니져 넘버를 입력해주세요");
        mgrId = sc.nextInt();
        System.out.println("부서 넘버를 입력해주세요");
        deptId = sc.nextInt();

        // 스캐너로 입력받은 데이터를 VO클래스에 저장
        EmployeeVO emvo = new EmployeeVO(empId, fName, lName, email, phone, hDate, jobId, sal, cmm, mgrId, deptId);

        // 동적배열에 객체화시킨 VO클래스의 데이터를 넘김
        empl.add(emvo);
    }

    @Override
    public void readEmployee() {
        StringBuilder str = new StringBuilder();
        Iterator<EmployeeVO> itr = empl.iterator();
        while(itr.hasNext()){
            EmployeeVO emvo = itr.next();
            str.append("사번 : ").append(emvo.getJobId()).append("\n")
               .append("성 : ").append(emvo.getfName()).append("\n")
               .append("이메일 : ").append(emvo.getEmail()).append("\n")
               .append("상사번호 : ").append(emvo.getMgrId()).append("\n")
               .append("부서번호 : ").append(emvo.getDeptId()).append("\n");
        }
        System.out.println(str);
    }

    @Override
    public void readOneEmployee() {


    }
}
