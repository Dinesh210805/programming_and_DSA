import java.util.Scanner;
public class Array
{
	public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter array size:");
        n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int k:a){
            System.out.println(k+" ");
        }
	}
}