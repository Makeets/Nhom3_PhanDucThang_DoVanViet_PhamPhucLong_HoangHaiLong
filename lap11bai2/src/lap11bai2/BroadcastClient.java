package lap11bai2;


import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import lap11bai2.BroadcastServer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class BroadcastClient {

    public static final int PORT = 1200;

    public static void main(String args[]) throws Exception {
        MulticastSocket socket;
        DatagramPacket packet;
        InetAddress address;
        address = InetAddress.getByName(args[0]);
        socket = new MulticastSocket(BroadcastServer.PORT);
        socket.joinGroup(address);
        byte[] data = null;
        packet = new DatagramPacket(data, data.length);
        for (;;) {
            socket.receive(packet);
            String str = new String(packet.getData());
            System.out.println(" Time signal recieved from"
                    + packet.getAddress() + " Time is : " + str);
        } 
    }
}
