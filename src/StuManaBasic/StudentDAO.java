/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVeMonJava2;



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhtu
 */
public class StudentDAO implements StuInterface{
     public static List<Student> lsStu = new ArrayList<>();

    @Override
    public int add(Student st) {
        lsStu.add(st);
        return 1;
    }

    @Override
    public int del(String id) {
        int pos = findByID(id);
        if (pos < 0 ) {
            return -1;
        }else{
            lsStu.remove(pos);
        }
        return pos;
    }

    @Override
    public int update(Student st) {
         int pos = findByID(st.getId());
        if (pos < 0 ) {
            return -1;
        }else{
            lsStu.set(pos, st);
        }
        return pos;
    }

    @Override
    public int findByID(String id) {
        for (int i = 0; i < lsStu.size(); i++) {
            if (lsStu.get(i).getId().equalsIgnoreCase(id)) {
                return i;
            }
            return -1;
        }
       return -1;
    }

    @Override
    public Student getIndex(int index) {
        if (index >=0 && index <lsStu.size()) {
            return lsStu.get(index);
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
//        try {
//            lsStu.clear();
//            lsStu = FileUtis.outputFile();
//        } catch (Exception e) {
//            
//        }
        return lsStu;
    }
     
}
