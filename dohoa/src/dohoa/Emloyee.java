/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dohoa;
/**
 *
 * @author Luan
 */
public class Emloyee {
    //khai báo dữ liệu
    
    String MaNV;
    String HoTen;
    int tuoi;
    String email;
    int luong;
    
    // constructor

    public Emloyee() {
    }

    public Emloyee(String MaNV, String HoTen, int tuoi, String email, int luong) {
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }
    // getter and setter
    
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    
}
