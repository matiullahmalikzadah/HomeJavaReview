package Class24;

import java.util.HashMap;
import java.util.Map;

public class T4Map {
    public static void main(String[] args) {

        Map<String,Integer> employee=new HashMap<>();
        employee.put("Ahmad",3000);
        employee.put("jan",4000);
        employee.put("shan",7000);
        employee.put("Khan",100);

        String highestPaidEmployee ="";
        int highestSalary=0;

        for (Map.Entry<String ,Integer> entry :employee.entrySet()){
            if (entry.getValue() >highestSalary){
                highestSalary =entry.getValue();
                highestPaidEmployee= entry.getKey();
            }
        }
        System.out.println("Employee with the highest salary is "+highestPaidEmployee+" and their salary is "+highestSalary);

    }
}
