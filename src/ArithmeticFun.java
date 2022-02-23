public class ArithmeticFun {

    public static void main(String[] args) {

        int a = 20;
        int b=30;

        //BINARY OPERATORS
        int sum = a+b;
        int diff = b-a;
        int prod = a*b;
        int quot = b/a;
        int rem = b%a;

        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + diff);
        System.out.println("Product is " + prod);
        System.out.println("Quotient is " + quot);
        System.out.println("Remainder is " + rem);

        //BINARY OPERATOR -- COMPOUND/SHORT-HAND OPERATOR
        sum+=10;
        System.out.println("Sum is " + sum);
        prod*=2;
        System.out.println("Product is " + prod);

        //UNARY OPERATOR
        sum++;
        System.out.println("Sum is " + sum);
        sum--;
        System.out.println("Sum is " + sum);
    }
}
