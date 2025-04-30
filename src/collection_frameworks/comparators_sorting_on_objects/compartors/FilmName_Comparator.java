package collection_frameworks.comparators_sorting_on_objects.compartors;

import collection_frameworks.comparators_sorting_on_objects.Film;

import java.util.Comparator;

public class FilmName_Comparator implements Comparator<Film> {

    @Override
    public int compare(Film o1, Film o2) {
        return o1.getFilmName().compareTo(o2.getFilmName());
    }
}
