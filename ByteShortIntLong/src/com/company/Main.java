package com.company;

public class Main {

    public static void main(String[] args) {
        int myMaxValue = Integer.MAX_VALUE;
        int myMinValue = Integer.MIN_VALUE;
        System.out.println("Integer Max Value " + myMaxValue);
        System.out.println("Integer Min Value " + myMinValue);
        System.out.println("Integer Busted Value " + (myMaxValue + 1));

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte Max Value " + myMaxByteValue);
        System.out.println("Byte Min Value " + myMinByteValue);


        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short Max Value " + myMaxShortValue);
        System.out.println("Short Min Value " + myMinShortValue);

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Max Value " + myMaxLongValue);
        System.out.println("Long Min Value " + myMinLongValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
