package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

    public class MainApplication {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean runCalculator= true;

        while(runCalculator){

            System.out.println("Welcome to my calculator: ");
            System.out.println("Please select 1 to add");
            System.out.println("Please select 2 to subtract");
            System.out.println("Please select 3 to multiply");
            System.out.println("Please select 4 to divide");
            System.out.println("Please select 5 to Square");
            System.out.println("Please select 6 for Square root");
            System.out.println("Please select 7 for exponents");
            System.out.println("Please select 8 to calculate the inverse of the number");
            System.out.println("Please select 9 to invert the sign of a number");
            System.out.println("Please select 10 for Sin of a number: ");
            System.out.println("Please select 11 for cos");
            System.out.println("Please select 12 for tan");
            System.out.println("Please select 13 for Inverse Sine ");
            System.out.println("Please select 14 for Inverse Cos");
            System.out.println("Please select 15 for Inverse Tan");
            System.out.println("Please select 16 for CubicRoot");
            System.out.println("Please select 17 for Factorial");// Not done yet but reese is doing this one.
            System.out.println("Please select 18 to exit");


            int num = input.nextInt();

            if (num == 1) {
                addNumber();
            }
            else if (num == 2) {
                subtractNumber();
            }
            else if (num == 3) {
                multiplyNumber();
            }
            else if (num == 4) {
                Divideby();
            }
            else if (num == 5) {
                SquaredBy();
            }
            else if (num == 6) {
                SquareRoot();
            }
            else if (num == 7) {
                ExponentOf();
            }
            else if (num == 8) {
                Inverse();
            }
            else if (num == 9) {
                Invert();
            }
            else if (num == 10){
                Sine();
            }
            else if (num == 11){
                cos();
            }
            else if (num == 12){
                Tan();
            }
            else if (num == 13) {
                InverseSine();
            }
            else if (num == 14){
                InverseCos();
            }
            else if (num == 15){
                InverseTan();
            }
            else if (num == 16){
                cubicRoot();

            }
            else if (num == 18){

                runCalculator = false;
            }
            else {
                System.out.println("Invalid selection");
            }
        }


    }

    public static void addNumber() {

        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of num1 and num2 = " + sum);
    }

    public static void subtractNumber() {
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 - num2;
        System.out.println("Sum of num1 and num2 = " + sum);
    }

    public static void multiplyNumber() {
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 * num2;
        System.out.println("Sum of num1 and num2 = " + sum);
    }

    public static void Divideby() {
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        if (num2 == 0) {
            System.out.println("Error. Number can not be zero");

        } else {
            int sum = num1 / num2;
            System.out.println("Sum of num1 and num2 = " + sum);

        }

    }

    public static void SquaredBy() {
        System.out.println("Please enter the number: ");
        int num1 = input.nextInt();
        int Square = num1 * num1;
        System.out.println("squared of number = " + Square);

    }

    public static void SquareRoot () {
        System.out.println("please enter the number: ");
        int num1 = input.nextInt();
        double Squareroot = Math.sqrt(num1);
        System.out.println("Square root of number1 " + Squareroot);
    }

    public static void ExponentOf() {
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        double exponent = Math.pow(num1, num2);
        System.out.println(num1 + "to the power of" + num2 + "is = " + exponent);
    }

    public static void Inverse() {
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = -1;
        double inverse = Math.pow(num1, num2);
        System.out.println(num1 + "to the power of" + num2 + "is = " + inverse);
    }

    public static void Invert() {
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        double invert = -num1;
        System.out.println("The number you get after inverting the number is " + invert);
    }
    public static void Sine() {
        System.out.print("Please enter first number: ");
        int num1 = input.nextInt();
        double Sin = Math.sin(num1);
        System.out.println("The sin of number is: " + Sin);
    }
    public static void cos(){
        System.out.print("Please enter the number: ");
        int num1 = input.nextInt();
        double cos = Math.cos(num1);
        System.out.println("Cos of the number is: " + cos);
    }
    public static void Tan(){
        System.out.print("Please enter the number: ");
        int num1 = input.nextInt();
        double Tan = Math.tan(num1);
        System.out.println("Tangent of the number is: " + Tan);
    }
    public static void InverseSine() {
        System.out.print("Please enter the number: ");
        int num1 = input.nextInt();
        double tempNum1 = Math.toRadians(num1);
        double InverseSine = Math.asin(tempNum1);
        System.out.println("InverseSin of the number is: " + InverseSine);
    }
    public static void InverseCos(){
        System.out.print("Please enter the number: ");
        int num1 = input.nextInt();
        double tempNum1 = Math.toRadians(num1);
        double InverseCos = Math.acos(tempNum1);
        System.out.println("InverseCos of the number is " + InverseCos);
    }
    public static void InverseTan() {
        System.out.print("Please enter the number: ");
        int num1 = input.nextInt();
        double tempNum1 = Math.toRadians(num1);
        double InverseTan = Math.atan(tempNum1);
        System.out.println("InverseTan of the number is " + InverseTan);
    }
    public static void cubicRoot(){
        System.out.print("Please enter the number ");
        int num1 = input.nextInt();
        double CubicRoot = Math.cbrt(num1);
        System.out.println("CubicRoot of the number is " + CubicRoot);
    }
}






//package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
//public class MainApplication {
    //public static void main(String[] args) {
      //  Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");
        //Integer i = Console.getIntegerInput("Enter an integer1");
        //Integer j = Console.getIntegerInput("Enter an integer 2");
        //Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a integer", i);
        //Console.println("The user input %s as a integer", j);

        //Console.println("The user input %s as a d", d);


//    }
//}
