/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGUI;

import javax.swing.*;
import javax.swing.SwingUtilities;


/**
 *
 * @author NOah
 */
public class Window extends JFrame {
    
    private JPanel panel;
   
    public Window(){
        super();
        this.panel = new JPanel();
    }
    
    public void init(){
        //initialize the panel before adding it        
        //this.panel
        this.add( this.panel);
        
    }
    
}
