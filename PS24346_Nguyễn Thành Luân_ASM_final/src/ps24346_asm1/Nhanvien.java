/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps24346_asm1;

import java.io.Serializable;

/**
 *
 * @author Luan
 */
public class Nhanvien  implements Serializable  {
    public String ma , hoTen, email;
    public double luong;
    public int tuoi;

    public Nhanvien() {
    }

    public Nhanvien(String ma, String hoTen, String email, double luong, int tuoi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.email = email;
        this.luong = luong;
        this.tuoi = tuoi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    
    
            
}
