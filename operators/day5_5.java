import java.util.*;
public class day5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String vote = (n>18)?"can vote": "cannot vote";
        System.out.println(vote);

    }
}
