package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is string";
        System.out.println("my string is equal to " + myString);
        myString = myString + " add more";
        System.out.println(myString);
        myString = myString + " \u00A9";
        System.out.println(myString);
        String myNumberString = "249.50";
        myNumberString = myNumberString + "4.55";
        System.out.println(myNumberString);
        // check Datatype
        System.out.println("Data Type of myNumber is" + myNumberString.getClass().getSimpleName());

        //add int into string
        String myLastString = "50";
        int myInt = 40;
        myLastString = myLastString + myInt;
        System.out.println("My String is Equal to " + myLastString);


        //add string into int
        //this will produce error
        //myInt = myInt + myLastString;
        //System.out.println(myInt);
    }
}
