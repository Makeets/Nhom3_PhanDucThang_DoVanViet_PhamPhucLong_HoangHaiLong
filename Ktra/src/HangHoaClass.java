/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pham Phuc Long
 */
public class HangHoaClass {
    String mahh;
    String tenhh;
    String quicach;
    String dvtinh;
    double gia;

    public HangHoaClass() {
    }

    public HangHoaClass(String mahh, String tenhh, String quicach, String dvtinh, double gia) {
        this.mahh = mahh;
        this.tenhh = tenhh;
        this.quicach = quicach;
        this.dvtinh = dvtinh;
        this.gia = gia;
    }

  

    public String getMahh() {
        return mahh;
    }

    public void setMahh(String mahh) {
        this.mahh = mahh;
    }

    public String getTenhh() {
        return tenhh;
    }

    public void setTenhh(String tenhh) {
        this.tenhh = tenhh;
    }

    public String getQuicach() {
        return quicach;
    }

    public void setQuicach(String quicach) {
        this.quicach = quicach;
    }

    public String getDvtinh() {
        return dvtinh;
    }

    public void setDvtinh(String dvtinh) {
        this.dvtinh = dvtinh;
    }

    public double getgia() {
        return gia;
    }

    public void setgia(double gia) {
        this.gia = gia;
    }
}
