/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Luke
 */

/*
Go through the remaining classes in your program and identify 
other instances where inheritance would be beneficial. Ask yourself the following question.
Are any of the class variables of functions functionally duplicated in any other class?
Is there a group of classes that are all of the same type?
If the answer to this question is yes, then create a super-class 
for the duplicate class variables and functions. Remove the duplicate 
code from each of the sub-classes. Implement polymorphism for any functions 
that will have the same function signature but different implementations in the 
sub-classes. Make all class variables that have a fixed value final and static.
Step 2:  Submit your program on your GitHub repository. Then click the Open button 
below and, in the Notes field, specify (1) the name of your repository with the URL and (2) the name of the file.

Note: If you have any questions you can ask them in this week’s Developer Forum. 
You could also email your instructor or set up a Google hangout with him/her.
*/
public class animal extends Prime{
    
  
     animal(){}
   
   boolean alive = true;
   
    
   protected boolean coldBlooded=true;
   private boolean vertibray=true;
   private boolean exosekeleton=true; 
   private boolean eightlegs=true; 
   private final boolean posionous=true; 
   private final boolean producesWeb=true; 
   
  

   
    public boolean isColdBlooded() {
        return coldBlooded;
    }

    public boolean isVertibray() {
        return vertibray;
    }

    public boolean isExosekeleton() {
        return exosekeleton;
    }

    public boolean isEightlegs() {
        return eightlegs;
    }

    public boolean isPosionous() {
        return posionous;
    }

    public boolean isProducesWeb() {
        return producesWeb;
    }
    
    //@Override 
    //public string get input(){}
    
    //need a defalt constructer
    

     //animal bob = new animal();
     // bob.setName("bob");
    
  

  
}