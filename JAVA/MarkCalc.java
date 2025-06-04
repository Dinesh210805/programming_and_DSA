import java.util.*;
public class MarkCalc {

    public static void main(String[] args) {
        String Name;
        int m1,m2,m3,m4,m5;    
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Student Name : ");
        Name = read.nextLine();
        System.out.print("M1 : ");
        m1 = read.nextInt();
        System.out.print("M2 : ");
        m2 = read.nextInt();
        System.out.print("M3 : ");
        m3 = read.nextInt();
        System.out.print("M4 : ");
        m4 = read.nextInt();
        System.out.print("M5 : ");
        m5 = read.nextInt();
        System.out.println("Hi!"+" "+Name);
        System.out.println("Your Total :"+(m1+m2+m3+m4+m5));
        System.out.println("Avg :"+(float)(m1+m2+m3+m4+m5)/5);    }
}
