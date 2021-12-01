
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SorterClient {

    private SorterClient() {}

    /*
    It locates the RMI registry, and retrives the Factory Stub in it
    It creates a unique Sorter instance using the Factory Stub

    Then itterates through the args 2 increment at a time
    And apply the appropraite opperation onto its own Sorter Stub. 
    
    Every even arg represents the function name,
    Every odd arg is the input value if needed. 
    */
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",1099);
            SorterFactory factory = (SorterFactory) registry.lookup("Factory");
            Sorter stub = factory.createSorter();

            for(int i = 0; i< args.length;i+=2){
                if(args[i].equals("pushValue")){
                    
                    stub.pushValue(Integer.parseInt(args[i+1]));
                    System.out.println("Pushed :" + Integer.parseInt(args[i+1]));                    
                }else if(args[i].equals("pushOperator")){

                    stub.pushOperator(args[i+1]);
                    System.out.println("Opperation :" + args[i+1]);                    

                }else if(args[i].equals("pop")){
                    int temp = stub.pop();
                    System.out.println("Popped :" + temp);                    

                }else if(args[i].equals("isEmpty")){
                    Boolean temp = stub.isEmpty();
                    System.out.println("Empty :" + temp);                    

                }else if(args[i].equals("delayPop")){
                    int temp = stub.delayPop(Integer.parseInt(args[i+1]));
                    System.out.println("Popped :" + temp + " after " + Integer.parseInt(args[i+1]) + " seconds");                       
                }
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}