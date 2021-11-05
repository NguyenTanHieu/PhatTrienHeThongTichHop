import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcInterface extends Remote{
    public int count(String s) throws RemoteException;
    public String reverse(String s) throws RemoteException;
   
}