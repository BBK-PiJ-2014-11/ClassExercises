package echo;

/**
 * Created by Ehshan on 09/03/2015.
 */
import java.rmi.server.*;
import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java .net.MalformedURLException;

public class EchoClient{

    public static void main(String[] args){
        //EchoClient esl = new EchoClient();
        launch();
    }

    private static void launch(){
        if (System.getSecurityManager() == null){
            System.setSecurityManager(new RMISecurityManager());
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