package Java_Basic_And_OOP.K_Advance_OOP.Exercise5;

public class Addition {
    public int add(int a, int b){
        return a + b; //Method overloading
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public String add(String a, String b){
        return a + " " + b;
    }
}
