
// import java.util.Scanner;

// public class switch_1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         switch(a){
//             case '1':
//                 System.out.println("jan");
//                 break;
//             case '2':
//                 System.out.println("feb");
//                 break;
//             case '3':
//                 System.out.println("march");
//                 break;
//             case '4':
//                 System.out.println("april");
//                 break;
//         }
//     }

    
// }
import java.util.Scanner;

public class switch_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        switch(a){

            case 1:
                System.out.println("jan");
                break;

            case 2:
                System.out.println("feb");
                break;

            case 3:
                System.out.println("march");
                break;

            case 4:
                System.out.println("april");
                break;

            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}