import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double height = 0;
        double radius = 0;
        double area = 0;
        double volume = 0;

        //Area of the circle

        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();

        area = 3.14 * radius * radius;

        System.out.println("Area of the Circle:" + area);

        // volume of the circle

        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();

        volume = radius * radius * radius;

        System.out.println("Volumn of the triangle: " + volume);

        //Area of Triangle


        System.out.print("Enter the Width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the Height: ");
        height = scanner.nextDouble();

        area = 0.5 * height * width ;

        System.out.println("Area of the Triangle: " + area);



        // Area of square

        System.out.print("Enter the Length: ");
        length = scanner.nextDouble();

        area = length * length;

        System.out.println("Area of the Square: " + area);



        //Area of Rectangle

        System.out.print("Enter the Length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the Width: ");
        width = scanner.nextDouble();

        area = length * width;

        System.out.println("Area of the Rectangle :" + area);





        scanner.close();


    }
}

