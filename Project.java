
package com.mycompany.project;


public class Project {

    public static void main(String[] args) {
    Array Student=new Array(10);
    Student.insert("ali", 11, 80);
    Student.insert("nedo", 23, 68);
    Student.insert("abra", 17, 67);
    Student.insert("amr",34,78);
   Student.insert("aid",12,90);
   Student.display();
        System.out.println(Student.getnumofstudents());
        Student.delete(11);
        System.out.println("");
        Student.display();
        System.out.println(Student.getnumofstudents());
    }
    
}
