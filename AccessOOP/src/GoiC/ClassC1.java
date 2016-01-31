/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoiC;
import accessoop.ClassA0; //khai bao ClassA0 trong package accessoop de truy cap  ClassA0

/**
 *
 * @author TrungNT
 */
public class ClassC1 extends ClassA0{
    public void methodC1(){
       System.out.println("==================================");
       System.out.println("+ ClassC1 truy cap ClassA0. Trong do, ClassA0 dang de che do Protected");
       methodA0(); //ke thua ClassA0 nen ta tai su dung methodA0
       System.out.println("=> Hien thi gia tri trong thuoc tinh VarA0 cua ClassA0: " + VarA0);
       System.out.println("==================================");
    }
}
