package persistence_and_serialization;


import java.io.Serializable;

public class Films implements Serializable {
    private int filmsId;
    private String filmName;
    private String genre;
    private String language;
    private double rating;
    private int relYr;

    public void setFilmsId(int filmsId) {
        this.filmsId = filmsId;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setRelYr(int relYr) {
        this.relYr = relYr;
    }

    public void showData(){
        System.out.println("Films Information\n.................. ");
        System.out.println("Film Id           :"+filmsId);
        System.out.println("Film Name         :"+filmName);
        System.out.println("Film Genre        :"+genre);
        System.out.println("Film Language     :"+language);
        System.out.println("Film Rating       :"+rating);
        System.out.println("Film Release Year :"+relYr);
    }
}
