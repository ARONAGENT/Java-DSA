package characters;

public class ToCharArray {
    public static void main(String[] args) {
        String name="Rohan";

        char[] array=name.toCharArray();
        for (char ch:array){
            System.out.print(ch+" ");
        }
    }
}
