/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab3;

import java.util.*;
/**
 *
 * @author Luan
 */
public class Lab3_hashmap{

    public static void main(String[] args) {
        HashMap< String,Sinh_vien> ds = new HashMap<>();
       // tạo ra đối tượng sinh viên 
       Sinh_vien a = new Sinh_vien();
       a.setName("Nguyễn");
       a.setPoint(9);
       a.setBusiness("UDPM");
       // tạo thêm một đối tượng sinh viên 
       Sinh_vien b = new Sinh_vien();
       b.setName("Thành");
       b.setPoint(8);
       b.setBusiness("TKDH");
       
       // them vào sanh sách
       
      ds.put("ps24346", a);
      ds.put("ps12345", b);
      
      // duyệt mảng và lấy ra các đối tượng sinh viên 
      
      Set<String> mang_mssv = ds.keySet(); // lấy ra mảng toàn mssv
      
      // dựa vào mảng mssv lấy ra các sinh viên 
      
      for(String i: mang_mssv) {
          Sinh_vien stu = (Sinh_vien)ds.get(i);// dựa theo mssv i lấy ra được sinh viên 
          
          System.out.println("mssv : "+ i);
          System.out.println("Tên : "+ stu.getName());
          System.out.println("điểm : "+ stu.getPoint());
          System.out.println("ngành : "+ stu.getBusiness());
      }
      
    }
    
}
