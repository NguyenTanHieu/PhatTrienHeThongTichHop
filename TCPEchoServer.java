import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TPCEchoSever {
   public static void main(String[] args) {
      try {
        ServerSocket ss= new ServerSocket(6789);
        System.out.println("SEVER da duoc tao");
        while(true){
            Socket s= ss.accept();
        InputStream is= s.getInputStream();
        OutputStream os= s.getOutputStream();
        int ch= 0;
        while(true){
            ch= is.read();
            if(ch==-1)
            break;
            System.out.println((char)ch);
            os.write(ch);
        }
    }
      } catch (Exception e) {
          //TODO: handle exception
      }
   }
}



