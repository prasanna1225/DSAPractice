package SortingAlgos;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int len= sc.nextInt();
        int[] arr= new int[len];
        for(int i=0; i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        for(int i=0;i<len;i++){

            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("\nAfter sorting : ");
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }

}
