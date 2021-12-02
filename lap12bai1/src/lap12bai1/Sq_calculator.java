/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12bai1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author ADMIN
 */
public class Sq_calculator extends UnicastRemoteObject implements Calculator{

    @Override
    public double square(double a) throws RemoteException {
       return a*a; 
    }
    
    
}
