package oops.classes;

public class Film {
    private int filmID;
    private String filmName;
    private String genre;
    private String language;
    private double relYr;


    // agar pure data members ko ek sath value assign krna ho toh paramaterized constructor use karo
    public Film(int filmID, String filmName, String genre, String language, double relYr) {
        this.filmID = filmID;
        this.filmName = filmName;
        this.genre = genre;
        this.language = language;
        this.relYr = relYr;
    }

    // agar object ko directly print krna ho toh to toString function use karo
    @Override
    public String toString() {
        return "Film{" +
                "filmID=" + filmID +
                ", filmName='" + filmName + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", relYr=" + relYr +
                '}';
    }

    // agar individually get data krna ho toh  getters use karo
    public int getFilmID() {
        return filmID;
    }

    // agar individually set data krna ho toh setters use karo
    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getRelYr() {
        return relYr;
    }

    public void setRelYr(double relYr) {
        this.relYr = relYr;
    }
}
