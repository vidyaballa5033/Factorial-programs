import java.util.Scanner;

public class windChill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double t = sc.nextInt();
        double v = sc.nextInt();

        if (Math.abs(t) > 50 || v > 120 || v < 3) {
            System.out.println("The input values are not valid.");
        } else {
            double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * Math.pow(v, 0.16));
            System.out.println("The wind chill is " + windChill);
        }
    }

}
