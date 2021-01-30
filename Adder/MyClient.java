/*
 * MyClient.java
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
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
public class MyClient {
    public static void main(String args[]) throws RemoteException{
        MyClient c = new MyClient();
        c.connectRemote();
    }
    private void connectRemote() throws RemoteException{
        try{
            Scanner sc = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry("localhost",9000);
            Adder stub = (Adder)reg.lookup("hello server");
            System.out.println(stub.add(34,4));
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}
