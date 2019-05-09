package com.stackroute.practicefive;

//1. Write a Java program to update specific array element by given element and empty the array list.

import java.util.*;

public class UpdateArraylistElements {

    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Grape", "Melon", "Berry"};
        updateList(stringArray);
    }

    public static void updateList(String[] stringArray) {
        List<String> originalList = new ArrayList<>();

        for (String s : stringArray) {
            originalList.add(s);                                                              //adding string array to list
        }
        System.out.println("Orginal List is : " + originalList);


        int indexApple = originalList.indexOf("Apple");                                       //getting the index of apple
        int indexMelon = originalList.indexOf("Melon");                                       //getting the index of melon

        originalList.set(indexApple, "Kiwi");                                                 //replacing the index of apple with kiwi
        originalList.set(indexMelon, "Mango");                                                //replacing the index of melon with mango

        System.out.println("New List is : " + originalList);

        originalList.clear();                                                                  //clearing the list
        System.out.println("List after removing elements : " + originalList);
    }

}
