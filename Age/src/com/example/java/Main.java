package com.example.java;

import static java.lang.Math.abs;

public class Main {



    public static void main(String[] args) {

        //ask for age
        AskForAge ag = new AskForAge();
        String userInput = ag.askForAge();

        //validate input
        AgeValidation av = new AgeValidation();
        int yourAge = av.parseAge(userInput);
        System.out.println("Parsed age: " + av.parseAge(
                userInput));

        //calculate years left
        YearsLeftCalculation yl = new YearsLeftCalculation();
        int yourYears =  yl.yearsLeftCalculation(yourAge);

        //output a massage
        if (yourYears > 0){
            System.out.println("You have " + yourYears + " years to live");

        }
        else if (yourYears == 0){
            System.out.println("Sorry, you have no more years to live ");

        }
        else{
            System.out.println("Congrats! You're still alive even though you should be dead for "+abs(yourYears)+" years now! ");

        }


    }


}
