package java_tutorial;

public class Java9TaskC {
//    3.	Write java code to printout 1 to 100. But in the output it should replace the numbers that are multiples
//    of three with "multiple of three" and replace numbers that are multiples of 5 numbers with "multiple of five"
//    and replace numbers that are multiple of both 3 and 5 with "multiple of three and five"
//            (Output should be like this:
//            1
//            2
//    multiple of three
//4
//    multiple of five
//    multiple of three
//7
//        8
//    multiple of three
//10
//        11
//    multiple of three
//13
//        14
//    multiple of three and five
//            .
//.
//        .
//        )

    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            if (n % 15 == 0) {
                System.out.println("Multiple of three and five ");
            } else if (n % 3 == 0) {
                System.out.println("multiple of three");
            } else if (n % 5 == 0) {
                System.out.println("multiple of five");
            } else {
                System.out.println(n);
            }


        }
    }
}
