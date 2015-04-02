package Calculator;

/**
 * Created by Ehshan on 09/03/2015.
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServer() throws RemoteException {
    }

    @Override
    public int add(int value1, int value2) {
        return value1 + value2;
    }

    @Override
    public int subtract(int value1, int value2) {
        return value1 - value2;
    }

    @Override
    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    @Override
    public int divide(int value1, int value2) {
        return value1 / value2;
    }
}