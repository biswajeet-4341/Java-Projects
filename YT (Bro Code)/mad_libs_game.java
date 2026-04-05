import java.util.Scanner;

public class mad_libs_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String adjective1, noun1, adjective2, verb1, adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = sc.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = sc.nextLine();

        System.out.println("\nToday, I went to a " + adjective1 + " class.");
        System.out.println("In the class, I saw " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "."); 

        sc.close();
    }
}
