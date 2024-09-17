package Class15;

public class Car {
    private String make;
    private String model;
    private String color;
    private double price;

    public Car(String Cmake,String Cmodel,String Ccolor,double Cprice){
        make=Cmake;
        model=Cmodel;
        color=Ccolor;
        price=Cprice;
    }
    public void printInf(){
        System.out.println(make+" "+color+" "+model+" "+price);
    }

    //this code is when we want to change the price in the future like in CarTester class.
    void setPrice(double Cprice){
         price=Cprice;
    }
    double getPrice(){
        return price;
    }

}
