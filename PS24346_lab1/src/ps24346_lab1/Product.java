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
public class Product {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getImportTax() {
        return price * 0.1;
    }
    
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        setName(input.nextLine());
        System.out.print("Nhập giá:");
        setPrice(input.nextDouble());
    }
    
    public void xuat() {
        System.out.println("Tên sản phẩm: " + getName() +" _ "+ "Giá: " + getPrice()+" _ "+"Thuế: "+getImportTax());
        System.out.println("______________");
    }
}
