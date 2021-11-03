//   import java.io.IOException;
//     import java.net.ServerSocket;
//     import java.net.Socket;
    
//     class TPCEchoSever1{
//         public final static int serverPort=8;
//         public static void main(String[] args) {
//            try {
//                ServerSocket ss=new ServerSocket(serverPort);
//                System.out.println("Server da duoc tao");
//                while(true){
//                    try {
//                        Socket s=ss.accept();
//                        RequestProcessing rp= new RequestProcessing(s);
//                        rp.start();
//                    } catch (IOException ie1) {
//                        System.out.println("Connection Error:"+ie1);
//                        //TODO: handle exception
//                    }
//                }
//            } catch (IOException ie) {
//                System.out.println("Server Creation Error:"+ie);
//                //TODO: handle exception
//            }
//         }
//     } 

