import java.util.Scanner;

public class zeroSum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the integers:");
        for(int i=0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i=0;i<n-2;i++ ){
            for(int j=0;j<n-1;j++){
                for (int k=0;k<n;k++){
                    if (arr[i]+arr[j]+arr[k]==0) {
                        System.out.println(arr[i]+"" +arr[j]+""+arr[k]);
                    }
                }
            }
        }
        System.out.println("Number of distinct triplets: " + count);


    }
}