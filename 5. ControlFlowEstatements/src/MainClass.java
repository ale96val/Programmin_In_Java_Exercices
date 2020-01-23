public class MainClass {

   public static void main(String[] args) {

        //Getting pairs numbers from 0 tu 100 using a for loop with if/else.
        loopcode();

        //Getting pairs numbers from 0 to 100 using a while loop with if/else.
        whilecode();

        //Gettin pairs numbers from 0 to 100 using a while loop with case.
        whilecasecode();
    }

    public static void loopcode(){  //Method for for loop with if/else case.

        System.out.println("Starting operation with for loop control statement.");

        int i = 0;

        for(i=0; i<=100; i++){

            if(i%2 == 0){
                System.out.println("The number "+i+" is pair.");
            }else{
                System.out.println("The number "+i+" is odd.");
            }
        }

        System.out.println("Operation completed.");

    }

    public static void whilecode(){  //Method for loop with while and if/else case.

        System.out.println("Starting operation with while control statement.");

        int i = 0;

        while(i<=100){

            if(i%2 == 0){
                System.out.println("The number "+i+" is pair.");
            }else{
                System.out.println("The number "+i+" is odd.");
            }

            i++;
        }

        System.out.println("Operation completed.");
    }

    public static void whilecasecode(){  //Method for loop with while and switch case.

        System.out.println("Starting operation with while control statement and switch case.");

        int i = 0;
        int opperation = 0;

        while(i<=100){

            opperation = i%2;

            switch (opperation) {

                case 0:
                System.out.println("The number " + i + " is pair.");
                break;

                default:
                System.out.println("The number " + i + " is odd.");
            }

            i++;
        }

        System.out.println("Operation completed.");
    }
}
