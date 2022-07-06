
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luan
 */
public class lab4_cau1_tryCatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        try {
            System.out.print("Nhập 1 số : ");
            int a = s.nextInt();
            System.err.println("Bạn nhập dữ liệu đúng");
        } catch (Exception e) {
            System.out.print("Bạn nhập dữ liệu không đúng");
            System.err.println("Bạn cần nhập một số nguyên");
        }
    }
    
}
