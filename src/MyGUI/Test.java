/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyGUI;

import javax.swing.SwingUtilities;

/**
 *Test the Window class
 * @author Noah Baertsch
 */
public class Test {
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            createAndShowWindow(); 
            }
        });

    }
    
    private static void createAndShowWindow(){
        Window win = new Window();
        //win.;
    }
    
}
