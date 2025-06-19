    
import java.util.*;
public class DiagonalSum {
    Scanner scanner = new Scanner(System.in);
    public void calculateDiagonalSum() {
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
        
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i == j){
                    diag1 +=array[i][j];
                }
                if(i+j == cols - 1){
                    diag2 +=array[i][j];
                }
            }
        }
        System.out.println(diag1);
        System.out.println(diag2);
    }

    public static void main(String[] args) {
        DiagonalSum obj = new DiagonalSum();
        obj.calculateDiagonalSum();
    }
}
