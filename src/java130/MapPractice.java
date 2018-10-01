/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java130;

import java.util.*;


/**
 *
 * @author noah.baertsch
 */
public class MapPractice {
    
    public static void main(){
        
        Map<String, String> expedMap = new HashMap<>();
    
        Scanner in = new Scanner(System.in);
    
        boolean done = false;
    
        expedMap.put("locked", "false");
    
        while(!done){
            
            if(expedMap.get("locked") != "true"){
                System.out.println("The map is unlocked");
                System.out.println("Options:");
                System.out.println("(C)reate a new pair");
                System.out.println("(P)rint a value");
                System.out.println("(L)ock the map\n");
                System.out.println("(D)one");
                switch(in.next().toLowerCase().charAt(0)){
                    case 'c' : createPair();    //TODO: implement this
                        break;
                    case 'p' : printValue();    //TODO: implement this
                        break;
                    case 'l' : expedMap.put("locked", "true");
                        System.out.println("Map is now locked\n");
                        break;
                    case 'd' : done = true;
                        break;
                }
            }   
        }
        //System.out.println("");
        
    }
    
}
