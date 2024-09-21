package Class19;

public class T1 {


    void homework(){
        System.out.println("student like to do their homework ");
    }

    void study(){
        System.out.println("student is studying");
    }

    void play(){
        System.out.println("student likes to play chess");
    }

    void extraCurricular(){
        System.out.println("student likes to do extra curricula activities");
    }
}

class SyntaxStudent1 extends T1{
    void play(){
        System.out.println("student likes play card");
    }
}

class CollegeStudent extends T1{
    void extraCurricular(){
        System.out.println("student likes to nap instead");
    }
}

class SchoolStudent1 extends T1{
    void homework(){
        System.out.println("student does not like to do their homework");
    }
}
