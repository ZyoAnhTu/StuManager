/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.model;

import edu.vn.inf.infEmployee;
import edu.vn.utils.FileUtis;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anhtu
 */
public class EmployeDAO implements infEmployee {

    public static List<Employee> ls = new ArrayList<>();

    @Override
    public int save(Employee e) {
        int possition = findByID(e.getId());
        if (possition < 0) {
            ls.add(e);

        } else {
            ls.set(possition, e);
        }
        return 1;
    }

    @Override
    public int del(String id) {
        int pos = findByID(id);
        if (pos >= 0) {
            ls.remove(pos);
        }
        return pos;
    }

    @Override
    public int findByID(String id) {
        int possiton = -1;
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getId().equalsIgnoreCase(id)) {
                possiton = i;
                break;
            }
        }
        return possiton;
    }

    @Override
    public Employee getEmployeeByPossition(int index) {
        if (index >= 0 && index < ls.size()) {
            return ls.get(index);
        }
        return null;
    }

    @Override
    public List<Employee> openFile() {

//        ls.add(new Employee("PD05625", "A1", 18, "Tuahapd05629@fpt.edu.vn", 100000));
//        ls.add(new Employee("PD05622", "A2", 18, "Tuahapd05629@fpt.edu.vn", 100000));
//        ls.add(new Employee("PD05621", "A3", 18, "Tuahapd05629@fpt.edu.vn", 100000));
//        ls.add(new Employee("PD05624", "A4", 18, "Tuahapd05629@fpt.edu.vn", 100000));
//        ls.add(new Employee("PD05658", "A5", 18, "Tuahapd05629@fpt.edu.vn", 100000));
//        ls.add(new Employee("PD05679", "A6", 18, "Tuahapd05629@fpt.edu.vn", 100000));
//        ls.add(new Employee("PD05612", "A7", 18, "Tuahapd05629@fpt.edu.vn", 100000));
//        ls.add(new Employee("PD05648", "A8", 18, "Tuahapd05629@fpt.edu.vn", 100000));
//        ls.add(new Employee("PD05629", "A9", 18, "Tuahapd05629@fpt.edu.vn", 100000));
        try {
            ls.clear();
            ls = FileUtis.readFile();
        } catch (Exception e) {
            System.out.println("ERROR" + e.toString());
        }

        return ls;
    }

    @Override
    public void saveFile() {
        try {
            FileUtis.writeFile(ls);

        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
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
