package Class15;

public class CarTester {
    public static void main(String[] args) {
        Car car=new Car("Toyota","Corolla","white",2000);
        car.printInf();
        car.setPrice(2500);
        car.printInf();
        System.out.println(car.getPrice()
        );


    }
}
