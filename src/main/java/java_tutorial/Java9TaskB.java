package java_tutorial;

public class Java9TaskB {

    //    2.	Write a java program that can print out all prime numbers between 1 and 20.
    public static void main(String[] args) {
        int x = 0;
        int num = 0;
        //empty strings
        String primeNumbers = "";

        for (x = 1; x <= 20; x++) {
            int counter = 0;
            for (num = x; num >= 1; num--) {
                if (x % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + x + ", ";
            }
        }

        System.out.println("Prime numbers from 1 to 20 are :");
        System.out.println(primeNumbers);
    }

}
