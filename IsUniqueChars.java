package com.company;

/**
 * Created by Tianran on 8/10/2016.
 *  Implement an algorithm to determine if a string has
 *  all unique characters.
 *  What if you cannot use additional data structure?
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
}
