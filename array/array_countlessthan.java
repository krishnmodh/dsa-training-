public class array_countlessthan {
    
    // public static int countless(int[] arr, int n){

    // }



    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        int count = 0;
        int x = 5;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < x){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
