import java.util.Scanner;

public class Story {
    public static void main(String[] args){
        //Mad Libs Games
        Scanner scanner = new Scanner(System.in);

        String noun1;
        String adjective1;
        String noun2;
        String adjective2;
        String noun3;
        String verb1;
        String verb2;

        System.out.print("Enter an noun (Food item): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective: (How it was in taste)");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an noun (Address): ");
        noun2 = scanner.nextLine();
        System.out.print("Enter an adjective (feeling): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter an noun (Any person): ");
        noun3 = scanner.nextLine();
        System.out.print("Enter an verb:(Method) ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an verb (Feeling): ");
        verb2 = scanner.nextLine();

        System.out.println("Today Sony prepared " + noun1);
        System.out.println(" Those are actually" + adjective1 + "!");
        System.out.println("It made me remind food prepared at" + noun2 + ".");
        System.out.println("I wish we will again have such a" + adjective2 + " time soon !");
        System.out.println("That too with the" + noun3 );

        System.out.println("bdw sona.. please don't eat fried paneer chilly while " + verb1 + " the same.");
        System.out.println("Chai.. " + verb2 + " Sona.. Sonulya!!");



        scanner.close();


    }
}
