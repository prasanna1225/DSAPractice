package Strings;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String clean=str.replace("\\s+","").toLowerCase();
        String reverse=new StringBuilder(clean).reverse().toString();
       if(clean.equals(reverse)){
           System.out.println("palindrom");
       }else{
           System.out.println("Not palindrom");
       }
    }
}
