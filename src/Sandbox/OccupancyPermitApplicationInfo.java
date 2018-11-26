/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sandbox;

/**
 *
 * @author noah
 */
public class OccupancyPermitApplicationInfo extends PublicInfoBundle{
    
    String occupancyType;

    @Override
    public void attachCaseMethod(String msg) {
        System.out.println("Sim attachCaseMethod:" + msg);
    }
    
}
