package collection_frameworks.comparators_sorting_on_objects;

import collection_frameworks.comparators_sorting_on_objects.compartors.FilmName_Comparator;
import collection_frameworks.comparators_sorting_on_objects.compartors.ImdbRating_Comparator;
import collection_frameworks.comparators_sorting_on_objects.compartors.RelYr_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CreateFilm {
    public static void main(String[] args) {
        ArrayList<Film> filmArrayList=new ArrayList<>();

        Film f1 = new Film(101, "Inception", "Sci-Fi", "English", 2010, 8.8);
        Film f2 = new Film(102, "3 Idiots", "Drama", "Hindi", 2009, 8.4);
        Film f3 = new Film(103, "The Dark Knight", "Action", "English", 2008, 9.0);
        Film f4 = new Film(104, "Dangal", "Biography", "Hindi", 2016, 8.3);
        Film f5 = new Film(105, "Interstellar", "Sci-Fi", "English", 2014, 8.6);

        filmArrayList.add(f1);
        filmArrayList.add(f2);
        filmArrayList.add(f3);
        filmArrayList.add(f4);
        filmArrayList.add(f5);

        System.out.println(filmArrayList);

        System.out.println("By Films Name Sorted ArrayList ->");
        Collections.sort(filmArrayList,new FilmName_Comparator());

        for(Film names: filmArrayList){
            System.out.println(names);
        }

        System.out.println("By RelYr Sorted ArrayList ->");
        Collections.sort(filmArrayList,new RelYr_Comparator());

        for(Film relYr: filmArrayList){
            System.out.println(relYr);
        }

        System.out.println("By Imdb Rating Sorted ArrayList ->");
        Collections.sort(filmArrayList,new ImdbRating_Comparator());

        for(Film Imdb: filmArrayList){
            System.out.println(Imdb);
        }

        System.out.println("By Film Name  Sorted ArrayList in reverseOrder->");
        //Collections.sort(filmArrayList,Collections.reverseOrder(new ImdbRating_Comparator()));
        //  or
        filmArrayList.sort(Collections.reverseOrder(new ImdbRating_Comparator()));

        for(Film Names: filmArrayList){
            System.out.println(Names);
        }
    }
}
