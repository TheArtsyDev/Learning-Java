import java.util.Scanner;

public class Mains {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your name: ");
String name = scanner.nextLine();

System.out.println("Hellow" + name);

System.out.println("Enter your Year Of Birth: ");

int yearOfBirth =Integer.parseInt(scanner.nextLine());

int age = 2025 - yearOfBirth;
System.out.println(name + "Your age is " + age );


scanner.close();

}

}