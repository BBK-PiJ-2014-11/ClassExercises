package Date;

/**
 * Created by Ehshan on 09/03/2015.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

public interface DateService extends Remote {

    public Calendar date() throws RemoteException;

}