import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER A NUMBER - ");
        int n = s.nextInt();

        boolean isPrime = true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }

        if (isPrime==true) {
            System.out.printf("%d IS A PRIME NUMBER.",n);
        }else{
            System.out.printf("%d IS NOT A PRIME NUMBER",n);
        }


    }
}
