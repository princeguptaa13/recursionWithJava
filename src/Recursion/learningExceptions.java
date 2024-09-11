package Recursion ;

import org.w3c.dom.ls.LSOutput;
class Student{
    int rno ;
    String name ;
    float marks ;


    Student(int rno , String name , float marks){
        this.rno = rno ;
        this.name = name ;
        this.marks = marks;
    }
}

public class learningExceptions{
    public static void main(String[] args) {
    Student prince = new Student(13 ,"Prince Gupta",99.5f);
    Student kunal = new Student(15 , "Kunal kushwaha", 87.12f);

        System.out.println(prince.name);
        System.out.println(kunal.marks);


       // prince.changeName("PRINCE THE CODER ");
       // System.out.println(prince.name);
    }
}