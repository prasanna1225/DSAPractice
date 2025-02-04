package Arrays;

import java.util.Scanner;

public class SumandAvg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int avg=0;
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
        }
        System.out.println(sum);
        avg=sum/ arr.length;

        System.out.println(avg);
    }
}
