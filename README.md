# Demo Access OOP in Java
+ Công cụ để code: Netbeans version 8.1

##Khi các Class trong cùng 1 package
###Chế độ truy cập public: default sử dụng cho phương thức methodA2(), methodA3()  
+ ClassA2, ClassA3 truy cập được ClassA1
+ default nghĩa là không khai báo từ khóa public, private, protected trước thuộc tính hoặc phương thức

###Trường hợp các Class không cùng thuộc 1 package
+ ClassB1 không cùng package với ClassA1, muốn truy cập được ClassA1 thì ClassA1 để chế độ public hoặc protected. Khi đó, ClassB1 mới truy cập được ClassA1
+ Riêng trường hợp ClassA1 để chế độ protected, ClassB1 khác packgage với ClassA1 nên không truy cập được ClassA1. Để ClassB1 truy cập được ClassA1, ClassB1 kế thừa (extend) ClassA1 thì ClassB1 sẽ truy cập được.ClassA1
+ Trường hợp default, ClassB1 không truy cập được ClassA1 (bao gồm cả khi ClassB1 kế thừa ClassA1 vẫn không truy cập được ClassA1). Nếu ClassB1 cùng package với ClassA1 thì ClassB1 truy cập được ClassA1
+ Nếu ClassA1 để chế độ Private thì: dù ClassB1 cùng package ClassA1 hoặc khác package với ClassA1, khi đó ClassB1 không thể truy cập ClassA1
