/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

import java.net.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Thang
 */
public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Server đang khởi động....");
        ServerSocket sv = new ServerSocket(2212);
        System.out.println("Server đã sẵn sàng");

        Socket cnn = sv.accept();//chấp nhận kết nối từ client
        DataInputStream fromCL = new DataInputStream(cnn.getInputStream());//luồng nhận dữ liệu từ client
        DataOutputStream toCL = new DataOutputStream(cnn.getOutputStream());

        String so;
        int a;
        so = fromCL.readLine();
        System.out.println("Nhận từ bên client: " + so);

        int count = 0;
        a = Integer.parseInt(so);
        if (a == 1) {
            String c = "Day khong phai so nguyen to";
            toCL.writeBytes(c + "\n");
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            String b = "Day la so nguyen to";
            toCL.writeBytes(b + "\n");
        } else {
            String c = "Day khong phai so nguyen to";
            toCL.writeBytes(c + "\n");
        }
        if (a % 2 == 0) {
            String c = "Day la so chan";
            toCL.writeBytes(c + "\n");
        } else {
            String c = "Day la so le";
            toCL.writeBytes(c + "\n");
        }
        int tong = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                tong = tong + i;
            }
        }
        if (tong == a) {
            String c = "Day la so hoan hao";
            toCL.writeBytes(c + "\n");
        } else {
            String c = "Day khong phai la so hoan hao";
            toCL.writeBytes(c + "\n");
        }
        fromCL.close();
        toCL.close();
        sv.close();
    }
    /*  public static void ngto(int a,int count)
    {
          count=0;
                for(int i=2;i<a;i++)
                {
                    if(a/i==0)
                    {
                        count++;
                    }
                }
    }*/
}
