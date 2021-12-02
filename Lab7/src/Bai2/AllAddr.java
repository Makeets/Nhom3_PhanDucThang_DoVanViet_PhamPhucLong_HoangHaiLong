/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.net.*;
/**
 *
 * @author Thang
 */
public class AllAddr {
    public static void main(String[] args) {
        try
        {
            InetAddress all[]= InetAddress.getAllByName("www.youtube.com");//lấy toàn bộ IP của máy trạm có tên miền facebook.com
            for(int i=0;i<all.length;i++)
            {
                System.out.println(all[i]);
            }
            
        }
        catch(UnknownHostException e)
        {
            System.out.println("Không tìm thấy....");
        }
    }
}
