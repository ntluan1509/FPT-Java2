/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_cau1;

import java.util.*;
/**
 *
 * @author admin
 */
public class lab3_cau1_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Khai báo danh sách
        List<String> ds = new ArrayList<>();
        
        //2. thêm vào ds
        ds.add("Ngọc Trinh");
        ds.add("Tóc Tiên");
        ds.add("Hồ Ngọc Hà");
        
        //3. xuất ds ra
        for(int i=0;i<ds.size();i++)
        {
            System.out.println("- " + ds.get(i));
        }
    }
    
}
