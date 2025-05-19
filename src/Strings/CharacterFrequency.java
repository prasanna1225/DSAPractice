package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String cleanStr=str.replace("\\s+","").toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:cleanStr.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
