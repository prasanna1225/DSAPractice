package Arrays;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int visited=-1;
        int[] arr = new int[n];
        int[] fr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j< arr.length;j++){
            int count=1;
            for(int k=j+1;k< arr.length;k++){
                if(arr[j]==arr[k]){
                    count++;
                    fr[k]=visited;
                }
            }
            if(fr[j]!=visited){
                fr[j]=count;
            }
        }
        for(int i=0;i< fr.length;i++){
            if(fr[i]!=visited){
                System.out.println("element : "+arr[i] +" count : " +fr[i]);
            }
        }
    }
}
