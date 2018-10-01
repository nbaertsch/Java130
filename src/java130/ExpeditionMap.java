/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java130;

import java.util.*;

/**
 * Custom object to store a map
 * 
 * @author noah.baertsch
 */
public class ExpeditionMap {
    
    private Map<String, String> map = new HashMap();
    
    public ExpeditionMap(){
        map.put("Dog","Cat");
        map.put("Red", "Blue");
        map.put("One", "Two");
        map.put("Hot", "Dog");
        map.put("What", "The Heck");
        map.put("Key", "Value");
        map.put("Tick", "Tock");
        map.put("Kesha", "Sucks");
        map.put("String", "String");
        map.put("Ideas", "I'm Out");
        map.put("Last", "This");
    }
    
    public Map get(){
        return this.map;
    }
    
    protected void set(Map<String, String> map){
        //I'm not implementing this just use the constructor values
    }
    
}