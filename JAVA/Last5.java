import java.util.*;
public class Last5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num%10)>=5?"Above 5":"Below 5");
    }
    
}
