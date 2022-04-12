/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapter;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
    
    public static void main(String[] args) {
        
        AmericanPlug usaPlug = new American230vAppliancePlug();
        
        EuropeanPowerSocket eSocket= new EuropeanPowerSocket();
        EuropeanPlug ePlug= new AmericanToEuropeanPlugAdapter(usaPlug);
        
        eSocket.plugIn(ePlug);
    }
    
}
