import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows:");
        int m=sc.nextInt();
        System.out.println("enter number of columns:");
        int n=sc.nextInt();
        int arr[][] =new int[m][n];
        System.out.println("enter elements of array ");
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= sc.nextInt();

            }
        }
        System.out.println("the array is ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n ;j++){
                System.out.println(arr[i][j]+" ");
            }
        }
        System.out.println();

    }

}
