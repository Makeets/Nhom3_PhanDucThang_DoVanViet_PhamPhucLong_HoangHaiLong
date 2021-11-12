/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import Bai3.Student;
import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class TreeSetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<Student>();

        Student student1 = new Student("Cong", 17, "Hanoi");
        Student student2 = new Student("Dung", 16, "Haiphong");
        Student student3 = new Student("Ngon", 18, "Hanoi");
        Student student4 = new Student("Hanh", 19, "Danang");

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student1);
        for (Student student : treeSet) {
            System.out.println(student.toString());
        }
    }

}
