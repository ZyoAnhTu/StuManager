/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.vn.clock;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author anhtu
 */
public class ClockThred extends Thread{
    private JLabel lb1;

    public ClockThred(JLabel lb1) {
        this.lb1 = lb1;
    }
    
    public  void run()  {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {            
            Date now = new Date();
            String st = sdf.format(now);
            lb1.setText(st);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
