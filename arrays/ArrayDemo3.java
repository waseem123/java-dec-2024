import java.util.Scanner;

class ArrayDemo3 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner s = new Scanner(System.in);

        System.out.println("ENTER 5 ELEMENTS OF ARRAY");
        for(int i=0;i<arr.length;i++){
            arr[i] = s.next();
        }

        // for (int i=0;i<arr.length;i++) {
        //     System.out.println(arr[i]);
        // }

        for(String i : arr){
            System.out.println(i);
        }
    }
}