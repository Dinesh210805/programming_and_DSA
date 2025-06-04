import java.util.*;
public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        while(n!=0){
            int lastDigit = n % 10;
            if(lastDigit % 2 == 0){
                even++;
            } else {
            odd++;
        }
        n /= 10;
    }
    System.out.println("Even digits: " + even);
    System.out.println("Odd digits: " + odd);
}}