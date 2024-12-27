public class NestedConditions {
    public static void main(String[] args) {
        int age = 2;
        if(age>=18){
            char votingId = 'n';
            if(votingId=='y'){
                System.out.println("CONGRATULATIONS! YOU CAN VOTE.");
            }else{
                System.out.println("SORRY! YOU CAN'T VOTE.");
            }
        }else{
            System.out.printf("GET LOST! GROW UP AND THEN COME FOR VOTING AFTER %d YEARS.",(18-age));
        }
    }
}
