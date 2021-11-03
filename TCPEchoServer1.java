 import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoSever1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("SEVER phuc vu song song");

            while(true) {
               try {
                Socket s = ss.accept();
                Processing p= new Processing(s);
                p.start();
               } catch (Exception e) {
                   //TODO: handle exception
               }
                              
            }

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}

