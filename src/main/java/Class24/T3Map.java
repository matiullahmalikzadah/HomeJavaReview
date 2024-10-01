package Class24;

import java.util.HashMap;
import java.util.Map;

public class T3Map {
    public static void main(String[] args) {
        Map<Integer ,String  > BestBuy=new HashMap<>();
        BestBuy.put(7664847,"Printer");
        BestBuy.put(7879885,"Tv");

        var d=BestBuy.entrySet();
        for (var r:d){
            System.out.println(r.getKey()+"="+" "+r.getValue());
        }
    }
}
