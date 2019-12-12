package com.company;

public class Main {

    public static void main(String[] args) {
        float myFloatMaxValue = Float.MAX_VALUE;
        float myFloatMinValue = Float.MIN_VALUE;
        System.out.println("Float Max = " + myFloatMaxValue);
        System.out.println("Float Min = " + myFloatMinValue);

        double myDoubleMaxValue = Double.MAX_VALUE;
        double myDoubleMinValue = Double.MIN_VALUE;
        System.out.println("Double Max = " + myDoubleMaxValue);
        System.out.println("Double Min = " + myDoubleMinValue);

        int myInt = 5;
        float myFloat = 5f;
        double myDouble = 5d;
        System.out.println("Int " + myInt);
        System.out.println("myFloat " + myFloat);
        System.out.println("myDouble " + myDouble);

        //convert kilo into pound
        double kilogram = 5d;
        double convertedPounds = kilogram / 0.453592d;
        System.out.println(kilogram + " kilo Equal to "+ convertedPounds + " Pounds");

        //convert pound into kilo
        double pounds = 200d;
        double convertKilo = pounds * 0.453592d;
        System.out.println(pounds + " pounds Equal To "+ convertKilo + " Kilo");
    }
}
