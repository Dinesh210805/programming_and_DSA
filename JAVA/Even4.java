import java.util.*;
public class Even4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num%10)%2 == 0 && ((num%100)/10) == 4 ){
            System.out.println(1);
        }else{System.out.println(0);}
    }
    
}
