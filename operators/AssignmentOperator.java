class AssignmentOperator {
    public static void main(String[] args) {
        int n = 150;
        int m = n;
        int r = n*m;

        n += 10;  //n = n + 10;
        System.out.println(n);
        n-=20; // n = n - 20;
        System.out.println(n);

        n %= 10;
        System.out.println(n);
    }    
}
