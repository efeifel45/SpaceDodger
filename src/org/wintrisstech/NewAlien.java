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
public class NewAlien extends Alien {

    private int t = 0;

    public NewAlien() {

        color = Color.YELLOW;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);


    }

    public void update(Ship ship) {
        t++;
        if (t > 300) {
            visible = false;

        }
            x = x - 2;
            if(x < 0)
            {
                x = 2000;
            }  
        
    }
}
