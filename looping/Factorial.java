import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO CALCULATE THE FACTORIAL - ");
        int n = s.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }

        System.out.println("FACTORIAL OF " + n + " IS - "+fact);
    }
}