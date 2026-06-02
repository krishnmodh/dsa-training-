public class array_sub2diffarr {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int [] arr2={2,3,6};
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int max = Math.max(arr1.length,arr2.length);
        int k = max -1;
        int borrow = 0;
        int[] res = new int[max];
        while(k >=0){
            int x = (i >= 0) ? arr1[i] : 0;
            int y = (j >= 0) ? arr2[j] : 0;

            x = x - borrow;

            if (x < y) {
            x = x + 10;
             borrow = 1;
            } else {
           borrow = 0;
            }

res[k] = x - y;

            i--;
            j--;
            k--;

        }
                for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
