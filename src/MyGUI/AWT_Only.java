/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGUI;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author noah.baertsch
 */
public class AWT_Only {
    
    private static Frame frame;
    private static Panel panel1, panel2, panel3;
    private static Button b1, b2, b3;
    private static Label l1, l2, l3, l4;
    private static GridBagLayout gblayout;
    private static Font font;
    private static Integer score1, score2;
    
    public static void main(String[] args){
        initComponents();
        buildFrame();
        addListeners();
        showFrame();
    }
    
    private static void initComponents(){
        ///Frame///
        frame = new Frame("Score Tracker");
        frame.setSize(1000, 1000);
        gblayout = new GridBagLayout();
        frame.setLayout(new GridLayout(3,3));
        //frame.setLayout(gblayout);
        ///Panel 1///
        panel1 = new Panel();
        panel1.setBackground(Color.BLUE);
        //panel1.setSize(250, 400);
        ///Panel 2///
        panel2 = new Panel();
        panel2.setBackground(Color.RED);
       // panel2.setSize(250, 400);
        ///Panel 3///
        panel3 = new Panel();
        panel3.setBackground(Color.lightGray);
       // panel3.setSize(500, 200);
        ///Button 1///
        b1 = new Button();
        b1.setName("Team 1");
        ///Button 2///
        b2 = new Button();
        b2.setName("Team 2");
        ///Button 3///
        b3 = new Button();
        b3.setName("Reset");
        ///Label 1///
        l1 = new Label();
        score1 = 0;
        l1.setName(score1.toString());
        ///Label 2///
        l2 = new Label();
        score2 = 0;
        l2.setName(score2.toString());
        ///Label 3///
        l3 = new Label();
        l3.setName("Winning");
    }
    
    private static void buildFrame(){
        ///Panel 1///
        //panel1.setLayout(new GridLayout(2,1));
        //panel1.add(b1);
        //panel1.add(l1);
        frame.add(panel1);
        ///Panel 2///
       // panel2.setLayout(new GridLayout(2,1));
        //panel2.add(b2);
        //panel2.add(l2);
        frame.add(panel2);
        //Panel 3///
        //panel3.setLayout(new GridLayout(1,2));
        //panel3.add(b3);
        //panel3.add(l3);
        frame.add(panel3);
    }
    
    private static void addListeners(){
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent winEvent){
                frame.dispose();
            }
        });
    }
    
    private static void showFrame(){
        frame.setVisible(true);
    }
    
}
