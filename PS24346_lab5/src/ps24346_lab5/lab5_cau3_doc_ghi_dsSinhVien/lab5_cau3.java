/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps24346_lab5.lab5_cau3_doc_ghi_dsSinhVien;

import java.util.*;
import java.io.*;
/**
 *
 * @author Luan
 */
public class lab5_cau3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Khai báo danh sách nhan vien 
        ArrayList<Student> list = new ArrayList<>();
        
        // them sinh vien
        list.add(new Student("NGỌC TRINH", 9, "cntt"));
        list.add(new Student("TOC TIEN", 10, "web"));
        
        //lưu dánh sách xuống file
        XFile.writeObject("d//student.dat",list);
        // đọc từ file d//student.dat sang danh sách kết quả
        List<Student> kq = (ArrayList<Student>)XFile.readObject("d//student.dat");
         //xuất danh sách list  ra màn hình
         for(Student s: kq) {
             System.out.print("Name: " + s.name);
             System.out.print("Marks: " + s.marks);
             System.out.print("Major: " + s.major);
             
         }
        
    }
    
}
