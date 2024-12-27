class LogicalOperators{
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("_____AND_____");
        System.out.println(x>y && y>2); //true
        System.out.println(5>y && y>2); // false
        System.out.println(x>y && y<2); // false
        System.out.println(5>x && x<2); // false

        System.out.println("_____OR_____");
        System.out.println(x>y || y>2); // true
        System.out.println(5>y || y>2); // true
        System.out.println(x>y || y<2); // true   
        System.out.println(5>x || x<2); // false
        
        System.out.println("_____NOT_____");
        System.out.println(!(x>y));
        System.out.println(!(x<y));
        System.out.println(!(5>x || x<2));

        x = 10;
        y = 5;

        System.out.println((x<y && !(y<2)));
        System.out.println(!(!(x<y) && !(y<2)));
        
    }
}