/*
 * Calculator.java
 *
 * Created on January 30, 2021, 7:16 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Calculator extends Remote{
    public long addition(long a, long b) throws RemoteException;
    public long subtraction(long a, long b) throws RemoteException;
    public long multiplication(long a, long b) throws RemoteException;
    public long division(long a, long b) throws RemoteException;
}
