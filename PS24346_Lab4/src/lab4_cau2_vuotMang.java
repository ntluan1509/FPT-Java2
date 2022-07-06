/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luan
 */
public class lab4_cau2_vuotMang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = {2,5,7,9};
        try {
            System.out.print("a[3] =" + a[3] +'\n');
            System.out.println("Hợp lệ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bạn truy xuất vượt mảng");
        }
                
  }
    
}
