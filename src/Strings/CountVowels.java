package Strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
