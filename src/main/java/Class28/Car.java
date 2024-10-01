package Class28;

public class Car {
    private String make;
    private String  model;
    private double price;
    private String color;

    public Car(String make, String model, double price, String color) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    void printInfo(){
        System.out.println(make+" "+model+" "+price+" "+color);
    }
}

class BMW extends Car{

    public BMW(String make, String model, double price, String color) {
        super(make, model, price, color);
    }
}

class Toyota extends Car{

    boolean sanRoof;

    public Toyota(String make, String model, double price, String color, boolean sanRoof) {
        super(make, model, price, color);
        this.sanRoof=sanRoof;
    }
}
