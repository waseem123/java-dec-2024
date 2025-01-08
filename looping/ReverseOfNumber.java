import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int number = s.nextInt();
        int temp = number;
        int remainder = 0;
        int rev = 0;
        while (temp!=0) {
            remainder = temp % 10;
            // System.out.println(remainder);
            rev = (rev * 10) + remainder;
            temp = temp / 10;
        }
        System.out.printf("REVERSE OF %d IS %d",number,rev);
    }
}
