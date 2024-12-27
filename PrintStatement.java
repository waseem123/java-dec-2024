public class PrintStatement {
    public static void main(String[] args) {
        String language = "Java";
        String type = "Static";
        String execution = "Compiled and Interpreted";

        /* 1st way to print
         * 
        */
        System.out.println("Programming Language - "+language);
        System.out.println("Language  Type - "+type);
        System.out.println("Execution - "+execution);

        /* 2nd Way to print */
        System.out.println("My favourite programming language is "+language+".\nIt is "+type+" language.\nIts execution is "+execution+".");

        /* 3rd wayt to print */
        System.out.printf("My favourite programming langugage is %s. It is a %s language. Its execution is %s.", type,language,execution);
    }
}
