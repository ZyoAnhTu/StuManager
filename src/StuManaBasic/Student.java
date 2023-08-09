/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaoVeMonJava2;

/**
 *
 * @author anhtu
 */
public class Student {
    private String id;
    private String name;
    private double point;
    private String brach;
    private String study;
    private boolean bonus;
    public Student() {
    }

    public Student(String name, double point, String brach, String study , boolean bonus) {
        this.name = name;
        this.point = point;
        this.brach = brach;
        this.study = study;
        this.bonus = bonus;
    }

    public Student(String id) {
        this.id = id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getBrach() {
        return brach;
    }

    public void setBrach(String brach) {
        this.brach = brach;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }
    
     public String getGrade(){
         if (point < 5 ) {
             return "Yeu";
         }
         if (point <6.5) {
             return "Trung Binh";
         }
         if (point < 8) {
             return "Kha";
         }
         return "Gioi";
    }
     public boolean isRole(){
         
             return point >= 8;
        
     }
     
}
