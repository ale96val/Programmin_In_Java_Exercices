public class MainClass {

    public static void main(String[] args) throws Exceptions {

        //Create object properly.
        try {
            Person p1 = new Person("Name1", "Secondname1", 60, 123456789);
        } catch (Exceptions ex) {
            System.out.println("Error");
        }
        //There is no exception because it is correct.
        Person p1 = new Person("Name1", "Secondname1", 60, 123456789);
        //Check if it has been created properly.
        System.out.println(p1.toString());


        //Trying to set a invalid exception and catching the message.
        try{
            p1.setAge(-2);
        } catch (Exceptions ex) {
            System.out.println(ex.getMessage());
        }

        //Trying to set a invalid telephone.
        try{
            p1.setTelephone(1234567890);
        }catch (Exceptions ex) {
            System.out.println(ex.getMessage());
        }

        //Setting age and telephone properly.
        p1.setAge(64);
        p1.setTelephone(987456322);
        System.out.println(p1.toString());
    }
}
