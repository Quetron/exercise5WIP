package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<Integer, Person> contactInfoHashMap = new HashMap<Integer, Person>();
    static Scanner input = new Scanner(System.in);
    static String nameOfPerson = "";
    static Integer counter = 0;

    public static void addNewPeople(){
        while(!(nameOfPerson.equalsIgnoreCase("End"))){
            System.out.println("What is the name if your person?: ");
            nameOfPerson = input.nextLine();
            System.out.println("What is the Email of this person?: ");
            String emailOfPerson = input.nextLine();
            Person newPerson = new Person(nameOfPerson, emailOfPerson);
            contactInfoHashMap.put(counter, newPerson);
            counter ++;
        }
    }

    public static void main(String[] args) {
        addNewPeople();

    }
}