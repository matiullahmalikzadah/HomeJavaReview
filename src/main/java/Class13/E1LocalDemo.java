package Class13;

public class E1LocalDemo {
    //if we want to store in locale int sum=0 we can do it
    // and the result should be the same

    void addElements(){

        int [ ] arr={10,20,30};
        int sum=0;
        for (int i=0; i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);
    }

}
