package java_tutorial;

import java.util.Scanner;

public class Java9TaskA {
    public static void main(String[] args) {
//        1.	Write a java program that can print out 1, 2, 3, 5, 8, 13, 21, 34, 55.
//        Note that this is a series that follows a pattern of n3 = n2 + n1, n4 = n3 + n2, n5 = n4 + n3 … (Fibonacci series).

//        int n1 = 1, n2 = 2, n3, i, count = 9;
//        System.out.print(n1 + " " + n2); // printing 1 and 2
//
//        for (i = 2; i < count; ++i) {
//            n3 = n1 + n2;
//            System.out.print("," + n3);
//            n1 = n2;
//            n2 = n3;
//        }

        int numToPrint;
        //get the number of numbers to print

        Scanner sc = new Scanner(System.in);
        System.out.println("number of fibonacci numbers to print");
        numToPrint = sc.nextInt();
        sc.close();

//        Print out first and second numbers in the series

        int second = 2;
        int first = 1;

        System.out.println(first);
        System.out.println(second);

//      Now print out the rest of the numbers in the series
        int restremaining;
        for (int x = 2; x < numToPrint; x++) {
            restremaining = first;
            first =second;
            second= restremaining + first;
            System.out.println(second);

    }


}
}
