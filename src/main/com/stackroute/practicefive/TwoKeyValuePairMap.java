package com.stackroute.practicefive;

//5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//        Modify and return the given map as follows:
//        a. If the key `val1` has a value, set the key `val2` to have that value, and
//        b. Set the key `val1` to have the value `" "` (empty string).
//        Example 1:
//        The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
//        "java"}
//        Example 2:
//        The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":
//        "mars"}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TwoKeyValuePairMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value1 : ");
        String value1 = scanner.next();                                                        //reading value1
        System.out.print("Enter the value2 : ");
        String value2 = scanner.next();                                                        //reading value2
        System.out.println(acceptObject(value1, value2));
    }

    public static Map<String, String> acceptObject(String value1, String value2) {
        Map<String, String> map = new TreeMap<>();
        map.put("val1", value1);                                                               //adding to map
        map.put("val2", value2);
        System.out.println(map);

        map.put("val1", "");
        map.put("val2", value1);
        return map;
    }
}
