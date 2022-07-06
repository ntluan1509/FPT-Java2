/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

// tạo lớp trừu tượng
//- có ít nhất một phương thức trừu tượng 
//- phương thức trừu tượng là một phương thức có tên không viết code
abstract class animal {
    abstract public void saySomething();
}
// tạo lớp con 
class dogs extends animal {
    public void saySomething() {
        System.out.print("wow wow wow");
    }
}
class cats extends animal {
    public void saySomething() {
        System.out.print("meow meow");
    }
}

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tạo một đối tượng 
//        dogs a = new dogs();
//        a.saySomething();
//        System.out.print("\n");
//        cats b = new cats();
//        b.saySomething();

          // khai báo mảng convat
          animal[] sothu = new animal[2];
          sothu[0] = new dogs();
          sothu[1] = new cats();
          
          // duyệt mảng
          for(int i=0 ; i<sothu.length ; i++) {
              sothu[i].saySomething();
              System.out.print("\n");
          }
    }
    
}