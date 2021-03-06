package simjj.SungJuk;

// SungJukV5Main -> SungJukVo -> SungJukService
public class SungJukV5Main {
    public static void main(String[] args) {

        SungJukService sjsrv = new SungJukService(); // Service값을 VO 에 넘겨줘야되기 때문에 객체화 시킴
        
        // SungJukVO sj = new SungJukVO();
        SungJukVO sj = sjsrv.readSungJuk(); // 이미 SungJukVO를 객체화 시킨것

        // 변수의 유효범위 scope
        // 변수가 생성된 위치와 사용하는 위치가 다른 경우 그 결과가 예상과 다를 수 있음
        // 변수의 유효범위는 블록이라 하고 { } 로 표현
        // 기본자료형 변수 : call by value
        // 참조자료형 변수 : call by reference

        sjsrv.computerSungJuk(sj);
        sjsrv.printSungJuk(sj);
    }
}
