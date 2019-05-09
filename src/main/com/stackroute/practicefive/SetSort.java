package com.stackroute.practicefive;

//6. Write a program to implement set interface which sorts the given randomly ordered names in
//
//        ascending order. Convert the sorted set in to an array list

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = scanner.nextLine();                                          //Reading the input String

        String[] stringArray = string.split(" ");                              //Adding it to string array

        Set<String> sortset = new TreeSet<>();
        for (String e : stringArray) {
            sortset.add(e);                                                          //Sorting the set
        }
        System.out.println("Sorted set : " + sortset);

        ArrayList<String> arrayList = new ArrayList<>();

        for (String e : sortset) {
            arrayList.add(e);                                                         //adding it to arraylist
        }
        System.out.println("Array List : " + arrayList);
    }

}
