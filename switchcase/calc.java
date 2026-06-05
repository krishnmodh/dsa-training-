import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 50;
        int b = 20;
        char ch = sc.next().charAt(0);
        switch (ch)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
                case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b != 0){
                    System.out.println(a/b);
                }
                break;
            case '%':
                System.out.println(a%b);
                break;
                default:
                    System.out.println("invalid input");

        }

    }
}