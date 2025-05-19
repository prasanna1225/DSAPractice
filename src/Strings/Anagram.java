package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String s1 = str1.replace("\\s+", "").toLowerCase();
        String s2 = str2.replace("\\s+", "").toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("NOT ANAGRAM");
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1,arr2)){
                System.out.println("ANAGRAM");
            }else{
                System.out.println("NOT ANAGRAM");
            }

        }
    }
}
