/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGUI;

//imports
import javax.swing.*;

/**
 *
 * @author noah.baertsch
 */
public class MyFrame extends JFrame{
    
    public MyFrame(){
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(new MyPanel());
    }
    
}
