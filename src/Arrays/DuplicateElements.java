package Arrays;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int visited=-1;
        int[] arr = new int[n];
        int[] fr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i< arr.length;i++){
            int count=1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]=visited;
                }
            }
            if(count>1){
            if(fr[i]!=visited){
                fr[i]=arr[i];
                }
            }
        }
        for(int i=0;i<fr.length;i++){
            if(fr[i]!=visited && fr[i]!=0)
            System.out.println("duplicate elements are : "+fr[i]);
        }
    }
}
