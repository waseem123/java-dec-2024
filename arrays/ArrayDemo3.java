import java.util.Scanner;

class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.println("ENTER 5 ELEMENTS OF ARRAY");
        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }

        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
