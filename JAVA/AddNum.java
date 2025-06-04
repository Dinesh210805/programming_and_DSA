import java.util.*;;
public class AddNum {
    public static void main(String[] args) {
        int a = 12;
        System.out.println((a/100 == 0)?((a%10)+((a%100)/10)):"Error");  
    }
  
}
