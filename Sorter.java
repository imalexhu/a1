 
import java.rmi.Remote;
import java.rmi.RemoteException;


//Defines the interface for the Sorter objects and its methods

public interface Sorter extends Remote {
    void pushValue(int val) throws RemoteException;
    void pushOperator(String operator) throws RemoteException;
    int pop() throws RemoteException;
    Boolean isEmpty() throws RemoteException;
    int delayPop(int millis) throws RemoteException;
}