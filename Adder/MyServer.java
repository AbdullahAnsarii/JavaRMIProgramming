/*
 * MyServer.java
 *
 * Created on January 29, 2021, 1:31 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author mpiuser
 */
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class MyServer extends UnicastRemoteObject implements Adder{
    public MyServer() throws RemoteException{
        //super()
    }
    public int add(int x, int y) throws RemoteException{
        return x+y;
    }
    public static void main(String args[]) throws RemoteException{
        try{
            Registry reg = LocateRegistry.createRegistry(9000);
            reg.rebind("hello server", new MyServer());
            System.out.println("Server is running successfully");
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}

