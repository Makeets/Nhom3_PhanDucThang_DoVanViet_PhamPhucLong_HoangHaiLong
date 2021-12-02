/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap11bai2;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Date;


/**
 *
 * @author ADMIN
 */
public class BroadcastServer {
    public static final int PORT = 1200;

    public static void main(String args[]) throws Exception {
        MulticastSocket socket;
        DatagramPacket packet;
        InetAddress address;
        address = InetAddress.getByName();
        socket = new MulticastSocket();
        socket.joinGroup(address);
        byte[] data = null;
        for (;;) {
            Thread.sleep(1000);
            System.out.println("Sending ");
            String str = (new Date()).toString();
            data = str.getBytes();
            packet = new DatagramPacket(data, str.length(), address, PORT);
            socket.send(packet);
        } 
    }
}


