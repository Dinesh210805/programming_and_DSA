import java.util.*;

public class Assignment19625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        int i = 0;
        while (i < str.length()) {
            String num = "";

            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
                i++;
            }

            int count = Integer.parseInt(num);
            char ch = str.charAt(i);
            i++;

            for (int j = 0; j < count; j++) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
