package com.example.java;

/**
 * Created by Ola on 2016-05-02.
 */
public class YearsLeftCalculation {

    private int yearsToLive;
    private int maxAge = 100;

    int yearsLeftCalculation(int yourAge) {

        this.yearsToLive = maxAge - yourAge;



        return yearsToLive;

    }
}
