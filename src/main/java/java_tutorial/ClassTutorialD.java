package java_tutorial;

import java.util.Scanner;

public class ClassTutorialD {
    //writing Dynamic code
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        if (age > 17) {
            System.out.println("You are welcome to the club");
        } else
            System.out.println("You are underage");


    }
}
