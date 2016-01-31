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
public class ClassA2 {//classA1, classA2, classA3 cung thuoc package accessoop
    void methodA2(){ //default: classA2, classA3 ke thua classA1 van truy cap duoc classA1
        ClassA1 oClassA1 = new ClassA1();
        oClassA1.methodA1();
        System.out.println("HIen thi gia tri co trong thuoc tinh cua ClassA1: " + oClassA1.VarA1);
    }
}
