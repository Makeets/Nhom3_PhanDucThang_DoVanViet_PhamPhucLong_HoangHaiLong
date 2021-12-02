/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author Thang
 */
//Lớp này khởi động Server trong 1 thread khác để tránh giao diện bị treo khi Server đang đợi kết nối
public class TCPServer_Thread extends Thread{

    /**
     * @param args the command line arguments
     */
    ServerSocket mServer;
   JTextArea mTxaStatus; // để lưu status của sever(những gì hiện ở trong text)
   public TCPServer_Thread(JTextArea txt)
   {
       mTxaStatus=txt;
   }

    @Override
    public void run()
    {
        try
        {
            String a,b,c;
                int tong;
                mServer=new ServerSocket(2212);
                mTxaStatus.append("Server đã sẵn sàng!\nĐang chờ dữ liệu....\n");
                while(true)
                {
                    Socket cnn=mServer.accept();
                    DataInputStream fromCL=new DataInputStream((cnn.getInputStream()));
                    DataOutputStream toCL=new DataOutputStream((cnn.getOutputStream()));
                    a=fromCL.readLine();
                    b=fromCL.readLine();
                    mTxaStatus.append("Đã nhận a= "+a+"\nĐã nhận b= "+b+"\n");
                    int a1=Integer.parseInt(a);
                    int b1=Integer.parseInt(b);
                    tong=a1+b1;
                    c=String.valueOf(tong);
                    mTxaStatus.append("Thực hiện phép tính....");
                    toCL.writeBytes(c+"\n");
                    mTxaStatus.append("Đã gửi cho client thành công\n");
                }
        }
        catch(Exception ex)
        {
            mTxaStatus.append("Lỗi server");
        }
    }
   public void StopServer()
   {
       super.stop();
       try
       {
          mServer.close();
       }catch(IOException e)
       {}
   }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
