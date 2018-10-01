/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java130;

import java.util.*;

/**
 *This class is for my own practice of implementing iterators, as well as Hash Maps
 * It is runnable via a main method
 * 
 * @author noah.baertsch
 */
public class IteratorPractice {
    
    public static void main(String args[]){
        
    }
    
    public List<String> printMap(Map<String, String> map){
        
        Iterator<String> iter = map.values().iterator();
        List<String> list = new ArrayList();
        
        while(iter.hasNext()){
            list.add(iter.next());
        }
        
        return new List<String>();
    }
    
}
