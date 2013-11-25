/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Luke
 */
public class aracknid extends insect{
    boolean eightlegs= true; 
    boolean posionous = true; 
    boolean producesWeb= true; 

    
    

    
public aracknid(boolean coldBlooded, boolean vertibray, boolean exosekeleton, boolean eightlegs, boolean posionous, boolean producesWeb){   
      super ();
     //    animal bob = new animal();
        
        
         System.out.print("...");
    }
//@override 
    public void output(){
    System.out.println("he is cold blooded" + coldBlooded);
    System.out.println("he is vertibray"+ vertibray);
    System.out.println("he has an exosekeleton"+ exosekeleton);
    System.out.println("he has eight legs"+ eightlegs);
    System.out.println("he is posionus"+ posionous);
    System.out.println("he produces webs"+ producesWeb);
    
    System.out.println("What is bob? Bob is a Spider!");
   
}

}
    


