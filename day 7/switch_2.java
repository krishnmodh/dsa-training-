
import java.util.Scanner;

public class switch_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        switch(name){
            case "admin":
                System.out.println("I am Admin");
                break;
                case "student":
                    System.out.println("I am Student");
                    break;
                    case "teacher":
                        System.out.println("i am Teacher");
                        break;    
                    case "guest":
                        System.out.println("i am Guest");
                        break;
                        default:
                            System.out.println("enter valid name");

        }
    }
}
