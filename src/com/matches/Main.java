// Java program to check if parts of strings equal

package com.matches;

// Main class
public class Main {

    // Main class to run java program
    public static void main(String[] args) {

        // Creating two strings to compare their parts
        String str = "I am String";
        String str1 = "New String";

        // Checking if offset from index 5 of str is the same with offset of str1 from index 4
        System.out.println(str.regionMatches(5, str1, 4, 3)); // true

        // Checking if offset from index 4 of str is the same with offset of str1 from index 4
        System.out.println(str.regionMatches(4, str1, 4, 3)); // false
    }
}