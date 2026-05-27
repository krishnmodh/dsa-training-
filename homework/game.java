
import java.util.Scanner;

// package dsa.homework;

public class game {

    //guess number gamee
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secret = (int)(Math.random() * 100) + 1;
        int count =0;
        while (true) { 
            int input = sc.nextInt();
            if(input == secret){
                System.out.println("Correct");
                count++;
                break;
            }else if (input>secret) {
                System.out.println("choose low number"); 
                count++;             
            }else{
                System.out.println("choose high number"); 
                count++;  
            }
        }
        
        // System.out.println(secret);
        System.out.println("you have guess in "+count+" times");
    }
}
