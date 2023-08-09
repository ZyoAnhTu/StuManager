/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.vn.inf;

import edu.vn.model.Employee;
import java.util.List;


/**
 *
 * @author anhtu
 */
public interface infEmployee {
    int save(Employee e);
    int del(String id);
    int findByID(String id);
    Employee getEmployeeByPossition(int index);
    List<Employee> openFile(); 
    void saveFile();
    List<Employee> getAll();
    int count();
}
