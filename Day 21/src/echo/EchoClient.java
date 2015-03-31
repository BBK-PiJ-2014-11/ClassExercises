package echo;

/**
 * Created by Ehshan on 09/03/2015.
 */
import java.rmi.*;
import java.rmi.RemoteException;
import java .net.MalformedURLException;

public class EchoClient{

    public static void main(String[] args){
        launch();
    }

    private static void launch(){
        if (System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }
        try {
            Remote service = Naming.lookup("//127.0.0.1:1099/echo");
            EchoService echoService = (EchoService) service;
            String receivedEcho = echoService.echo("Hello!");
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
}