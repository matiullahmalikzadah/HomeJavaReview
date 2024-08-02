package Class03;

import javax.management.MBeanAttributeInfo;

public class E2TypeCasting {
    public static void main(String[] args) {

        float box1=15.445654f;
         int box2;
         box2=(int) box1; // type casting narrowing/explicit/manual
        System.out.println(box2);
    }
}
