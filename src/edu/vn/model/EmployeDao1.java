/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.model;

import edu.vn.inf.infEmployee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhtu
 */
public class EmployeDao1 implements infEmployee{
    public static List<Employee> ls = new ArrayList<>();
    int positon = -1;
    @Override
    public int save(Employee e) {
        positon = findByID(e.getId());
        if (positon < 0) {
            ls.add(e);
        }else{
            ls.set(positon, e);
        }
        return 1;
    }

    @Override
    public int del(String id) {
        positon = findByID(id);
        if (positon >= 0) {
            ls.remove(positon);
        }
        return positon;
    }

    @Override
    public int findByID(String id) {
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getId().equalsIgnoreCase(id)) {
                positon = i;
                break;
            }
        }
        return positon;
    }

    @Override
    public Employee getEmployeeByPossition(int index) {
        if (index<=ls.size() && index >=0) {
            return ls.get(index);
        }
        return null;
    }

    @Override
    public List<Employee> openFile() {
        ls.add(new Employee("PD05629", "A Hà Anh Tú", 19, "Tuahapd05629@fpt.edu.vn", 1000000000));
        return ls;
    }

    @Override
    public void saveFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Employee> getAll() {
        return ls;
    }

    @Override
    public int count() {
        return ls.size();
    }
    
}
