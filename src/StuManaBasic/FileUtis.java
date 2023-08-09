/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVeMonJava2;

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
    public static final String FILE_NAME = "Name.txt";
    public static void writeFile(List<Student> ls) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ls);
        oos.close();
    }
    public static List<Student> outputFile() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fis  = new FileInputStream(FILE_NAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Student> ls = new ArrayList<>();
        ls = (ArrayList<Student>) ois.readObject();
        return ls;
    }
}
