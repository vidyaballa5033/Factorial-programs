import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x value");
        int x = sc.nextInt();
        System.out.println("enter the y value ");
        int y = sc.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The Euclidean distance from the point (" + x + ", " + y + ") to the origin (0, 0) is: " + distance);
    }
}
