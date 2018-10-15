/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;


/**
 *
 * @author NOah
 */
public class Window extends JFrame {
    
    private JPanel panel;
    
    private ActionListener listener;
   
    public Window(){
        super();
        this.panel = new JPanel();
        this.listener = new Listener();
    }
    
    /**
     * private ActionListener implementation
     */
    private class Listener implements ActionListener(){
        
        JButton b1, b2, b3;
        
        @Override
        public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equalsIgnoreCase("blue")){
                    //do blue stuff
                    
                }else if(e.getActionCommand().equalsIgnoreCase("red")){
                    //do red stuff
                    
                }else if(e.getActionCommand().equalsIgnoreCase("green")){
                    //do green stuff
                    
                }else {
                    throw new UnsupportedOperationException("Not supported yet.");
                }
        
        }
        
    }
    
    /**
     * Initializes the window's layout
     */
    public void init(){
        //initialize the panel before adding it        
        this.panel.setLayout(new GridBagLayout());
        this.panel.setVisible(true);
        this.add( this.panel);
        
        //build listener
        this.listener = new Listener();
        
        //build blue button
        JButton b1 = new JButton();
        this.listener.b1.setName("Blue");
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("blue");
        b1.addActionListener(this.listener);
        
        //build red button
        JButton b2 = new JButton("Red");
        b2.setMnemonic(KeyEvent.VK_R);
        b2.setActionCommand("red");
        b2.addActionListener(this.listener);
        
        //build green button
        JButton b3 = new JButton("Green");
        b3.setMnemonic(KeyEvent.VK_G);
        b3.setActionCommand("Green");
        b2.addActionListener(this.listener);
        
        //build clear  button
        
        //add  buttons to panel
        this.panel.add(b1);
        this,panel.add(b2);
        this.panel.add(b3);
    }
    
}
