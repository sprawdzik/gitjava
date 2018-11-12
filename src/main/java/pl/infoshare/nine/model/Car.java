package pl.infoshare.nine.model;

public class Car {

    private int numberOfDoors;
    private String manufacture;

    public Car(String manufacture) {
        this.numberOfDoors =4;
        this.manufacture = manufacture;
    }

    protected void printManufacture(){
        System.out.println(this.manufacture);
    }
    public void printNumberOfDoors(){
        System.out.println("Liczba drzwi: " + this.numberOfDoors);
    }
}
