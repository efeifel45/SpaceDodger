package org.wintrisstech;

import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author workshopjan23
 */
    public class Alien3 extends Alien {
    
        
    private int t = 0;

    public Alien3() {

        color = Color.ORANGE;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);


    }

    public void update(Ship ship) {
        t++;
        if (t > 400) {
            visible = false;

        }
            y = y - 4;
            if(y < 0)
            {
                y = 720;
            }  
        
    }
        
    
}
