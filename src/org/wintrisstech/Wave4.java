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
        public class Wave4 extends Alien{
    
    private int t = 0;

    public Wave4() {

        color = Color.BLUE;
        x = r.nextInt(SpaceDodger.windowWidth);
        y = r.nextInt(SpaceDodger.windowHeight);


    }

    public void update(Ship ship) {
        t++;
        if (t > 1000) {
            visible = false;

        }
            x = x + 6;
            if(x > 1280)
            {
                x = 0;
            }  
            
            y = y - 6;
            if(y < 0){
                y = 720;
            }
    }
}
