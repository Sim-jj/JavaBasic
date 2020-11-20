package lab.movies;

public class Actor {
    // 멤버변수
    private String name;
    private String birth;
    private String[] joinMovie;
    private String[] casting;

    public Actor(){
    }

    public Actor(String name, String birth, String[] joinMovie, String[] casting) {
        this.name = name;
        this.birth = birth;
        this.joinMovie = joinMovie;
        this.casting = casting;
    }

    public void setName(String name) {
        this.name = name;
    }

    //setter
    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setJoinMovie(String[] joinMovie) {
        this.joinMovie = joinMovie;
    }

    public void setCasting(String[] casting) {
        this.casting = casting;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String[] getJoinMovie() {
        return joinMovie;
    }

    public String[] getCasting() {
        return casting;
    }
}
