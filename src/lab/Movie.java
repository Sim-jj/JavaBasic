package lab;

public class Movie {
    public static void main(String[] args) {
        MovieInfo mvInfo = new MovieInfo("break the silence","2020","92분",
                                        "다큐멘터리",);
        MovieActor mvAc = new MovieActor();
        Director dir = new Director();
        Company com = new Company();

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