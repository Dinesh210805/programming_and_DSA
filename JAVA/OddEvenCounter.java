import java.util.*;
public class OddEvenCounter {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = input.nextInt();
    int values[] = new int[size];
    
    System.out.println("Enter array elements:");
    for(int i = 0; i < size; i++){
        values[i] = input.nextInt();
    }
    
    int oddCount = 0;
    int evenCount = 0;
    
    for(int i = 0; i < size; i++){
        if(values[i] % 2 == 0){
            evenCount++;
        } else {
            oddCount++;
        }
    }
    
    System.out.println("Odd numbers count: " + oddCount);
    System.out.println("Even numbers count: " + evenCount);
}
}
