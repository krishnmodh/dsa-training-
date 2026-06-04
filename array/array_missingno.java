public class array_missingno {

    static int missingmumber(int[] nums,int n) {
        int[] freq = new int[n+1];
        for(int i =0;i<nums.length;i++){
            freq[nums[i]]++;
        } 
        for(int i = 0;i<freq.length;i++){

        }
    }




    // public static int missingNumber(int[] arr,int n) {
    //     n = arr.length;
    //     int[] res = new int[n];
    //     int ssum = n*(n+1)/2;
    //     int sum =0;
    //     for(int num:arr){
    //         sum += num;
    //     }
    //     return ssum - sum;
    //  
    // }
    
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,6,7,9,0};
    //     missingNumber(arr,n);
    // }
}
