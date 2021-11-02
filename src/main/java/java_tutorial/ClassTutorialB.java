package java_tutorial;

public class ClassTutorialB {

    //How to use Objects to call methods in Java
    public Integer AdditionMethod() {
        int A = 100;
        int B = 200;
        return A + B;
    }

    public Integer AdditionMethodWithParameters(int x, int y) {
        return x + y;
    }


    public static void main(String[] args) {
//Instantiate the class
        ClassTutorialB secondclass = new ClassTutorialB();
        //Calling a method
        System.out.println("The value of A + B is : " + secondclass.AdditionMethod());


        ClassTutorialB sc = new ClassTutorialB();
        System.out.println("The value of x + y is : " + sc.AdditionMethodWithParameters(1000, 2000));
    }
}
