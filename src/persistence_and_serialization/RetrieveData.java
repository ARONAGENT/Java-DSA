package persistence_and_serialization;

import java.io.*;

public class RetrieveData {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("Films"));
        Films f= (Films) objectInputStream.readObject();
        f.showData();
        objectInputStream.close();
    }
}
