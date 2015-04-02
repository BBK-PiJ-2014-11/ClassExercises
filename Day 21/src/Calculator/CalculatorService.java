package Calculator;

/**
 * Created by Ehshan on 09/03/2015.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorService extends Remote {

    public int add(int value1, int value2) throws RemoteException;

    public int subtract(int value1, int value2) throws RemoteException;

    public int divide(int value1, int value2) throws RemoteException;

    public int multiply(int value1, int value2) throws RemoteException;

}
