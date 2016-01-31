/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoiB;
import accessoop.ClassA1; //khai bao ClassA1 de truy cap ClassA1, vi ClassB1 khong cung goi accessoop voi ClassA1

/**
 *
 * @author TrungNT
 */
public class ClassB1 {
    public void methodB1(){
        System.out.println("+ ClassB1 truy cap ClassA1:");
        ClassA1 oClassA1 = new ClassA1();
        oClassA1.methodA1();
        System.out.println("Gia tri cua thuoc tinh ClassA1 la: " + oClassA1.VarA1);
        System.out.println("===========================");
    }
}
