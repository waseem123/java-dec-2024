import java.util.*;

public class UserInput3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER FIRSTNAME");
        String name = s.next();
        System.out.println("ENTER SURNAME");
        String surname = s.next();

        String fullname = name +" "+ surname;
        System.out.println("FULL NAME IS - "+fullname);
    }
}
