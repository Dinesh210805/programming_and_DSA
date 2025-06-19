import java.util.Arrays;
import java.util.Scanner;

public class SecondGreatestSecondSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digits[] = new int[n];

        int firstGreatest = Integer.MIN_VALUE, secondGreatest = Integer.MIN_VALUE;
        int firstSmallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            digits[i] = scanner.nextInt();

            if (digits[i] > firstGreatest) {
                secondGreatest = firstGreatest;
                firstGreatest = digits[i];
            } else if (digits[i] > secondGreatest && digits[i] != firstGreatest) {
                secondGreatest = digits[i];
            }

            if (digits[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != firstSmallest) {
                secondSmallest = digits[i];
            }
        }
 
        System.out.println(secondGreatest);
        System.out.println(secondSmallest);
    }
}
