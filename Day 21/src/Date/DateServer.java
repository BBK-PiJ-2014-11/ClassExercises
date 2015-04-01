package Date;

/**
 * Created by Ehshan on 09/03/2015.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException {
    }

    @Override
    public Calendar date() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Calendar date = Calendar.getInstance();
        System.out.println(dateFormat.format(date.getTime()));
        return date;
    }
}
