package java_tutorial;

import java.util.Scanner;

public class ClassTutorialC {
    //writing Dynamic code
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Thank you Mr " + name);
        System.out.println("Thank you Mr " + name.toUpperCase());
    }
}
