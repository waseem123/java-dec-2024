import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER - ");
        int num1 = s.nextInt();
        System.out.println("ENTER SECOND NUMBER -");
        int num2 = s.nextInt();

        int result = num1 * num2;
        System.out.println("MULTIPLICATION IS - "+result);
    }
}
