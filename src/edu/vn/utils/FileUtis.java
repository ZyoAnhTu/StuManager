/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.utils;

import edu.vn.model.Employee;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhtu
 */
public class FileUtis {
    public static final String FILE_NAME = "employe.dat";
    public static void writeFile(List<Employee> ls) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        oss.writeObject(ls);
        oss.close();
    }
    public static List<Employee> readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Employee> ls = new ArrayList<>() ;
        ls = (ArrayList<Employee>) ois .readObject();
        return ls;
        
    }
}
