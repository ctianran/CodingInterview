package com.company;

import java.util.Arrays;

/**
 * Created by Tianran on 8/12/2016.
 *
 * Given two strings, write a method to decide if one is a permutation
 * of the other
 *
 */
public class CheckPermutation {
    //Solution1:
    //Sort the strings

    boolean permutationI(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }


    boolean permutationII(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] letters = new int[128];   // Ascii
        for(int i = 0; i < s.length(); i ++){
            letters[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++){
            letters[t.charAt(i)]--;
            if(letters[t.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }


}
