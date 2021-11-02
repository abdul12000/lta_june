package java_tutorial;

import java.util.Scanner;

public class Task8_4 {
//    4.	Can you create a class that will do the same logic as what we have in ClassTutorialF.java using “if – else if” syntax

    public static void main(String[] args) {
        System.out.println("Pls enter your day number");
        Scanner weekDay = new Scanner(System.in);
        byte dayNumber = weekDay.nextByte();
        if (dayNumber == 1) {
            System.out.println("Today is Monday");
        } else if (dayNumber == 2) {
            System.out.println("Today is Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Today is Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Today is Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Today is Friday");
        } else if (dayNumber == 6) {
            System.out.println("Today is Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("you need to enter number between 1 and 7");}
    }

}
