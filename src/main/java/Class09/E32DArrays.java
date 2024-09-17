package Class09;

import java.util.Arrays;

public class E32DArrays {
    public static void main(String[] args) {
        String[] [] names={
                {"Ahma","jan","asad","mahboob"},
                {"Aziz","Zia","Nawab","Ashraf"},
                {"Qais","Zazai","asad","WW"},
                {"AA","BB","Rom","CC"},
        };
        String[] firstRow = names[2];
        System.out.println(Arrays.toString(firstRow));
    }
}
