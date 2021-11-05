import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
  public static void main(String[] args) {
      try {
        LocateRegistry.createRegistry(10000);
        Naming.bind("rmi://localhost:10000/MyService", new CalcImplement());
        System.out.println("server da khoi dong");

      } catch (Exception e) {
          System.out.println("server bi Loi");
      }
       
  }
}
