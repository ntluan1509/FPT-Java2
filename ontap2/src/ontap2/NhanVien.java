/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap2;

import java.io.Serializable;


/**
 *
 * @author Luan
 */
public class NhanVien implements Serializable{
    public String manv;
    public String ten;
    public String matkhau;
    public String NgaySinh;

    public NhanVien() {
    }

    public NhanVien(String manv, String ten, String matkhau, String NgaySinh) {
        this.manv = manv;
        this.ten = ten;
        this.matkhau = matkhau;
        this.NgaySinh = NgaySinh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

   
    
    
}
