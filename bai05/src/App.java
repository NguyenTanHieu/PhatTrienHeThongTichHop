import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        System.out.println("Chuong trinh tinh tong day so thuc");
        System.out.print("day co bao nhieu so: ");
        int n = sc.nextInt();
        float [] A = new float[n];
        float total =0;
        for(int i=0; i<n; ++i) {
            System.out.print("so thu " + (int)(i+1) + ": ");
            A[i] = (float) sc.nextFloat();
        }
        for(int i=0; i<n; ++i) 
            total +=A[i];        
        System.out.println("tong cac gia tri trong mang cua ban: "+ (float)total);

    }
}