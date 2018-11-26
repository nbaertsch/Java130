/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sandbox;

/**
 *Super class to specific info bundles
 * 
 * @author noah
 */
public abstract class PublicInfoBundle {
    String assignedcaseOfficer;
    String dateOfOrigin;
    String municipality;
    
    public abstract void attachCaseMethod(String msg); 
    
}   //close class
