import java.util.*;

public class MainClass {

    public static void main(String[] args) {

        //Create some vehicles.
        Vehicles v1 = new Vehicles(4, modev.CAR, 2600, 2, colors.GREEN, "1111aaa");
        Vehicles v2 = new Vehicles(4, modev.CAR, 4000, 3, colors.WHITE, "2222bbb");
        Vehicles v12 = new Vehicles(4, modev.CAR, 4000, 3, colors.WHITE, "2222bbb");
        Vehicles v3 = new Vehicles(2, modev.MOTORBIKE, 120, 2, colors.YELLOW, "3333ccc");
        Vehicles v4 = new Vehicles(2, modev.MOTORBIKE, 120, 2, colors.GREEN, "4444ddd");
        Vehicles v5 = new Vehicles(6, modev.TRUCK, 12000, 16, colors.WHITE, "55555eee");
        Vehicles v6 = new Vehicles(2, modev.CAR, 2200, 2, colors.GREEN, "6666fff");
        Vehicles v7 = new Vehicles(2, modev.CAR, 2900, 3, colors.YELLOW, "8888hhh");
        Vehicles v8 = new Vehicles(10, modev.TRUCK, 2200, 2, colors.GREEN, "7777ggg");
        Vehicles v9 = new Vehicles(2, modev.CAR, 2200, 2, colors.GREEN, "9999iii");
        Vehicles v10 = new Vehicles(2, modev.CAR, 2200, 2, colors.GREEN, "0000jjj");
        Vehicles v14 = new Vehicles(2, modev.CAR, 2200, 2, colors.GREEN, "0000jjj");
        Vehicles v13 = new Vehicles(2, modev.CAR, 2200, 2, colors.GREEN, "0000jjj");
        Vehicles v11 = new Vehicles(2, modev.CAR, 2200, 2, colors.GREEN, "0000jjj");

        //Create a vehicles list.
        LinkedList<Vehicles> list = new LinkedList<Vehicles>();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);
        list.add(v6);
        list.add(v7);
        list.add(v8);
        list.add(v9);
        list.add(v10);
        list.add(v11);
        list.add(v12);
        list.add(v13);
        list.add(v14);
        list.add(v14);
        list.add(v2);


        //Show information of all vehicles registered.
        System.out.println("Vehicles information.");
        list.stream()
                .forEach(v -> System.out.println(v.toString()));

        //Show number of vehicles without repetition.
        System.out.println("Total number of vehicles.");
        Set<Vehicles> sett = new HashSet<Vehicles>();
        list.stream()
                .forEach(v -> sett.add(v));
        System.out.println("Total vehicles: " + list.size());
        System.out.println("Vehicles without repetition: " + sett.size());

        //Show a map of the ids an type of car.
        System.out.println("Map of ids and type of cars with no repetition.");
        Map<String, modev> map1 = new HashMap<String, modev>();
        sett.stream()
                .forEach(v -> map1.put(v.getId(), v.getModev()));
        map1.forEach((k,v) -> System.out.println("ID: " + k + ": Type: " + v));

        //Show information about one vehicle.
        System.out.println(v1.toString());
    }
}
