import java.util.*;
public class ArrayMaxMin {

    public static void main(String[] args){
        int arr[] = new int[]{5,6,5,3,8,3,1,4};
        int key = 3;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] == key){
                int pos =i+1;
                System.out.println(pos); 
                break;
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
