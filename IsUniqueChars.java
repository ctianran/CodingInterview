package com.company;

/**
 * Created by Tianran on 8/10/2016.
 *  Implement an algorithm to determine if a string has
 *  all unique characters.
 *  What if you cannot use additional data structure?
 *
 *  Time complexity : O(n)
 */

public class IsUniqueChars {
    boolean isUniqueChars(String str){
        if (str.length() > 128){
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    boolean isUniqueCharsII(String str){
        int checker = 0;
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
