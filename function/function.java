// package dsa.function;

public class function {
    //  int a= 10;
    // int b=20;
    // static void add(int a){
    //     System.out.println(a);
    // }

    //area of circle
    // static final float pi = 3.14f;
    // static float area(int radius){
    //     float result=pi*radius*radius;
    //     return result;
    // }

    //celcius to F
    static double celcius_to_farenheit(float celcius){
        double res = (9/5)*celcius +32;
        return res;
    }
    
    public static void main(String[] args) {
        // add(6);

        // System.out.println(area(6));

        System.out.println(celcius_to_farenheit(6));



    }
}