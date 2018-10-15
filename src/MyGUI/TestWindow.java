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
import java130.Java130;
import javax.swing.*;


/**
 *
 * @author Noah
 */
public class TestWindow extends JFrame {
    
    private JPanel panel;
    
    private ActionListener listener;
    
    private JButton b1, b2, b3;
   
    public TestWindow(){
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
                if(e.getActionCommand().equalsIgnoreCase("testOne")){
                    TestWindow.this.panel.setBackground(Color.BLUE);
                    TestWindow.this.repaint();
                   Java130.main();
                    TestWindow.this.dispose();
                    
                }else if(e.getActionCommand().equalsIgnoreCase("testTwo")){
                    TestWindow.this.panel.setBackground(Color.RED);
                    TestWindow.this.repaint();
                    
                }else if(e.getActionCommand().equalsIgnoreCase("testThree")){
                    TestWindow.this.panel.setBackground(Color.GREEN);
                    TestWindow.this.repaint();
                    
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
        
        //build buttonOne
        b1 = new JButton("Test One");
        b1.setMnemonic(KeyEvent.VK_B);
        b1.setActionCommand("testOne");
        b1.addActionListener(this.listener);
        
        //build buttonTwo
        b2 = new JButton("Red");
        b2.setMnemonic(KeyEvent.VK_R);
        b2.setActionCommand("testTwo");
        b2.addActionListener(this.listener);
        
        //build buttonThree
        b3 = new JButton("Green");
        b3.setMnemonic(KeyEvent.VK_G);
        b3.setActionCommand("testThree");
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
