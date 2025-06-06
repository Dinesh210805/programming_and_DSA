import java.util.*;
public class ArrayReverse {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = input.nextInt();
    int original[] = new int[size];
    
    System.out.println("Enter array elements:");
    for(int i = 0; i < size; i++){
        original[i] = input.nextInt();
    }
    System.out.println("\nReversed array:");
    for(int i = size - 1; i >= 0; i--){
        System.out.print(original[i] + " ");
    }
    System.out.println("Original array:");
    for(int i = 0; i < size; i++){
        System.out.print(original[i] + " ");
    }
    

}
}
