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
    // static double celcius_to_farenheit(float celcius){
    //     double res = (9/5)*celcius +32;
    //     return res;
    // }

    // public static void add(int a, int b){
    //     if(a==2){return;}
    //     System.out.println((a+b));
    // }

    //even sum
    // public static int sumEven(int start, int end){
    //     int result=0;
    //     for(int i =start;i<=end;i++){
    //         if(i %2==0){
    //             result += i;
    //         }
    //     }
    //     return result;


    //nCr code

    // int factorial(int n){
    //     long fact = 1;
    //     for(int i =1;i<n;i++){
    //         fact *= i;
    //     }
    //     return (int)fact;
    // }
    //string concat
    // static void concat(String name){
    //     System.out.println("hello "+ name);
    // }
    
    // //second last even
    // static boolean secLastEven(int n){
    //     int count = 0;
    //     int digit=0;
    //     while(n>0){
    //         digit = n%10;
    //         n = n/10;
    //         count++;
    //         if(count == 2){
    //             if(digit % 2==0){
    //             return true;
    //         }else{
    //             return false;
    //         }
    //     }
    // }
    //         return false;
    // }

    public static int fromdecimal(int decimal,int targetbase) {
        // int decimal=0;
        if(decimal == 0){
            return "0";

        }
        String result ="";
        while(decimal> 0){
            int rem = decimal % targetbase;
            if(rem < 10){
                result = rem+result;
            }else{
                result = (char)(rem - 10 + 'A')+ result;
        } 
        decimal = decimal/targetbase;
        
    }
    return result;
    }


    
    public static void main(String[] args) {
        // add(6);

        // System.out.println(area(6));

        // System.out.println(celcius_to_farenheit(6));

        // add(10,20);

        //sven sum
        // System.out.println(sumEven(10,20));

        //ncr 
        // int n =9;
        // int r=3;
        
        // int fact_n = factorial(n);
        // int fact_r = factorial(r);

        //string concat
        // concat("krishn");

        //sec last even or not
        // System.out.println(secLastEven(121121));

        //decimal to binary
    //     int n=100;
    //      int res=0;
    //     int index=1;
    //     while(n>0){
    //         int rem = n%2;
    //         res = res + (rem * index);
    //         index = index * 10;
    //         n = n/2;
    //     }
    //     System.out.println(res);
    // }


    //binary to decimal
        // int n=1101;
        //  int res=0;
        // int index=1;
        // while(n>0){
        //     int rem = n%2;
        //     res = res + (rem * index);
        //     index = index * 2;
        //     n = n/10;
        // }
        // System.out.println(res);

        //from decimal

        System.out.println(fromdecimal(150, 2));
    
    }
}