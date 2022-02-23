import java.util.Scanner;

public class Proj2_2_MadLibsClone {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String adjective1, adjective2, adjective3;
        String girlName, boyName, manName;
        String occupation1, occupation2, hobby, place, clothing;

        System.out.println("Enter an adjective: ");
        adjective1 = input.nextLine();
        System.out.println("Enter a girl's name: ");
        girlName = input.nextLine();
        System.out.println("Enter another adjective: ");
        adjective2 = input.nextLine();
        System.out.println("Enter an occupation: ");
        occupation1 = input.nextLine();
        System.out.println("Enter name of place: ");
        place = input.nextLine();
        System.out.println("Enter name of Clothing: ");
        clothing = input.nextLine();
        System.out.println("Enter a hobby: ");
        hobby = input.nextLine();
        System.out.println("Enter another adjective: ");
        adjective3 = input.nextLine();
        System.out.println("Enter another occupation: ");
        occupation2 = input.nextLine();
        System.out.println("Enter Boy's name: ");
        boyName = input.nextLine();
        System.out.println("Enter Man's name: ");
        manName = input.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlName +
                ", who was a " + adjective2 + " " + occupation1 + " in the kingdom of " + place +
                ". She loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the "
                + adjective3 + " " + occupation2 + " named " + boyName + " but her father, king "
                + manName + " forbid her from seeing him.");
    }
}
