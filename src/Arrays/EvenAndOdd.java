package Arrays;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Even numbers ");
        for(int j=0;j<arr.length;j++) {
            if (arr[j] % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
        }
            System.out.println();
            System.out.println("Odd numbers :");
            for(int k=0;k<arr.length;k++) {
                if (arr[k] %2!= 0) {
                    System.out.print(arr[k] + " ");
                }

            }
        }

    }

