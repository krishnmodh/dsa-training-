
import java.util.Scanner;

// package dsa.homework;

public class game {

    //guess number gamee
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secret = (int)(Math.random() * 100) + 1;
        while (true) { 
            int input = sc.nextInt();
            if(input == secret){
                System.out.println("Correct");
                break;
            }else if (input>secret) {
                System.out.println("choose low number");              
            }else{
                System.out.println("choose high number");   
            }
        }
        
        // System.out.println(secret);
    }
}
