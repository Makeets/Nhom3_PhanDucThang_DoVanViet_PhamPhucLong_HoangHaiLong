/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12bai2;

import java.awt.print.Book;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface RMIInterface extends Remote {

    Book findBook(Book b) throws RemoteException;

    ArrayList<Book> allBooks() throws RemoteException;

}
