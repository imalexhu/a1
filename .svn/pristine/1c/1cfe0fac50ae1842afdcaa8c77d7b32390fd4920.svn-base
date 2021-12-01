        
import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.TimeUnit;


// Impliments the SorterMethods 

public class SorterImplimentation implements Sorter {
    
    //Serialises and returns the object in constructor
    public SorterImplimentation() throws RemoteException ,AlreadyBoundException{
        UnicastRemoteObject.exportObject(this,0);
    }

    // Adds value x to top of stack
    public void pushValue(int val) {
        myVal.push(val);
    }

    /*
    Perform opperation on the current stack, 
    either sorting it in 2 orders or removing all but the min or max values
    */    
    public void pushOperator(String operator){ 
        if(operator.equals("ascending")){
            Vector<Integer> temp = new Vector<Integer>();
            
            while(!myVal.empty()){
                temp.add(myVal.pop());
            }
            Collections.sort(temp);
            while(!temp.isEmpty()){
                myVal.push(temp.remove(temp.size()-1));
            }
        }else if(operator.equals("descending")){
            Vector<Integer> temp = new Vector<Integer>();
            
            while(!myVal.empty()){
                temp.add(myVal.pop());
            }
            Collections.sort(temp,Collections.reverseOrder());
            while(!temp.isEmpty()){
                myVal.push(temp.remove(temp.size()-1));
            }

        }else if(operator.equals("max")){
            int max = Integer.MIN_VALUE;
            while(!myVal.empty()){
                int temp = myVal.pop();
                if(max < temp){
                    max = temp;   
                }
            }
            myVal.push(max);
        }else if(operator.equals("min")){

            int min = Integer.MAX_VALUE;
            while(!myVal.empty()){
                int temp = myVal.pop();
                if(min > temp){
                    min = temp;
                }
            }
            myVal.push(min);
        }
    }
    
    //Return the first element of the stack
    public int pop(){
        int temp = myVal.pop();
        return temp;
    }

    //Returns whether the stack is empty or not
    public Boolean isEmpty() {
        return myVal.empty();
    }

    //Returns the first element of the stack after a certain delay
    public int delayPop(int millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Sleep error");
        }
        int temp = myVal.pop();
        return temp;
    }

    //Local Stack
    public Stack<Integer> myVal = new Stack<Integer>(); 
    
}