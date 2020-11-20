package lab;

public class Movie {
    public static void main(String[] args) {
        MovieInfo mvInfo = new MovieInfo("break the silence",2020,"92분",
                                        "빅히트","다큐멘터리","박준수","방탄소년단",
                                        "지금까지 알지 못했던,\n" + "또 다른 나를 만나다 'PERSONA'",
                                        "2020년에 제작된 한국 영화. 방탄소년단의 공연실황 다큐멘터리 영화이다.");
        /*MovieActor mvAc = new MovieActor();
        Director dir = new Director();
        Company com = new Company();*/

    }
}

class MovieInfo {
     String title;
     int year;
     String min;
     String company;
     String genre;
     String direc;
     String actor;
     String Story;
     String intro;

    public MovieInfo(String title, int year, String min, String company, String genre,
                     String direc, String actor, String story, String intro) {
        this.title = title;
        this.year = year;
        this.min = min;
        this.company = company;
        this.genre = genre;
        this.direc = direc;
        this.actor = actor;
        Story = story;
        this.intro = intro;
    }
}