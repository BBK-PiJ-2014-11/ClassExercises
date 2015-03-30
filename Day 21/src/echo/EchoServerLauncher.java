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

public class EchoServerLauncher {

    public static void main(String[] args) {
        // 1. If there is no security manager, start on
        if ( System.getSecurityManager() == null ) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            // 2. Create the registry if there is not one
            LocateRegistry.createRegistry(1099);
            // 3. Create the server object
            EchoServer server = new EchoServer();
            // 4. Register (bind) the server object on the registry.
            //    The registry may be on a different machine
            String registryHost = "//localhost/";
            String serviceName = "echo";
            Naming.rebind(registryHost + serviceName, server );
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}