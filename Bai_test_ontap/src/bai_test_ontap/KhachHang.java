/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_test_ontap;

import java.io.Serializable;

/**
 *
 * @author Luan
 */
public class KhachHang implements Serializable{
    public int maKH;
    public String ten, matKhau, email;

    public KhachHang() {
    }

    public KhachHang(int maKH, String ten, String matKhau, String email) {
        this.maKH = maKH;
        this.ten = ten;
        this.matKhau = matKhau;
        this.email = email;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
   
}
