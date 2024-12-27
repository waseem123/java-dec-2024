public class LargestNumber {
    public static void main(String[] args) {
        int n1 = 1250;
        int n2 = 250;
        int n3 = 1250;

        if(n1>n2 && n1>n3){
            System.out.printf("%d IS LARGER THAN %d AND %d",n1,n2,n3);
        }else if(n2>n1 && n2>n3){
            System.out.printf("%d IS LARGER THAN %d AND %d",n2,n1,n3);
        }else if(n3>n1 && n3>n2){
            System.out.printf("%d IS LARGER THAN %d AND %d",n3,n1,n2);
        }else{
            System.out.println("EITHER OF THE NUMBER IS EQUAL TO ANOTHER");
        }
    }
}
