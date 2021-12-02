/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;
import java.io.*;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Thang
 */
//Viết ứng dụng phía Client truy xuất đến một trang web sử dụng class Socket
public class Client {

    public static void main(String[] args) throws IOException {
     
            System.out.println("Đang kết nối vs Server....");
            Socket client=new Socket("127.0.0.1",2212);
            System.out.println("Kết nối thành công");
            String so,so1,so2;
            int a=0;
          
            DataInputStream user=new DataInputStream(System.in); //luông dữ liệu từ người dùng
            DataInputStream fromSV=new DataInputStream(client.getInputStream());//luồng dữ liệu nhận từ server
            DataOutputStream toSV=new DataOutputStream(client.getOutputStream());//luông dữ liệu gửi đến server
             
                do
                {
                 System.out.println("Nhập số nguyên bất kỳ "); 
                 so = user.readLine();
                 Pattern pattern = Pattern.compile("\\d*");
                 Matcher matcher = pattern.matcher(so);
                if (matcher.matches()) {
                toSV.writeBytes(so+"\n");
                a=1;
                } else
                {
                System.out.println("Bạn vừa nhập vào không phải số, vui lòng nhập lại !");
                
                } 
                }while(a!=1);
                
                 so1=fromSV.readLine();
                 System.out.println(so1+"\n");
                 
                 so2=fromSV.readLine();
                 System.out.println(so2+"\n");
                 
                 String so3=fromSV.readLine();
                 System.out.println(so3+"\n");
                 
                 user.close();
                 fromSV.close();
                 toSV.close();
                 client.close();
                
}
}
