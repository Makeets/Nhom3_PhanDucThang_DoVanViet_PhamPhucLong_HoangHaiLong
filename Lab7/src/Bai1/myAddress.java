/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.net.*;
/**
 *
 * @author Thang
 */
public class myAddress {
    public static void main(String[] args) {
        try
        {
            InetAddress address= InetAddress.getLocalHost(); //gán cho address địa chỉ máy cục bộ 
            System.out.println("Chào.Tên tao là "+address.getHostName()+" và địa chỉ mạng của tao là "+address.getHostAddress());
        }                                       //dùng địa chỉ đc gán vào address để lấy tên máy          hiển thị địa chỉ IP đc gán vào address
        catch(UnknownHostException ex)
        {
            System.out.println("Chịu");
            
        }
    }
}
