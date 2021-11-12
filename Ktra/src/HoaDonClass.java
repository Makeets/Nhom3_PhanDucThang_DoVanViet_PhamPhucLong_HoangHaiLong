
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pham Phuc Long
 */
public class HoaDonClass {
    String hdso;
    Date ngay;
    String makh;
    double trigia;

    public HoaDonClass() {
    }

    public HoaDonClass(String hdso, Date ngay, String makh, double trigia) {
        this.hdso = hdso;
        this.ngay = ngay;
        this.makh = makh;
        this.trigia = trigia;
    }

    public String getHdso() {
        return hdso;
    }

    public void setHdso(String hdso) {
        this.hdso = hdso;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public double getTrigia() {
        return trigia;
    }

    public void setTrigia(double trigia) {
        this.trigia = trigia;
    }
}
