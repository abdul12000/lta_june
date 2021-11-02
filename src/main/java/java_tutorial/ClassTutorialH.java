package java_tutorial;

public class ClassTutorialH {
    public static void main(String[] args) {

        String[] languages = {"English", "French", "Spanish", "Russian", "Yoruba", "Hausa", "Portuguese", "German", "Dutch"};
        //To print out all the items of the array:
        for (String james : languages) {
            System.out.println(james);
        }
        System.out.println("--------------------------------------------------------");
        //To print out specific item using index
        System.out.println(languages[3]);

        System.out.println("--------------------------------------------------------");
        //To get the length of an array:
        System.out.println(languages.length);

        System.out.println(languages[8]);


        System.out.println("--------------------------------------------------------");
        int[] myNum = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        System.out.println("Length of my array is : "+ myNum.length);

        System.out.println("--------------------------------------------------------");
        //printing out index 1:
        System.out.println(myNum[1]);
    }
}
