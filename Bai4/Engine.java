/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;
import java.util.Scanner;

/**
 *
 * @author Thang
 */
public class Engine {
    String id;
    String name;
    String nsx;
    int nam;
    double gia;

    public Engine() {
    }

    public Engine(String id, String name, String nsx, int nam, double gia) {
        this.id = id;
        this.name = name;
        this.nsx = nsx;
        this.nam = nam;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    Scanner sc= new Scanner(System.in);
    public void input()
    {
        System.out.println("Nhập mã sản phẩm:");
        this.id=sc.nextLine();
        System.out.println("Nhập tên sản phẩm");
        this.name=sc.nextLine();
        System.out.println("Nhập nhà sản xuất:");
        this.nsx=sc.nextLine();
        System.out.println("Nhập năm sản xuất:");
        this.nam=sc.nextInt();
        System.out.println("Nhập giá sản phẩm:");
        this.gia=sc.nextDouble();

    }
    public void display()
    {
        System.out.println("Mã sản phẩm: "+this.id);
        System.out.println("Tên sản phẩm: "+this.name);
        System.out.println("Nhà sản xuất: "+this.nsx);
        System.out.println("Năm sản xuất: "+this.nam);
        System.out.println("Giá sản phẩm: "+this.gia);
    }
}
