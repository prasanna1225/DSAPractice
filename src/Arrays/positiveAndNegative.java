package Arrays;

import java.util.Scanner;

public class positiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Negative numbers");
        for(int j=0;j< arr.length;j++){
            if(arr[j]<0){
                System.out.println(arr[j]+" ");
            }
        }
        System.out.println();
        System.out.println("Positive numbers");
        for(int j=0;j< arr.length;j++){
            if(arr[j]>0){
                System.out.println(arr[j]+" ");
            }
        }

    }
}
