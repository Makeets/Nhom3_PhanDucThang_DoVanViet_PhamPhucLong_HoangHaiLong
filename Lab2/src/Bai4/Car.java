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
public class Car extends Engine{
    int seats;
    String speed;

    public Car() {
    }

    public Car(int seats, String speed, String id, String name, String nsx, int nam, double gia) {
        super(id, name, nsx, nam, gia);
        this.seats = seats;
        this.speed = speed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
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
        System.out.println("Chỗ ngồi: "+this.seats);
        System.out.println("Tốc độ tối đa: "+this.speed);
    }

    @Override
    public void input() {
        super.input(); 
         System.out.println("Nhập chỗ ngồi ");
        this.seats=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tốc độ tối đa:");
        this.speed=sc.nextLine();
    }
    
    
    
}
