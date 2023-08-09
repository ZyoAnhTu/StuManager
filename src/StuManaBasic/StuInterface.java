/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BaoVeMonJava2;

import java.util.List;

/**
 *
 * @author anhtu
 */
public interface StuInterface {
    int add(Student st);
    int del(String id);
    int update(Student st);
    int findByID(String id);
    Student getIndex (int index);
    List<Student> getAll();
}
