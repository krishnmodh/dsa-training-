


public class problem {
    public static void main(String[] args) {


        // //gcd programm
        // int a = 15;
        // int b = 20;
        // int min;
        // int gcd = 0;
        // if(a > b) min = b;
        // else min = a;
        // for(int i =2; i<= min;i++){
        //     if(a % i == 0 && b % i == 0){
        //         gcd=i;
        //     }
        // }
        // System.out.println(gcd);


        // //sum of square of digit
        // int num = 12131;
        // int sum = 0;
        // while(num != 0){
        //     int res = num % 10;
        //     sum = sum+(res*res);
        //     num = num/10;
        // }
        // System.out.println(sum);

        //armstrong noo
        // int num1 = 153;
        // int ori = num1;
        // int sum1 = 0;
        // while(num1 !=0){
        //     int rem = num1 % 10;
        //     sum1 += (rem*rem*rem);
        // }
        // if(sum1 == ori)
        // System.out.println(num1);


        //perfect square btw 20 to 80

        // for(int n =20;n <=80;n++){
        //     for(int i = 1 ;i <=n/2;i++){
        //         if(i*i == n){
        //             System.out.println(n);
        //         }

        //     }
        // }

        // int start = 20;
        // int end = 1000;
        // for(int i =1;i<=1000;i++){
        //     if(i*i*i>20 && i*i*i <=1000){
        //         System.out.println(i*i*i);
        //     }
        //     if(i*i*i > 1000) break;
        // }


        //fibonacci series
        int first = 0;
        int sec = 1;
        int num = 10;
        for(int i =1;i <=num;i++){
        System.out.println(first);
            int temp = first + sec;
            first = sec;
            sec = temp;
        }
        



    }
    
}