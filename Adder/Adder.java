/*
 * Adder.java
 *
 * Created on January 29, 2021, 1:36 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.rmi.*;
public interface Adder extends Remote{
    public int add(int x, int y) throws RemoteException;
}

