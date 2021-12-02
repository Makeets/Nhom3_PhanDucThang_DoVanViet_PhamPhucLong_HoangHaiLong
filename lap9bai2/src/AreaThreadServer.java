
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class AreaThreadServer {

    public static void main(String[] args) {
//Khai bao bien
        int count;
        ServerSocket svr = null;
        Socket cl = null;
        int portServer = 3456;
        try {
            svr = new ServerSocket(portServer);
            count = 0;
            while (true) {
                cl = svr.accept();
                new NewThread(cl, count);
                count++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
