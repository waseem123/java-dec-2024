import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER A NUMBER - "); //8
        int number = s.nextInt();
        int count = 0;
        while (number!=0) {
            count++;
            number = number / 10;
        }
        System.out.printf("THERE ARE %d DIGITS PRESENT IN THE NUMBER",count);
    }
}
