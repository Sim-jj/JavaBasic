package lab.movies;

public class Movie {
    private String title;
    private String year;
    private int runTime;
    private String prdctn;
    private String[] genre;
    private String[] dirtor;
    private String[] actor;
    private String summary;
    private String desc;

    // 생성자
    public Movie() {
    }

    // 매개변수 생성자
    public Movie(String title, String year, int runTime, String prdctn, String[] genre,
                 String[] dirtor, String[] actor, String summary, String desc) {
        this.title = title;
        this.year = year;
        this.runTime = runTime;
        this.prdctn = prdctn;
        this.genre = genre;
        this.dirtor = dirtor;
        this.actor = actor;
        this.summary = summary;
        this.desc = desc;
    }

    // setter만들기
    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public void setPrdctn(String prdctn) {
        this.prdctn = prdctn;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public void setDirtor(String[] dirtor) {
        this.dirtor = dirtor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // getter만들기
    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public int getRunTime() {
        return runTime;
    }

    public String getPrdctn() {
        return prdctn;
    }

    public String[] getGenre() {
        return genre;
    }

    public String[] getDirtor() {
        return dirtor;
    }

    public String[] getActor() {
        return actor;
    }

    public String getSummary() {
        return summary;
    }

    public String getDesc() {
        return desc;
    }
}
