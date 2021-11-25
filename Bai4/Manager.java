/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author Thang
 */
public class Manager {
    static void menu()
    {
        System.out.println("1.Nhập thông tin danh sách điện thoại\n2.Nhập thông tin danh sách ô tô\n3.Hiển thị thông tin\n4.Tìm kiếm theo tên nhà sản xuất\n5.Thoát");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Car> a= new ArrayList<Car>();
        ArrayList<Mobile> b =new ArrayList<Mobile>();
        int n,x,dem=0,dem1=0;
        
        do
        {   
            menu();
            System.out.println("Nhập lựa chọn");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                {   
                    System.out.println("Nhập số sản phẩm điện thoại");
                    n=sc.nextInt();
                    dem=0;
                    for(int i=0;i<n;i++)
                    {   
                        System.out.println("----Nhập thông tin sản phẩm thứ "+(i+1)+"----");
                        Mobile z= new Mobile();
                        z.input();
                        b.add(z);
                        dem++;
                    }
                    break;
                }
                case 2:
                {
                      System.out.println("Nhập số sản phẩm ô tô");
                    n=sc.nextInt();
                    dem1=0;
                    for(int i=0;i<n;i++)
                    {   
                        System.out.println("----Nhập thông tin sản phẩm thứ "+(i+1)+"----");
                        Car y= new Car();
                       y.input();
                        a.add(y);
                        dem1++;
                    }
                    break;
                }
                case 3:
                {   
                    if (dem != 0) {
                        System.out.println("THÔNG TIN SẢN PHẨM ĐIỆN THOẠI");
                        for (Mobile c : b) {
                            c.display();
                            System.out.println("------------------");
                        }
                    } else {
                        System.out.println("KHÔNG CÓ SẢN PHẨM ĐIỆN THOẠI NÀO");
                        System.out.println("------------");
                    }
                    if (dem1 != 0) {
                        System.out.println("THÔNG TIN SẢN PHẨM Ô TÔ");
                        for (Car c : a) {
                            c.display();
                            System.out.println("------------------");
                        }
                    } else {
                        System.out.println("KHÔNG CÓ SẢN PHẨM Ô TÔ NÀO");
                        System.out.println("---------");
                    }
                    break;
                }
                case 4: {
                    int dem3 = 0, dem4 = 0;
                    sc.nextLine();
                    System.out.println("Tìm kiếm theo nhà sản xuất ");
                    String e = sc.nextLine();
                    System.out.println("------Điện thoại------");
                    for (int i = 0; i < b.size(); i++) {
                        if (b.get(i).getNsx().equalsIgnoreCase(e)) {
                            dem3++;
                            b.get(i).display();
                            System.out.println("----------");
                        }
                    }
                     if (dem3 == 0) {
                            System.out.println("Danh sách điện thoại không có nhà sản xuất này.....");
                        }
                    System.out.println("------Ô tô-------");
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i).getNsx().equalsIgnoreCase(e)) {
                            dem4++;
                            a.get(i).display();
                            System.out.println("------------");
                        }
                    }
                     if (dem4 == 0) {
                            System.out.println("Danh sách ô tô không có nhà sản xuất này......");
                        }
                break;
                }
            }
        }
        while(x!=5);
    }
    
}
