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
public class lab5_cau1_docfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("d://lab5_cau1_docfile.java");
        // khai báo biến
        int c;
        // trong khi chưa đọc đến cuối file 
        while((c = f.read())!= -1) {
            // ép qua kiểu char và xuất ra kí tự
            System.out.print((char) c);
        }
        //đọc file và đóng lại 
        f.close();
        
    }
    
}
