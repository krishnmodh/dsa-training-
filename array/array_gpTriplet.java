public class array_gpTriplet {

    public static void triplet(int[] arr, int n){
        for(int i =0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[j]*arr[j] == arr[i] * arr[k]){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr= {1,2,4,6,8,10,12,14,16,20};
        int n = arr.length;
        triplet(arr, n);
    }
    
}