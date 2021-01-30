/*
 * MyClient.java
 *
 * Created on January 30, 2021, 7:17 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
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
            Registry reg = LocateRegistry.getRegistry("localhost",8000);
            Calculator stub = (Calculator)reg.lookup("hello server");
            System.out.println("Please select the operation");
            System.out.println("1:Addition \n2:Subtraction \n3:Multiplication \n4:Division");
            int operation = sc.nextInt();
            System.out.println("Please enter operands: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (operation == 1){
                System.out.println("Addition result of "+ x + " and " + y + " is: " +stub.addition(x,y));
            }
            else if (operation == 2){
                System.out.println("Subtraction result of "+ x + " and " + y + " is: " + stub.subtraction(x,y));
            }
            else if (operation == 3){
                System.out.println("Multiplication result of "+ x + " and " + y + " is: " + stub.multiplication(x,y));
            }
            else if (operation == 4){
                System.out.println("Division result of "+ x + " and " + y + " is: " +stub.division(x,y));
            }   
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}