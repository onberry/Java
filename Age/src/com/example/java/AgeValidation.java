package com.example.java;

import java.util.Scanner;

/**
 * Created by Ola on 2016-05-02.
 */
public class AgeValidation {

    int yourAge;

    int parseAge(String userInput){
        try {
            yourAge = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("This is not a number. Please enter a number. ");
            AskForAge ag = new AskForAge();
            ag.askForAge();

        }
        return yourAge;

    }
}
