/*
 * AdderRemote.java
 *
 * Created on January 30, 2021, 4:42 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author mpiuser
 */
import java.rmi.*;
import java.rmi.server.*;
public class AdderRemote extends UnicastRemoteObject implements Adder{
    AdderRemote() throws RemoteException{
        super();
    }
    public int add(int x, int y){
        return x+y;
    }
    
}
