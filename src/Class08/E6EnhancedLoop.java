package Class08;

public class E6EnhancedLoop {
    public static void main(String[] args) {

        int[] namber={23,4,5,667,7,98,00,22};
        for (int i=0; i<namber.length; i++){
            if (namber[i]>20){
                namber[i]=0;
            }
        }
        for (int i = 0; i < namber.length; i++) {
            System.out.println(namber[i]);
        }
    }
}
