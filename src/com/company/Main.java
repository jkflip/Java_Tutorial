package com.company;    // This line is a Java package

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // Integer is a wrapper class for int primitive types (e.g. int -> Integer) to perform
        // operations on an int
        // 1 int = 32 bits (i.e. store up to 2^31)
        int myMinIntValue = Integer.MIN_VALUE;  // shows the min range of numbers can be stored
        int myMaxIntValue = Integer.MAX_VALUE;  // shows the max range of numbers can be stored
        System.out.println("Data Primitive Types: ");
        System.out.println("Section 1: Integer ===========================");
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1));    // try adding 1 to max range -> causes overflow
        System.out.println("Busted min value = " + (myMinIntValue - 1));    // try subtracting 1 to max range -> causes underflow

        // Another way of writing numbers that are too lengthy: use underscores
        int myMaxIntTest = 2_147_483_647;
        System.out.println("Alternative way of writing 2_147_483_647 = " +  myMaxIntTest + "\n");

        // Bytes - smaller data types than int. Use byte for performance reasons, if data is small
        // 1 Byte = 8 bits (i.e. store up to 2^7)
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Section 2: Byte ===========================");
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue + "\n");

        // Short
        // 1 short = 16 bits (i.e store up to 2^63)
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Section 3: Short ===========================");
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue + "\n");

        // Long
        // 1 Long = 64 bits
        long myLongValue = 100l;    // When assigning a long type value, add the letter "l" or "L" after the number

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Section 4: Long ===========================");
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        //long bigLongLiteralValue = 2_147_483_647_234;   // No "l" -> Gives an error
        long bigLongLiteralValue = 2_147_483_647_234l;  // "l" present -> No error
        System.out.println("Testing long literal value = " + bigLongLiteralValue + "\n");

        // Casting - treat/convert a number from one type to another
        int myTotal = (myMinIntValue / 2);  // No issues

        //byte myNewByteValue = (myMinByteValue / 2); // Gives an error because Java sees the right side of eqn as int
        byte myNewByteValue = (byte) (myMinByteValue / 2);  // Casting int to byte
        System.out.println("Section 5: Casting ===========================");
        System.out.println("The new min byte value = " + myNewByteValue);
    }
}
