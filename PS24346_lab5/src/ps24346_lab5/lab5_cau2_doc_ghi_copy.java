/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps24346_lab5;

import java.io.*;
/**
 *
 * @author Luan
 */
            
public class lab5_cau2_doc_ghi_copy {

    public static void main(String[] args) {
        //1. đọc hình từ file
        byte[] data = XFile.read("d://ngoctrinh.jpg");
        //2 lưu mảng bute data xuống tên file khác
        XFile.write("d://ngoctrinh2.jpg",data);
        System.out.print("Lưu thành công");
        
    
        
    }
    
}
