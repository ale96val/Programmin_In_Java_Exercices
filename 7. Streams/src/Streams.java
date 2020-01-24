import java.util.ArrayList;
import java.util.List;

public class Streams {

    public static void main(String[] args) {

        //List of names to use as example.
        List<String> things = new ArrayList<String>();
        things.add("Door");
        things.add("Desktop");
        things.add("Window");
        things.add("Table");
        things.add("Chair");
        things.add("Kitchen");
        things.add("Calculator");

        //Print all elements using Streams.
        System.out.println("Print all elements using Streams.");
        things.stream().forEach(System.out::println);

        //Print all elements stating with "C" only once.
        System.out.println("Print all elements stating with \"C\" only once.");
        things.stream()
                .filter(x -> x.startsWith("C"))
                .distinct()
                .forEach(System.out::println);

        //Print first element starting with "D".
        System.out.println("Print first element starting with \"D\".");
        System.out.println(things.stream()
                .filter(x -> x.startsWith("D"))
                .findFirst()
                .get());

        //Print elements containing with "to" and with length <= 10.
        System.out.println("Print elements containing with \"to\" and with length <= 10.");
        things.stream()
                .filter(x -> x.contains("to"))
                .filter(x -> x.length() <=10)
                .forEach(System.out::println);


    }
}
