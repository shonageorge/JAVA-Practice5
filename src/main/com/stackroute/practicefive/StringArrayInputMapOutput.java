package com.stackroute.practicefive;

//3. Write a program where an array of strings is input and output is a Map<String,boolean> where
//        each different string is a key and its value is true if that string appears 2 or more times in the array

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringArrayInputMapOutput {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit=scanner.nextInt();                                                 // reading the limit
        String[] stringArrayInput=new String[limit];

        System.out.print("Enter the String array");

        for (int i=0;i<limit;i++) {
            stringArrayInput[i]=scanner.next();                                      //reading input to string array
        }
        System.out.println("String : "+Arrays.toString(stringArrayInput));

        Map<String,Boolean> hashmap=new HashMap<>();

        for(String c:stringArrayInput){
            if(hashmap.containsKey(c)){                                             //checking if the character in is present more than once in the map
                hashmap.put(c,true);                                                //if present return true
            }
            else
                hashmap.put(c,false);
        }
        System.out.println(hashmap);

    }
}
