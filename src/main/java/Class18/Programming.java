package Class18;

public class Programming {
    public Programming(){
        System.out.println("I love programming language");
    }
    public Programming(String word){

        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("java");

    }
}
