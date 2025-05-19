package SearchingAlgos;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter target element");
        int target=sc.nextInt();
        int[] arr=new int[n];
        int left=0;
        int right= arr.length-1;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        while(left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target) {
                System.out.println("Found at "+mid);
                break;
            }else if(arr[mid]>target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
       

    }
}
