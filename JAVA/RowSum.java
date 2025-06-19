import java.util.*;
public class RowSum {
    Scanner scanner = new Scanner(System.in);
    public void calculateRowSum() {
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] array = new int[rows][cols];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        RowSum obj = new RowSum();
        obj.calculateRowSum();
    }
}
