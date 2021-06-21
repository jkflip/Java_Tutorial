public class Hello {

    // This is a method - It is a collection of statements that performs an operation. The following
    // is a main method i.e. it is the entry point of any Java code
    public static void main(String[] args) {

        // This is a statement - a complete command to be executed & can include
        // one or more expressions
        System.out.println("Hello World!"); // "" is a string literal

        // int is a primitive data type. Others include: boolean, byte, char, short, long, float & double
        int myFirstNumber = (5 + 10) + (2*10);  // specify the data type int
        System.out.println("This is my first number: " + myFirstNumber);  // Print the int, type sout to auto complete

        // Exercise 1
        int mySecondNumber = 12, myThirdNumber = myFirstNumber * 2; // Declaring variables
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("Concatenate: " + mySecondNumber + myThirdNumber);   // Joining 2 number together
        System.out.println("Addition: "+ myTotal);

        // Exercise 1.2
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

    


    }
}

