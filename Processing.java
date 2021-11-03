import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Processing extends Thread{
    Socket s;
    Processing(Socket s){
        this.s =s;
    }
    public void run(){
        try {
            OutputStream os=s.getOutputStream();
            InputStream is=s.getInputStream();
            while(true){
                int n=is.read();
                if(n==-1)
                break;
                os.write(n);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
