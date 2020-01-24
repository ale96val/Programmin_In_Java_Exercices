import java.util.LinkedList;

public class Vehicles{  //Class for vehicles.

    int wheels;
    modev modev;
    int weight;
    int longitude;
    colors color;
    String id;

    //Default constructor for vehicles.
    public Vehicles(int wheels, modev modev, int weight, int longitude, colors color, String id) {
        this.wheels = wheels;
        this.modev = modev;
        this.weight = weight;
        this.longitude = longitude;
        this.color = color;
        this.id = id;
    }

    //Getters and Setters.
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public modev getModev() {
        return modev;
    }

    public void setModev(modev modev) {
        this.modev = modev;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public colors getColor() {
        return color;
    }

    public void setColor(colors color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Default toString.
    public String toString() {
        return "Vehicles{" +
                "wheels=" + wheels +
                ", modev=" + modev +
                ", weight=" + weight +
                ", longitude=" + longitude +
                ", color=" + color +
                ", id=" + id +
                '}';
    }

        }
