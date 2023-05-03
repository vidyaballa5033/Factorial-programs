import java.util.Scanner;
public class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        sc.close();

        double delta = b * b - 4 * a * c;
        double root1, root2;

        if(delta > 0) {
            root1 = (-b + Math.sqrt(delta))/(2*a);
            root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("The roots of the quadratic equation are: " + root1 + " and " + root2);
        } else if(delta == 0) {
            root1 = -b / (2*a);
            System.out.println("The root of the quadratic equation is: " + root1);
        } else {
            System.out.println("The quadratic equation has no real roots.");
        }
    }
}
