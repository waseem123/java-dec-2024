import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int n = s.nextInt(); //4
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }

        System.out.println("SUM OF 1 TO "+n+" IS - "+sum);
    }
}
