/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_cau1;

import java.util.*;

public class lab3_cau2_HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. khai báo 
        HashMap<String,Student> list = new HashMap<>();
        
        //2. tạo ra 1 đối tượng sinh viên
        Student a = new Student();
        //3. gán giá trị
        a.setTen("Ngọc Trinh");
        a.setDiem(8);
        a.setNganh("UDPM");
        
        //4. tạo ra 1 đối tượng sinh viên
        Student b = new Student();
        //5. gán giá trị
        b.setTen("Tóc Tiên");
        b.setDiem(10);
        b.setNganh("web");

        //6 thêm vào danh sách
        list.put("PS12345", a);
        list.put("PS23456", b);
        
        //7. lấy ra mảng mã số sinh viên
        Set<String> mang_masv = list.keySet(); // lấy ra mảng toàn masv
        
        //8. dựa vào mảng masv chúng ta lấy ra các sinh vien
        for(String i:mang_masv)
        {
            Student stu = (Student)list.get(i); // dựa theo masv i lấy ra đối tượng sinh viên
            //9. xuất ra thông tin sinh viên
            System.out.println("masv : " + i);
            System.out.println("tên : " + stu.getTen());
            System.out.println("điểm : " + stu.getDiem());
            System.out.println("ngành  : " + stu.getNganh());
        }
        
    }
    
}
