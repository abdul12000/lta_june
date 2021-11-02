package java_tutorial;

public class Task8_3 {
//    3.	In Class "ClassTutorialB.java” code that we created in the class, " +
//        "there are two methods in that class for adding two integers. " +
//        "Write corresponding methods for Subtractions and multiplications so that you " +
//        "can call the methods within the main method. Note that if you follow the Lesson " +
//        "it is the same concept as what you already have in the class "ClassTutorialB.java”

    public Integer SubtractionMethod() {
        int A = 100;
        int B = 200;
        return B - A;
    }

    public Integer SubtractionMethodWithParameters(int y, int x) {
        return y - x;
    }


    public Integer MultMethodWithParameters(int y, int x) {
        return y * x;
    }

    public Integer MultMethod() {
        int A = 100;
        int B = 200;
        return B * A;

    }

    public static void main(String[] args) {
        //Instantiate the class
        Task8_3 SubClass = new Task8_3();
        //method calls
        System.out.println("The value of B - A is : " +
                SubClass.SubtractionMethod());


        //instantiate the class
        Task8_3 SubClassA = new Task8_3();
        //calling the method
        System.out.println("The value of y - x is : " +
                SubClass.SubtractionMethodWithParameters(1000, 2000));

        //Instantiate the class
        Task8_3 MultClass = new Task8_3();
        //method calls
        System.out.println("The value of B * A is : " +
                MultClass.MultMethod());


        //instantiate the class
        Task8_3 MultClassA = new Task8_3();
        //calling the method
        System.out.println("The value of y * x is : " +
                MultClass.MultMethodWithParameters(1000, 2000));
    }
    }
