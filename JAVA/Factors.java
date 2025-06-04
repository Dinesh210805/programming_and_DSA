import java.util.*;

public class Factors{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println("-ve or 0 not allowed");
        }else{
            for(int i=1 ; i <= n; i++){
                if(n % i == 0){
                    System.out.print(i + " ");
                }
            }
        }

    }
}