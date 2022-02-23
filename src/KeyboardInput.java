import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        String city;
        double val;
        System.out.println("What's your name?");
        name=keyboard.nextLine();

        System.out.println("What's your age?");
        age=keyboard.nextInt();
        keyboard.nextLine();                            //consume newline character

        System.out.println("Enter any real number");
        val=keyboard.nextDouble();                      //consume newline character
        keyboard.nextLine();
        val *= 2;

        System.out.println("What's your city?");
        city=keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Age is " + age);
        System.out.println("City is " + city);
        System.out.println("Real number is " + val);
    }
}
