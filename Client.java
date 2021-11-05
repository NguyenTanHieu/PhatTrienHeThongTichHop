import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner nhap=new Scanner(System.in);
        while (true) {
            System.out.println("1. Dem tu trong chuoi\n2. Dao chuoi\n3. nhap Exit de thoat\nchon chuc nang");
            String Chon=nhap.nextLine();
            try {
                Registry reg=LocateRegistry.getRegistry(10000);
                CalcInterface calc=(CalcInterface) reg.lookup("MyService");
                switch (Chon) {
                    case "1":
                        System.out.println("Nhap chuoi can dem tu: ");
                        String s=nhap.nextLine();
                        System.out.println("So tu trong chuoi la: "+calc.count(s));
                        break;
                    case "2":
                        System.out.println("Nhap chuoi muon dao nguoc: ");
                        String s2=nhap.nextLine();
                        System.out.println("Chuoi dao nguoc la: "+calc.reverse(s2));
                        break;
                    case "exit":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Lua chon khong hop le");
                        break;
                        
                }
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
        
        
        

    }
}
