package simjj;

/**
 * SungJukV8GenericService
 * 성적처리 인터페이스를 구현한 추상클래스
 * Service 클래스에서 효율성을 높이기 위해 SungJukV8Interface를 implements를 한다
 */
public abstract class SungJukV8GenericService implements SungJukV8Interface {
    @Override
    public void readSungJuk() {
        System.out.println("아직 구현되지 않은 기능입니다.");
    }

    @Override
    public void readOneSungJuk() {
        System.out.println("아직 구현되지 않은 기능입니다.");
    }

    @Override
    public void newSungJuk() {
        System.out.println("아직 구현되지 않은 기능입니다.");
    }

    @Override
    public void modifySungJuk() {
        System.out.println("아직 구현되지 않은 기능입니다.");
    }

    @Override
    public void removeSungJuk() {
        System.out.println("아직 구현되지 않은 기능입니다.");
    }
}
