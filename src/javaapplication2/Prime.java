/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Luke
 */
public abstract class Prime {

    /**
     * @param args the command line arguments
     */


   private boolean alive;
   private boolean exist;
   private boolean coldBlooded;
   private boolean vertibray;
   private boolean exosekeleton=true; 
   private boolean eightlegs=true; 
   private boolean posionous=true; 
   private boolean producesWeb=true; 

public Prime(){}

    public Prime(boolean alive, boolean exist, boolean coldBlooded, boolean vertibray, boolean exosekeleton, boolean eightlegs, boolean posionous, boolean produceWeb) {
        this.alive = alive;
        this.exist = exist;
        this.coldBlooded = coldBlooded;
        this.vertibray = vertibray;
        this.eightlegs = eightlegs;
        this.exosekeleton= exosekeleton;
        this.posionous=posionous;
        this.producesWeb=producesWeb;
    }
        //@Override
    
    
}