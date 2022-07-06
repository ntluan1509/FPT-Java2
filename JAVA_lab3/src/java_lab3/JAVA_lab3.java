/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab3;

import java.util.*;
public class JAVA_lab3 {

    public static void main(String[] args) {
        // TODO code application logic here
        //khai báo danh sách
        List<String> ds = new ArrayList<>();
        
        // 2. thêm vào danh sách
        ds.add("Trinh");
        ds.add("Tiên");
        ds.add("Hồ Ngọc Hà");
        
        // xuất ds ra
        for(int i=0; i< ds.size();i++) {
            System.out.print("-"+ds.get(i));
        }
    }
    
}
