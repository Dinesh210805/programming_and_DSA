import java.util.*;
public class GreatestSmallest {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int digits[] = new int[n];
    for(int i = 0 ; i<n;i++){
        digits[i] = scanner.nextInt();
    }
    Arrays.sort(digits);
    System.out.println(digits[0]);
    System.out.println(digits[n-1]);
}
}