package Strings;

import java.util.Scanner;

public class Palindrom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String lowStr = str.toLowerCase();
        boolean flag=true;
        for (int i = 0; i < lowStr.length() / 2; i++) {
            if (lowStr.charAt(i) !=lowStr.charAt(lowStr.length() - i - 1) ){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a Palindrom");
        }
    }
}