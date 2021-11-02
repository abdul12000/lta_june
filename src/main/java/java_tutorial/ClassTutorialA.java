package java_tutorial;

import org.junit.Test;

public class ClassTutorialA {
//    public static void main(String[] args) {

    @Test
        public void normalMethhod() {
//    public void myMethod(){
        //Our first java code
        System.out.println("Hello World");
        int A = 100;
        int B = 200;

        //print out values of A and B:
        System.out.println(A);
        System.out.println(B);
        System.out.println("A");
        System.out.println("B");

        //use Addition operator "+"
        System.out.println(A + B);
        int C = A + B;
        System.out.println(C);

        //Concatenating
        System.out.println("The addition of A and B is: " + C);

        //Subtraction
        int D = B-A;
        System.out.println("The subtraction of B-A: " + D);

        /*Multiplication*/
        int E = A*B;
        System.out.println("Muliplying A and B : " + E);
        //Division

        float k =100;
        float i = 200;
        float F = k/i;
        System.out.println( F);

        //Remainder or Modulo
        int MODG = 30%7;
        System.out.println(MODG);


    }
}
