import java.util.Scanner;
public class UserInput2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER RADIUS OF CIRCLE - ");
        double radius = s.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("AREA OF CIRCLE IS - "+area);
    }
}
