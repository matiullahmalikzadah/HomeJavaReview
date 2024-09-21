package Class20;

public interface Vehicle {
    void drive();
}
 interface  Bike extends Vehicle{

    void appyBike();
 }

 class HonaBike implements Bike{

     @Override
     public void drive() {
         System.out.println("Driving......");
     }

     @Override
     public void appyBike() {
         System.out.println("Stop........");
     }
 }