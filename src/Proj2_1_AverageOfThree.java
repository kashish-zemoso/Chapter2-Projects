import java.util.Scanner;

public class Proj2_1_AverageOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double val1,val2,val3;

        System.out.println("Enter three Real numbers");
        val1=input.nextDouble();
        val2=input.nextDouble();
        val3=input.nextDouble();

        double ans = (val1 + val2 +val3)/3;
        System.out.println("Average of three real nos " +ans);
    }
}
