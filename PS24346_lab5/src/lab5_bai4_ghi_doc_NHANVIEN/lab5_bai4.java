/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_bai4_ghi_doc_NHANVIEN;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class lab5_bai4 {
 // hàm lưu danh sách nhan viên list xuong file
    public void saveFile() {
        // lưu danh sách list xuống file d://nhanvien.dat
        XFile.writeObject("d://Nhanvien.dat",list);
        JOptionPane.showMessageDialog(this, "Lưu file thành công");
    }
    public void openFile() {
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
