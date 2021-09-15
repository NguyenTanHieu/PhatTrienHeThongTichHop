import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("chuong trinh tinh tong 1 den n");      
        System.out.println("Cho n= -1 de ket thuc chuong trinh");       
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap n= ");        
            int n = sc.nextInt();
            if (n==-1) break;            
            int total = 0;
            for(int i=0; i<=n; i++) 
                total += i;            
            System.out.println("tong tu 1 den " + n + " là: " + total);            
        } 
    }
}