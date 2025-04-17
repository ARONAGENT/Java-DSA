package oops.abstract_classes;

public class CricketPlayers extends Players {
    public static void main(String[] args) {
        //'Players' is abstract; cannot be instantiated
        // By means We cannot create object or instance of abstract class
        // here abstract class is players  hence it can't allow to create the object of the class
        // Players players=new Players() ;

        CricketPlayers cricketPlayers=new CricketPlayers();
        cricketPlayers.hello();
    }

}
