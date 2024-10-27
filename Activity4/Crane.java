/*
 * This is coded by Adriaan Dimate.
 */
import java.util.Scanner;

public class CramersRuleSolver {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("coefficients a1, b1, c1 ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();

        System.out.print("coefficients a2, b2, c2 ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();

        double determinant = a1 * b2 - a2 * b1;
        
        if (determinant == 0) {
            System.out.println("System has 0 unique solutions available, consult your doctor");
        } else {
            double determinantX = c1 * b2 - c2 * b1;
            double determinantY = a1 * c2 - a2 * c1;

            double x = determinantX / determinant;
            double y = determinantY / determinant;

            System.out.println("Solution is:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        scanner.close();
    }
}
