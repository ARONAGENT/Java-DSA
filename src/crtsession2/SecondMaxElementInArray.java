package crtsession2;

public class SecondMaxElementInArray {
    public static void main(String[] args) {
        int[] arr={34,56,54,32,89,99,100};

        int temp=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j=0;j< arr.length-i-1;j++){
              if(arr[j]<arr[j+1]) {
                  temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
              }
          }
        }

        System.out.println(arr[1]);
    }
}
