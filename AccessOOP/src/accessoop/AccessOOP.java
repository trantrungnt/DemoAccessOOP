/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessoop; //ClassA1, ClassA2, ClassA3 cung thuoc package accessoop

/**
 *
 * @author TrungNT
 */
public class AccessOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassA1 oClassA1 = new ClassA1(); //khoi tao doi tuong oClassA1
        oClassA1.methodA1(); //goi phuong thuc cua doi tuong oClassA1
        
       ClassA2 oClassA2 = new ClassA2(); //khoi tao doi tuong oClassA2
       oClassA2.methodA2(); //goi phuong thuc cua doi tuong oClassA2
    }
    
}
