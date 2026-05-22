// public class factorial {
//     public static void main(String[] args) {
//         int fact=1;
//         int n = 5;
//         for(int i =1;i<=n;i++){
//             fact = fact*i;
//         }
//         System.out.println(fact);

//     }
// }
public class factorial {
    public static void main(String[] args) {
        int fact=1;
        int n = 5;
        while(n > 0){

            fact = fact*n;
            n--;
        }
        System.out.println(fact);
    }

}