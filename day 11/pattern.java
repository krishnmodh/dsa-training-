
public class pattern {
    int a= 10;
    int b=20;
    static void add(int a){
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        add(6);

        //equlateral triangle
        // int n =4;
        // for(int i =0;i<=n;i++){
        //     for(int j = 0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //reverce equlateral triagle
        // int n =4;
        // for(int i =n;i>0;i--){
        //     for(int j = 0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //diamond pattern
        // 
        //  int n =4;
        // for(int i =0;i<=n;i++){
        //     for(int j = 0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //  for(int i =n;i>0;i--){
        //     for(int j = 0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<i;j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        
        ////hollow squaree

        // int n= 5;
        // for (int i= 1;i<=n;i++){
        //     for(int j =1;j<=n;j++ ){
        //         if(j == 1 || j == n || i == 1 || i == n){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();

        // }

        //hollow diamond not solved

        //   int n =5;
        // for(int i =0;i<=n;i++){
        //     for(int j = 0;j<n-1;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=0;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        //     for( int i =n;i>0;i--){
        //         for(int j = 0;j<n-i;j++){
        //             System.out.print(" *");
        //         }
        //         for(int j=0;j<i;j++){
        //             System.out.print(" ");
        //         }
        //         System.out.println();
        // }
 
        //hollow triangle
        // int n=5;
        // for(int i=n;i>0;i--){
        //     for(int j )
        // }
        //  for(int i =1;i<=n;i++){
        //     for(int j = 1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if(j==1||j==i|| i== n){
        //         System.out.print("* ");
        //     }else{
        //         System.out.print(" ");
        //     }
        // }
        //     System.out.println();
        //}

    //     int n = 6;
    //     for(int i =0;i<=n;i++){
    //         for(int j = 0;j<=i;j++){
    //             if(i==0 || j%2==0){
    //                 System.out.print(" ");
    //             }else{
    //                 System.out.print("* *");
    //             }
    //         }
    //         System.out.println();

    // }

    //alternate method 
    // int star =2;
    // int n= 6;
    // for(int i =1;i<=n;i++){
    //     for(int j = 1;j<=star;j++){
    //         System.out.print("* " );
    //     }
    //     System.out.println();
    //     if(i%2==0){
    //         star+= 2;
    //     }

    // }

    //pattern print
    // *   *
    //  * *
    //   *
    //  * *
    // *   * 

    // int n=5;
    // for(int i =0;i<n;i++){
    //     for(int j =0;j<n;j++){
    //         if(i==j || (i+j) == (n-1)){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();

    // }
    //h.w
    //non static variable where store?

    // int a= 10;
    // int b=20;
    // void add(){
    //     System.out.println(this.a);
    // }

    

}
    
}