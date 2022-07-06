/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps24346_lab8;

/**
 *
 * @author Luan
 */
public class lab8_cau4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product p1 = new Product("Iphone 9",1000.0);
        Product p2 = new Product("Samsung Start",3000.0);
        
        ProductDAO dao = new ProductDAO();
        dao.add(p1);
        dao.add(p2);
        dao.store("d://prod.dat");
        
        ProductDAO dao2 = new ProductDAO();
        dao2.load("d://dat");
        Product p = dao2.find("Iphon 9");
        System.out.println(">Name: " +p.name);
        System.out.println(">Price: "+ p.price);
    }
    
}
