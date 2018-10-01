/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java130;

import java.util.*;


/**
 * This class is used to implement a hash map
 * @author noah.baertsch
 */
public class MapPractice {
    
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        
        Map<String, String> expedMap = new HashMap<>();
    
        Scanner in = new Scanner(System.in);
        
        String tmpK;  //temp String var for keys
        String tmpV;  //temp String var for values
    
        boolean done = false;
    
        expedMap.put("locked", "false");
    
        while(!done){
            
            if(expedMap.get("locked") != "true"){
                System.out.println("The map is unlocked");
                System.out.println("Options:");
                System.out.println("(C)reate a new pair");
                System.out.println("(P)rint a value");
                System.out.println("(L)ock the map");
                System.out.println("(D)one\n");
                switch(in.next().toLowerCase().charAt(0)){
                    case 'c' :
                        //Get pair from the console
                        System.out.print("\nEnter key: ");
                        tmpK = in.next();
                        System.out.print("\nEnter value: ");
                        tmpV = in.next();
                        
                        //add pair to map
                        expedMap.put(tmpK, tmpV);
                        System.out.println("Pair added.");
                        break;
                        
                    case 'p' : 
                        //get key to search
                        System.out.print("Enter Key: ");
                        tmpK = in.next();
                        tmpV = expedMap.get(tmpK);
                        System.out.println("That Key's value is: " + tmpV);  //print key's value
                        break;
                        
                    case 'l' : 
                        //lock the map
                        expedMap.put("locked", "true");
                        System.out.println("Map is now locked\n");
                        break;
                        
                    case 'd' : 
                        done = true;
                        break;
                }
                System.out.println("\n");
            }   
        }
        //System.out.println("");
        
    }
    
}
