package Class24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6Map {
    public static void main(String[] args) {


        ArrayList<Double> priceOfMakeUp=new ArrayList<>();
        priceOfMakeUp.add(12.3);
        priceOfMakeUp.add(10.00);
        priceOfMakeUp.add(14.4);
        priceOfMakeUp.add(50.0);
        priceOfMakeUp.add(30.1);
        priceOfMakeUp.add(34.5);

        ArrayList<Double> priceOfFriut=new ArrayList<>();
        priceOfFriut.add(10.00);
        priceOfFriut.add(20.00);
        priceOfFriut.add(30.00);
        priceOfFriut.add(40.00);
        priceOfFriut.add(50.00);

        ArrayList<Double> priceOfCar=new ArrayList<>();
        priceOfCar.add(200.0);
        priceOfCar.add(900.0);
        priceOfCar.add(700.0);
        priceOfCar.add(800.0);
        priceOfCar.add(600.0);

        Map<String,ArrayList<Double>> d=new HashMap<>();
        d.put("priceOfMakeUp",priceOfMakeUp);
        d.put("priceOfFriut",priceOfFriut);
        d.put("priceOfCar",priceOfCar);


    }
}
