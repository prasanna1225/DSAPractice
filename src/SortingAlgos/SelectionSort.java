package SortingAlgos;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int len= sc.nextInt();
        int[] arr= new int[len];
        for(int i=0; i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sorting : ");
        for (int l : arr) {
            System.out.print(l + " ");
        }

        for(int i=0;i<len-1;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if (arr[minIndex]>arr[j]) {
                    minIndex=j;
                }
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }

        System.out.println("\nAfter sorting : ");
        for (int i : arr){
            System.out.print(i+ " ");
        }
    }
}
