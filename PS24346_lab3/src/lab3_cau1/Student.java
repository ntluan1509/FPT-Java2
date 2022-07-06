/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_cau1;

/**
 *
 * @author admin
 */
public class Student {
    //1. khai báo dữ liệu
    String ten;
    double diem;
    String nganh;

    public Student() {
    }

    public Student(String ten, double diem, String nganh) {
        this.ten = ten;
        this.diem = diem;
        this.nganh = nganh;
    }
    
    // 3. setter + getter

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    
}
