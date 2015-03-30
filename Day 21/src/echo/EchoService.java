package echo;

/**
 * Created by Ehshan on 09/03/2015.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface EchoService extends Remote {

    String echo(String s) throws RemoteException;

}