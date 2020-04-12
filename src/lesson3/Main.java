package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "Шакал шагал шакал скакал купи кипу пик пик кипу купи купи кипу пуха кипу пуха купи повар Петр повар Павел Петр плавал Павел плавал";
        String [] str = s.split(" ");
        String [] str1 = {"a1a","bb","cc","aa","dd","cc","aa"};

        deleteDuplicates(str);
        countElement(str);

    }

    private static void deleteDuplicates(String[] str) {
        HashSet<String> hSet = new HashSet<>();
        for (int i = 0; i <str.length ; i++) {
            hSet.add(str[i]);
        }
        System.out.println(hSet);
    }

    public static void countElement (String[] str){
        Integer Count = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : str){
            Count = map.get(s);
            if (Count != null) {
                ++Count;
            } else {
                Count = 1;
            }
            map.put(s,Count);
        }
        System.out.println(map);
    }

}
