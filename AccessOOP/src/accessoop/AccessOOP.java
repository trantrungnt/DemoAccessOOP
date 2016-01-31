/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessoop; //ClassA1, ClassA2, ClassA3 cung thuoc package accessoop

//khai bao ClassB1 thuoc package B de ta co the su dung duoc classB1 trong package accessoop
import GoiB.ClassB1;

//khai bao ClassC1 thuoc package C de ta co the su dung duoc classC1 trong package accessoop
import GoiC.ClassC1;

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
       
       ClassA3 oClassA3 = new ClassA3(); //khoi tao doi tuong oClassA3
       oClassA3.Method3();
       
       ClassB1 oClassB1 = new ClassB1(); //khoi tao doi tuong oClassB1
       oClassB1.methodB1();
       
       ClassC1 oClassC1 = new ClassC1(); //khoi tao doi tuong oClassC1
       oClassC1.methodC1();
    }
    
}
