package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("AABBCDDEEFF"));
    }

    public static int firstUniqChar(String s) {



/*
a failed stream of thought here,
I tried adding my string to a set to remove duplicates
thinking that it would help, but it served no purpose
 */

//        s = new StringBuilder(s).reverse().toString();
//        char[] q = s.toCharArray();
//        ArrayList<Character> b = new ArrayList<>();
//
//        for(char a : q){
//            Character temp = a;
//            b.add(a);
//        }
//        Set<Character> myset = new LinkedHashSet<>(b);
//        for(Character a : myset){
//            System.out.println(a);
//        }
//        for(int i = s.length() -1 ; i > 0 ; i--){
//            if(myset.contains(s.charAt(i))){
//                return i;
//            }
//            else return -1;
//        }



        int counter = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            counter = 0;
            for (char a : arr) {
                if (s.charAt(i) == a) {
                    counter++;
                    if(counter >1){
                        break;
                    }
                }
            }
            if (counter == 1) {
                return i;
            }
        }
        return -1;
    }
}
