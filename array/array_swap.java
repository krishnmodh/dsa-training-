public class array_swap {


    // swapped array
    // public static void swap(int[] arr ,int i,int j ){
    //     int n=arr.length;
    //     while(i<j){

    //         int temp = arr[i];
    //        arr[i]= arr[j];
    //        arr[j] = temp;
    //        i++;
    //        j--;
    //     }

    //reverse 

    // public static void reverse() {
        
    // }


    public static void print(int[] arr,int st,int end){
        for(int i=st;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void subarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                print(arr,i,j);
            //     System.out.print(arr[i]+" ");
            // }
            // System.out.println();
        }
    }
    }

// }
    public static void main(String[] args) {

        // int[] arr = {1,2,3,4,5};
        // swap(arr, 0, 4);
        // for(int n:arr){
        //     System.out.print(n+" ");
        // }


        int[] arr = {1,2,3,4,5};
        subarray(arr);

    }

}