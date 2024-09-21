package Class19;

public class T1Tester {
    public static void main(String[] args) {
        T1 [] arr={new SyntaxStudent1(),new CollegeStudent(),new SchoolStudent1()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].study();
            arr[i].extraCurricular();
            arr[i].homework();
            arr[i].play();
        }
    }
}
