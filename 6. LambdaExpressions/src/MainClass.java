import java.util.ArrayList;

public class MainClass{

        public static void main(String args[]){ //An array is used to demonstrate the use of lambda functions.

            ArrayList<Integer> a = new ArrayList<Integer>();
            a.add(1);
            a.add(2);
            a.add(3);
            a.add(4);


            //Printing elements with lambda function.
            System.out.println("Elements of the array.");
            a.forEach(n -> System.out.println(n));

            //Printing only pairs element with lambda function.
            System.out.println("Pair elements of the array.");
            a.forEach(n -> { if (n%2 == 0) System.out.println(n); });

            //Printing only odd elements with lambda function.
            System.out.println("Odd elements of the array.");
            a.forEach(n -> { if (n%2 != 0) System.out.println(n); });

            //Printing the addition of one element and the next with lambda function.
            System.out.println("Addition of each element with the next one.");
            a.forEach(n -> { if (n<a.size()) System.out.println(n+(n+1));});


        }
    }