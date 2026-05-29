
import java.util.Scanner;

public class array_practice {
    
    //Write a program to find out the shortest distance between two even positive integers in an array arr and print the distance. If there is one or zero even positive integer in the array then return -1.
    
    // public static int arrayevendis(int[] arr,int n){
    //     int res= -1;
    //     for (int i = 0; i < n; i++) {
    //         int firsteven = -1;
    //         int ans=-1;
    //         if(arr[i] % 2 == 0){
    //             firsteven =i;
    //         }
    //         for(int j =i+1;j<n;j++){
    //             if(arr[j] %2==0 && firsteven !=-1){
    //                 ans++;
    //                 res = Math.min(ans,j-firsteven);
    //             }
    //         }
            
    //     }
    //     return (res >=0 ? res:res);
    // }
    // public static int arrayevendis(int[] arr,int n){
    //     int res= -1;
    //     for (int i = 0; i < n; i++) {
    //         // int firsteven = -1;
    //         // int ans=-1;
    //         if(arr[i] % 2 == 0)
    //             // {
    //             // firsteven =i;
    //         // }
    //         for(int j =i+1;j<n;j++){
    //             if(arr[j] %2==0 )
    //                 // && firsteven !=-1)
    //             {
    //                 if(res == -1) res = j-i;
    //                 // ans++;

    //                 res = Math.min(res,j-i);
    //                 break;
    //             }
    //         }
            
    //     }
    //     return (res >=0 ? res:res);
    // }

    // You have been given an array arr that might contain duplicate elements. Your task is to find the maximum possible distance between occurrences of two repeating elements i.e. elements having the same value. If there are no duplicate elements in the array, print 0.

    public static int maxDuplicatedistance(int[] arr,int n){
        int res=0;
        for (int i = 0; i < n; i++) {
            int search = arr[i];
            for(int j =i+1;j<n;j++){
                if(arr[j] == search){
                    res = Math.max(j-i,res);
                }
            }
            
        }
        return res;
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
System.out.println(maxDuplicatedistance(arr, n));

    // System.out.println(arrayevendis(arr, n));
    
    }

    
}