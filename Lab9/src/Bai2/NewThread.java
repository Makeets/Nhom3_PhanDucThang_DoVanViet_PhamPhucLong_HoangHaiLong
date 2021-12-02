/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author nauq2
 */
public class NewThread extends Thread{
    ServerSocket mServer;
    JTextArea mTxaStatus;
    private int count;
    public NewThread(JTextArea txaStatus,int count) {
        mTxaStatus = txaStatus;
        this.count = count;
    }
    @Override
    public void run()
    {
        try
        {
            String BanKinh,DienTich;
            double s;
            mServer = new ServerSocket(1234);
            mTxaStatus.append("Server đã sẵn sàng!\nĐang chờ dữ liệu...\n\n");
            while(true)
            {
                count++;
                Socket connectionSocket = mServer.accept();
                DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                BanKinh = inFromClient.readLine();
                mTxaStatus.append("Đã nhận bán kính r = "+BanKinh+" của Client thứ: "+count+".\n");
                double r = Double.parseDouble(BanKinh);
                s = 3.14*r*r;
                DienTich = String.valueOf(s);
                mTxaStatus.append("Thực hiện tính diện tích: \n");
                outToClient.writeBytes(DienTich+'\n');
                mTxaStatus.append("Đã gửi kết quả về cho Client thành công\n\n");
            }
        }catch(Exception ex)
        {
            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE,null, ex);
            mTxaStatus.append("Server đã xảy ra lỗi\n");
        }
    }
    public void StopServer()
    {
        super.stop();
        try {
            mServer.close();
        } catch (IOException ex) {
            Logger.getLogger(NewThread.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
}
