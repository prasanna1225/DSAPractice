package Strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }
}
