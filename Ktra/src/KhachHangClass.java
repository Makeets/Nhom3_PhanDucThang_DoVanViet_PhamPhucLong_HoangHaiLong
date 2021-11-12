/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pham Phuc Long
 */
public class KhachHangClass {
    String makh;
    String tenkh;
    long sdt;

    public KhachHangClass() {
    }

    public KhachHangClass(String makh, String tenkh, long sdt) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.sdt = sdt;
    }

    public String getMakh() {
        return makh;
    }
    
    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public float getsdt() {
        return sdt;
    }

    public void setsdt(long sdt) {
        this.sdt = sdt;
    }

}
