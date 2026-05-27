// package dsa.array;

import java.util.Scanner;

public class array {

public static int returnindex(int [] arr,int target){
    int index = 0;
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
            index = i;
        }
    }
    return index;
}

 public static boolean linearsearch(int[] arr,int target){
    boolean flag =true;
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
            flag = true; 
        }
    }
    return flag;

 }

    public static void main(String[] args) {
        
    //user input array and print
    // Scanner sc = new Scanner(System.in);
    // int n = 5;
    // int [] arr = new int[n];
    // for(int i =0;i<n;i++){
    //     arr[i] = sc.nextInt();
    //     }
    //     for(int i =0;i<n;i++){
    //         System.out.print(arr[i]+" ");
    //     }
  
  //print even no in array
    // Scanner sc = new Scanner(System.in);
    // int n = 5;
    // int [] arr = new int[n];
    // for(int i =0;i<n;i++){
    //     arr[i] = sc.nextInt();
    //     }
    //     for(int i =0;i<n;i++){
        //         if(arr[i]%2 == 0){
            //             System.out.print(arr[i]+" ");
            //         }
            // }
            
            //linear search
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int target = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
if(linearsearch(arr, target)){
    System.out.println("Index value = "+returnindex(arr, target));
}

    }
}
