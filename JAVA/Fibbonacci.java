import java.util.Scanner;

public class Fibbonacci {
    public static int Fibbonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibbonacci(n - 1) + Fibbonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Fibbonacci(number));
    }
}
