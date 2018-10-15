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
    
    private JButton b1, b2, b3;
   
    public Window(){
        super();
        this.panel = new JPanel();
        this.listener = new Listener();
    }
    
    /**
     * private ActionListener implementation
     */
    private class Listener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equalsIgnoreCase("blue")){
                    Window.this.panel.setBackground(Color.BLUE);
                    Window.this.repaint();
                    
                }else if(e.getActionCommand().equalsIgnoreCase("red")){
                    Window.this.panel.setBackground(Color.RED);
                    Window.this.repaint();
                    
                }else if(e.getActionCommand().equalsIgnoreCase("green")){
                    Window.this.panel.setBackground(Color.GREEN);
                    Window.this.repaint();
                    
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
        b1 = new JButton("Blue");
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("blue");
        b1.addActionListener(this.listener);
        
        //build red button
        b2 = new JButton("Red");
        b2.setMnemonic(KeyEvent.VK_R);
        b2.setActionCommand("red");
        b2.addActionListener(this.listener);
        
        //build green button
        b3 = new JButton("Green");
        b3.setMnemonic(KeyEvent.VK_G);
        b3.setActionCommand("Green");
        b3.addActionListener(this.listener);
        
        //build clear  button
        //maybe..?
        
        //add  buttons to panel
        this.panel.add(b1);
        this.panel.add(b2);
        this.panel.add(b3);
        
        //Frame stuff
        this.setVisible(true);
        this.panel.repaint();
        this.setSize(400,300);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
