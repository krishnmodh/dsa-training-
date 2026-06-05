public class palindrome_no {
    public static void main(String[] args) {
        int rev = 0;
        int  num= 12231;
        int ori=num;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        if(ori == rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
}
}
