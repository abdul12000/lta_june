package java_tutorial;

public class Task8_2 {
//	Write a java program that can print out all even numbers between 1 and 11

    public static void main(String args[])
    {

        //variable assignment
        int number = 11;

        //print the list of numbers to the screen for the user
        System.out.println("List of even numbers from 1 to " + number + ": ");

        // this is a "for" statement that tells the count to start at 1, as well as look up the
        // number line for these values
        for (int i = 1; i <= number; i++)

        {
            //check if the number is even or not
            if (i % 2 == 0)
            {
                //print list of numbers to screen
                System.out.println(i + " ");
            }
        }
    }
}
