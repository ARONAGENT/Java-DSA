package collection_frameworks.comparators_sorting_on_objects;

public class Film{
    private int filmId;
    private String filmName;
    private String genre;
    private String language;
    private int relYr;
    private double imdbRating;

    public Film(int filmId, String filmName, String genre, String language, int relYr, double imdbRating) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.genre = genre;
        this.language = language;
        this.relYr = relYr;
        this.imdbRating = imdbRating;
    }


    public int getFilmId() {
        return filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public int getRelYr() {
        return relYr;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", filmName='" + filmName + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", relYr=" + relYr +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
