/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wintrisstech;

import java.awt.Color;

/**
 *
 * @author workshopjan23
 */
public class Wave5 extends Alien{
    
    private int t = 0;

    public Wave5() {

        color = Color.DARK_GRAY;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);


    }

    public void update(Ship ship) {
        t++;
        if (t > 400) {
            visible = false;

        } 
        x = x - 8;
        if(x < 0){
            x = 2000;
        }
        y = y - 5;
        if(y<0){
            y = 720;
        }
    
}
}
