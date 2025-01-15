import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c;
        int total_bill = 0;

        do {
            System.out.println("1. Biryani      - INR. 190");
            System.out.println("2. Shawarma     - INR. 110");
            System.out.println("3. Paneer Pizza - INR. 200");
            System.out.println("4. Vada Pav     - INR. 15");
            System.out.println("5. Dosa         - INR. 60");
            System.out.println("___________________________");
            System.out.print("ENTER YOUR CHOICE - ");
            int choice = s.nextInt();
            int quantity = 0;
            int bill = 0;
            switch (choice) {
                case 1:
                    System.out.print("ENTER THE QUANTITIY OF BIRYANI - ");
                    quantity = s.nextInt();
                    bill = quantity * 190;
                    total_bill += bill;
                    System.out.printf("YOUR BILL FOR %d BIRYANI(s) IS INR. %d", quantity, bill);
                    break;
                case 2:
                    System.out.print("ENTER THE QUANTITIY OF SHAWARMA - ");
                    quantity = s.nextInt();
                    bill = quantity * 110;
                    total_bill += bill;
                    System.out.printf("YOUR BILL FOR %d SHAWARMA(s) IS INR. %d", quantity, bill);
                    break;
                case 3:
                    System.out.print("ENTER THE QUANTITIY OF PANEER PIZZA - ");
                    quantity = s.nextInt();
                    bill = quantity * 200;
                    total_bill += bill;
                    System.out.printf("YOUR BILL FOR %d PANEER PIZZA(s) IS INR. %d", quantity, bill);
                    break;
                case 4:
                    System.out.print("ENTER THE QUANTITIY OF VADA PAV - ");
                    quantity = s.nextInt();
                    bill = quantity * 15;
                    total_bill += bill;
                    System.out.printf("YOUR BILL FOR %d VADA PAV(s) IS INR. %d", quantity, bill);
                    break;
                case 5:
                    System.out.print("ENTER THE QUANTITIY OF DOSA - ");
                    quantity = s.nextInt();
                    bill = quantity * 60;
                    total_bill += bill;
                    System.out.printf("YOUR BILL FOR %d DOSA(s) IS INR. %d", quantity, bill);
                    break;
                default:
                    System.out.println("INVALID CHOICE! PLEASE ENTER CORRECT NUMBER FOR THE GIVEN MENU.");
            }
            System.out.print("PRESS 1 TO CONTINUE...");
            c = s.nextInt();
        } while (c == 1);
        System.out.println("YOUR TOTAL BILL IS - "+total_bill);
        System.out.println("THANKS! VISIT AGAIN.");
    }
}
