package strings;

public class CompareString {
    public static void main(String[] args) {
        String name1="Rohan";
        String name2="Rohan";
        String name3="Rahul";
        String name4="Rahul";

        // first methods
        if(name1==name2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        // first methods fails
        if(new String("Shipstein") == new String("Shipstein")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // second method
        if(name1.compareTo(name3)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // third method
        if(name3.equals(name4)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }


    }
}
