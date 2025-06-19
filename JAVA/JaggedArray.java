import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row  = scanner.nextInt();
        int arr[][] = new int[row][];
        for(int i = 0;i<row;i++){
            int col = scanner.nextInt();
            arr[i] = new int[col];
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
