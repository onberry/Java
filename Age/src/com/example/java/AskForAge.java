package com.example.java;

import java.util.Scanner;

/**
 * Created by Ola on 2016-05-03.
 */
public class AskForAge {

        String userInput;

        String askForAge() {
            System.out.println("What's your age: ");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.next();
            return userInput;
        }
}
