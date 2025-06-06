import java.util.*;
public class SearchElement {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int size = input.nextInt();
    int numbers[] = new int[size];
    
    System.out.println("Enter array elements:");
    for(int i = 0; i < size; i++){
        numbers[i] = input.nextInt();
    }
    
    System.out.print("Enter element to search: ");
    int target = input.nextInt();
    
    boolean found = false;
    int position = -1;
    
    for(int i = 0; i < size; i++){
        if(numbers[i] == target){
            found = true;
            position = i;
            break;
        }
    }
    
    if(found){
        System.out.println("Element found at position: " + position);
    } else {
        System.out.println("Element not found");
    }
}
}
