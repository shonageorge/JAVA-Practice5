package com.stackroute.practicefive;

//2. Write a program to find the number of counts in the following String. Store the output in
//        Map<String,Integer> as key value pair.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfCounts {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String string = scanner.nextLine();                                                    //Reading String

        Pattern pattern = Pattern.compile("[$&+,:;=?@#|'<>. -^*()%!_]");                       //checking special symbols using Regular expression
        Matcher m = pattern.matcher(string);

        if (m.find()) {                                                                        //if found replace it with space
            string = m.replaceAll(" ");
        }
        System.out.println(string);

        String[] stringArray = string.split(" ");                                        //splitting with space and storing it in string array

        Map<String, Integer> hashmap = new HashMap<>();

        for (String c : stringArray) {                                                          //checking the occurrence of word
            if (hashmap.containsKey(c)) {
                hashmap.put(c, hashmap.get(c) + 1);
            } else
                hashmap.put(c, 1);
        }
        hashmap.remove("");
        System.out.println(hashmap);
    }
}
