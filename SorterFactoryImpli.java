        
import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SorterFactoryImpli implements SorterFactory {

    //Instantiates a Sorter Factory Object,
    public SorterFactoryImpli() throws RemoteException, AlreadyBoundException{
        try {
            UnicastRemoteObject.exportObject(this,0);
        } catch (Exception e) {
            System.err.println("Error making factory");
        }
    }

    // returns an instance of Sorter object
    public Sorter createSorter() throws RemoteException {
        return new SorterImplimentation();
    }

    //Creates a Factory object and append it to the RMI registry.
    public static void main(String[] args) {
        try {
            SorterFactoryImpli Factory = new SorterFactoryImpli();
            Registry registry = LocateRegistry.createRegistry(1099);
            try {
                registry.bind("Factory", Factory);
            } catch (java.rmi.AlreadyBoundException e) {
                e.printStackTrace();
            }
            System.out.println("Factory Started");
        } catch (RemoteException e) {
            System.err.println(e.getMessage());
        }
    }
}