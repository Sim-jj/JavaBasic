package simjj.CODP;

import java.util.ArrayList;

public class CODPService {

    public void display() {
        StringBuilder sb = new StringBuilder();

        sb.append("-------------------\n")
                .append(" 주문/운송 정보 조회 프로그램v1 \n")
                .append("-------------------\n")
                .append(" 1. 주문 정보 조회\n")
                .append(" 2. 운송 정보 조회\n")
                .append(" 0. 프로그램 종료\n")
                .append("-------------------\n")
                .append(" 원하시는 작업은 ? ");

        System.out.println(sb);
    }

    public void readCODP() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s\n";

//        String result = String.format(fmt, "제품번호", "주문번호", "고개번호", "고객이름", "주소", "시도",
//                "우편번호", "전화번호", "주문일", "납기일", "인사번호", "수량", "제품이름", "제품분류", "단가", "재고량");
//        sb.append(fmt);

        ArrayList<CODPVO> codp = CODPDAO.selectCodp();

        for (CODPVO co : codp) {
          String result = String.format(fmt, co.getPrdno(), co.getOrdno(), co.getCid(), co.getCname(), co.getAddr(),
                    co.getCity(), co.getPost(), co.getPhone(), co.getOrdate(), co.getDudate(), co.getEmpid(),
                    co.getQty(), co.getPname(), co.getPrdgo(), co.getPrice(), co.getStock());

            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    public void readSOE() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%10s %10s %10s %10s %10s %10s %10s %10s\n";

//        String result = String.format(fmt, "제품번호", "주문번호", "고개번호", "고객이름", "주소", "시도",
//                "우편번호", "전화번호", "주문일", "납기일", "인사번호", "수량", "제품이름", "제품분류", "단가", "재고량");
//        sb.append(fmt);

        ArrayList<CODPVO> codp = CODPDAO.selectSOE();

        for (CODPVO co : codp) {
            String result = String.format(fmt,co.getShppid(),co.getShname(),co.getTephone(),co.getResid(),
                                           co.getName(),co.getDept(),co.getJobid(),co.getHdate());

            sb.append(result);
        }
        System.out.println(sb.toString());
    }
}