package lab.movies;

import lab.MovieActor;

public class MovieMain {
    public static void main(String[] args) {
        String[] genre = { "다큐멘터리" };
        String[] dirtr = { "박준수" };
        String[] actor = { "RM","진","슈가","제이홉","지민","태형","정국" };
        String sammary = "뜨거웠던 스타디움 투어의 대장정을 달려온 방탄소년단 멤버들.\n" +
                         "무대 위가 아닌 무대 뒤에서, 방탄소년단으로 인해 태어난 또 다른 나로,\n" +
                         "7명의 멤버들은 한 번도 말하지 못한 내면의 진솔한 이야기를 들려주기 시작한다.\n" +
                         "\n" + "지금까지 알지 못했던,\n" + "또 다른 나를 만나다 'PERSONA'";
        String desc = "2020년에 제작된 한국 영화. 방탄소년단의 공연실황 다큐멘터리 영화이다.";

        Movie btSilence = new Movie("break the silence","2020",92,
                                    "빅히트",genre,dirtr,actor,sammary,desc); //매개변수가 길어지면 가독성이 떨이지기 때문에 위에 변수로 선언하여 대입한다
                                                                                    //단 배열은 출력할때 반복문을 사용하여 [i]를 추가해준다
       // MovieActor

        System.out.println(btSilence.getTitle());
        System.out.println(btSilence.getYear());
        System.out.println(btSilence.getRunTime());
        System.out.println(btSilence.getPrdctn());
        // 배열은 참조형 변수이므로 변수명만 입력하면 배열의 내용대신 내용이 저장된 위치가 출력
        // 반복문으로 이용해서 처리
        for(int i=0; i<genre.length; i++) {
            System.out.println(btSilence.getGenre()[i]);
        }
        for(int i=0; i<dirtr.length; i++) {
            System.out.println(btSilence.getDirtor()[i]);
        }
        for(int i=0; i<actor.length; i++) {
            System.out.println(btSilence.getActor()[i]);
        }
        System.out.println(btSilence.getSummary());
        System.out.println(btSilence.getDesc());
    }
}
