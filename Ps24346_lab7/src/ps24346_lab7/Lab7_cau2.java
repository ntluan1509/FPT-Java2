/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps24346_lab7;

/**
 *
 * @author Luan
 */
 
public class Lab7_cau2 {
   public enum Career {
        UDPM, TKTW, LTDĐ, TKĐH
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PolyStudent sv = new PolyStudent();
        sv.fullname ="Nguyễn Văn a";
        sv.career = Career.UDPM;
        sv.career = Career.valueOf("UDPM");
        sv.print(); 
    }
}
    

