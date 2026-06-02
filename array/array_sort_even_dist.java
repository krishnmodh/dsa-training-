public class array_sort_even_dist {
    public static void main(String[] args) {

        int[] arr = {1,4,7,9,99,999,9,8,3,35,37,3,10,5};
        int previndex=-1;
        int mindistance = Integer.MAX_VALUE;
        int counteven = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0 && arr[i] % 2==0){
                counteven++;
            
            if(previndex != -1){
                int distance = i-previndex;
                mindistance = Math.min(mindistance, distance);

            }
            
            previndex=i;
        }
    }
        if(counteven <= 1){
            System.out.println(-1);
        }else{
            System.out.println(mindistance);
        }
    }
}
