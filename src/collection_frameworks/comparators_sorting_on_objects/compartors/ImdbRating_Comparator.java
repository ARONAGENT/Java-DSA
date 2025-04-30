package collection_frameworks.comparators_sorting_on_objects.compartors;

import collection_frameworks.comparators_sorting_on_objects.Film;

import java.util.Comparator;

public class ImdbRating_Comparator implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        return Double.compare(o1.getImdbRating(), o2.getImdbRating());
    }
}
