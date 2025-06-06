import java.util.*;
public class ArrayOddEvenSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int odd = 0;
        int even = 0;

        for(int i = 0, j = 1; i<n && j<n; i+=2, j+=2)
        {
            if(arr[i]%2 != 0){
            even += arr[i]; }
            if(arr[j]%2==0){}
            odd += arr[j];
        }  
        

        System.out.println("even pos:"+even);
        System.out.println("odd pos :"+odd);

    }
    } 

