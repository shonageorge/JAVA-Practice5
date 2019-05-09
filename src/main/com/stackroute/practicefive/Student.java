package com.stackroute.practicefive;

//4. Create a Student class that represents the following information of a student: id, name, and age
//        all the member variables should be private .
//        a. Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `Maintest` create Student class object(minimum 5)
//        d. Add these student object into a List of type Student .
//        e. Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.

import java.util.*;

public class Student {


    int id;
    String name;
    int age;

    //getter and setter for id, name and age

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class StudentSorter implements Comparator<Student> {                               //class that implements an interface Comparator

    @Override
    public int compare(Student obj1, Student obj2) {
        int count = 0;

        //sorting based on age

        if (obj1.getAge() > obj2.getAge())
            count = 1;

        else if (obj1.getAge() < obj2.getAge())
            count = -1;

        else if (obj1.getAge() == obj2.getAge()) {

            //if age is same ,sorting based on name and id

            count = obj1.getName().compareTo(obj2.getName());

            if (count == 0) {

                if (obj1.getId() > obj2.getId())
                    count = 1;

                else if (obj1.getId() < obj2.getId())
                    count = -1;
            }
        }

        return count;
    }
}

class Maintest {
    public static void main(String[] args) {

        //objects creation for Student class

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        //calling getter and setter using objects

        student1.setAge((30));
        student1.setId(1);
        student1.setName("Miya");

        student2.setAge(22);
        student2.setId(4);
        student2.setName("priya");

        student3.setAge(21);
        student3.setId(2);
        student3.setName("Anu");

        student4.setAge(27);
        student4.setId(8);
        student4.setName("Sera");

        student5.setAge(32);
        student5.setId(6);
        student5.setName("Tina");


        ArrayList<Student> list = new ArrayList<>();

        //adding objects to list

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        System.out.println("Before Sorting ");                                    //printing list before sorting
        for (Student student : list) {
            System.out.print("ID :" + student.getId() + "  ");
            System.out.print("Name :" + student.getName() + "  ");
            System.out.println("Age " + student.getAge() + "  ");

        }

        Collections.sort(list, new StudentSorter());

        System.out.println("After sorting ");                                      //printing liat after sorting
        for (Student student : list) {
            System.out.print("ID :" + student.getId() + "  ");
            System.out.print("Name :" + student.getName() + "  ");
            System.out.println("Age " + student.getAge() + "  ");

        }
    }
}