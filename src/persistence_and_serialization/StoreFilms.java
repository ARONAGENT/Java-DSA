package persistence_and_serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreFilms {
    public static void main(String[] args) throws IOException {
        Films f=new Films();
        f.setFilmsId(1);
        f.setFilmName("PK");
        f.setGenre("comedy");
        f.setLanguage("hindi");
        f.setRating(8.3);
        f.setRelYr(2015);

        f.showData();

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("Films"));
        objectOutputStream.writeObject(f);
        System.out.println("Object is Stored in File....");
        objectOutputStream.close();
    }
}
