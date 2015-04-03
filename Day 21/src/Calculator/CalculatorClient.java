package Calculator;

/**
 * Created by Ehshan on 09/03/2015.
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class CalculatorClient {

    public static void main(String[] args) throws RemoteException {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            Remote service = Naming.lookup("//127.0.0.1:1099/calculator");
            CalculatorService calculator = (CalculatorService) service;
            String opp = args[1];
            if(!Character.isDigit(args[0].charAt(1)) || !Character.isDigit(args[0].charAt(2)) ){
                System.out.println("Must enter 2 numbers");
            } else if (!opp.equals("+") || !opp.equals("-") || !opp.equals("*") || !opp.equals("/")) {
                System.out.println("No opperator");
            } else {
                int value1 = Integer.parseInt(args[0]);
                int value2 = Integer.parseInt(args[2]);
                int result = 0;
                if (opp.equals("+")) {
                    result = calculator .add(value1, value2);
                } else if (opp.equals("-")) {
                    result = calculator.subtract(value1, value2);
                } else if (opp.equals("*")) {
                    result = calculator .multiply(value1, value2);
                } else if (opp.equals("/")) {
                    result = calculator .divide(value1, value2);
                } else {
                    System.out.println("Error, try again");
                }
                System.out.println(result);
            }
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
}