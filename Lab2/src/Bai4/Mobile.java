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
public class Mobile extends Engine{
    String noi;

    public Mobile() {
    }

    public Mobile(String noi, String id, String name, String nsx, int nam, double gia) {
        super(id, name, nsx, nam, gia);
        this.noi = noi;
    }

    public String getNoi() {
        return noi;
    }

    public void setNoi(String noi) {
        this.noi = noi;
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

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void display() {
        super.display(); 
        System.out.println("Nơi sản xuất: "+this.noi);
    }

    @Override
    public void input() {
        super.input(); 
        sc.nextLine();
        System.out.println("Nhập nơi sản xuất:");
        this.noi=sc.nextLine();
    }
    
}
