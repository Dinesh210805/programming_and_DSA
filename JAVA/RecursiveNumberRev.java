import java.util.*;
public class RecursiveNumberRev {
    public static int count(int x, int rev){
        if(x == 0){
            return rev;
        }else{
            rev = rev * 10 + x % 10;
            return count(x / 10, rev);
        }
    }
    
    public static void main(String[] args) {
        int reversedNumber = count(12345, 0);
        System.out.println(reversedNumber);
    }
}
