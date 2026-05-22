public class day5_4 {
    public static void main(String[] args) {
        int a = 60;
        int b = 50;
        int c = 30;
        int res = (a>b && a>c)?a:((b>c)?b:c);
        
        System.out.println(res);
    }
}
