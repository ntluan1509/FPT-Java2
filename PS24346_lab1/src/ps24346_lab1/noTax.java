/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps24346_lab1;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class noTax extends Product{
    @Override
    public double getImportTax() {
      return 0;
}
    public void nhap2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        setName(input.nextLine());
        System.out.print("Nhập giá:");
        setPrice(input.nextDouble());
    }
    
}
