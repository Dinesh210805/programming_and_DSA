    
import java.util.*;
public class Leader {
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
        
        
        for (int i = 0; i < rows; i++) {
            int Leader = array[i][i];
            for (int j = i; j < cols; j++) {
                
                if(array[i][j] > Leader){
                    Leader = array[i][j];
                }
            }
            System.out.println(Leader);

        }

    }

    public static void main(String[] args) {
        Leader obj = new Leader();
        obj.calculateDiagonalSum();
    }
}
