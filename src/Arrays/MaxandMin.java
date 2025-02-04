package Arrays;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
        }
            if(arr[j]<min){
                min=arr[j];
            }

    }
        System.out.println(max);
        System.out.println(min);
    }
}
