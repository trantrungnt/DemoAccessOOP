/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessoop;

/**
 *
 * @author TrungNT
 */
public class ClassA3 extends ClassA1{ //ClassA3 ke thua ClassA1
    void Method3(){ //tai ClassA3: truy cap vao ClassA1 de goi phuong thuc method1 
        ClassA1 oClassA1 = new ClassA1();
        oClassA1.methodA1();
        System.out.println("Day la ClassA3");
    }
}
