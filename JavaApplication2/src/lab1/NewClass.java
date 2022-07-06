
package lab1;

import java.util.Scanner;

class product {
    String name;
    double price;

    public product() {
    }

    public product(String name, double price) {
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
    
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập tên : ");
        this.name = s.nextLine();
        System.out.print("Nhập giá :");
        this.price = s.nextDouble();
    }
    public void xuat() {
        System.out.print(name);
        System.out.print(price);
    }
}

public class NewClass {
   
    public static void main(String[] args) {
          product a = new product();
          a.nhap();
          
    }
}
