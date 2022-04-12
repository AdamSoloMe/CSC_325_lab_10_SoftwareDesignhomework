/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.powersocketadapter;

/**
 *
 * @author soblab
 */
public class American110vAppliancePlug  implements AmericanPlug
{
    @Override
    public void givePower() {
        System.out.println("This is a 110 v design");
    }
    
}
