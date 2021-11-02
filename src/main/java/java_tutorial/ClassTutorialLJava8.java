package java_tutorial;

//import java.util.ArrayList;

import java.util.ArrayList;

public class ClassTutorialLJava8 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("England");
        countries.add("Poland");
        countries.add("France");
        countries.add("Portugal");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Nigeria");
//        countries.forEach( (n) -> { System.out.println(n); } );
Long a = countries.stream().filter(s->s.startsWith("P")).count();
        System.out.println(a);

        countries.stream().filter(t -> t.length()>6).forEach(t -> System.out.println(t));
    }
}
