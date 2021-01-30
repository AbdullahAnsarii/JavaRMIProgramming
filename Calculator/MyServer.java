/*
 * MyServer.java
 *
 * Created on January 30, 2021, 7:17 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class MyServer extends UnicastRemoteObject implements Calculator{
    public MyServer() throws RemoteException{
        //super()
    }
    public long addition(long a, long b) throws RemoteException{
        return a+b;
    }
    
    public long subtraction(long a, long b) throws RemoteException{
        return a-b;
    }
    
    public long multiplication(long a, long b) throws RemoteException{
        return a*b;
    }
    
    public long division(long a, long b) throws RemoteException{
        return a/b;
    }
    public static void main(String args[]) throws RemoteException{
        try{
            Registry reg = LocateRegistry.createRegistry(8000);
            reg.rebind("hello server", new MyServer());
            System.out.println("Server is running successfully");
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}

