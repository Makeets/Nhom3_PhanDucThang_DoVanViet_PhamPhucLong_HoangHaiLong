/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12bai1;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author ADMIN
 */
public interface Calculator extends  Remote{
    public double square (double a) throws  RemoteException;
    
}
