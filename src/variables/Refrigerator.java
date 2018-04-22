/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author lili
 */
public class Refrigerator {

    public static void main(String[] args) {
        int quantity;
        String containerType;
        String nameOfItem;
        
        int quantity1 = 2;
        String containerType1 = "package";
        String nameOfItem1 = "balogna";
        
        System.out.println("My refrigerator has "+quantity1+" "+containerType1+" of " + nameOfItem1);
        
        int quantity2 = 2;
        String containerType2 = "carton";
        String nameOfItem2= "eggs";
        
        System.out.println("My refrigerator has "+quantity2+" "+containerType2+" of " + nameOfItem2);
        
        System.out.println ("my father helped with the following stuff/arrays");
        //a less painful way of doing it, using array
        //my father helped me with this fancy stuff
        int[] quantities = new int[5];
        String[] containerTypes = new String[5];
        String[] namesOfItems = new String[5];
        
        /*Two packages of bologna
One carton of eggs
One gallon of milk
Three liters of soda
Two plates of pasta*/
        
        quantities[0] = 2;
        containerTypes[0] = "packages";
        namesOfItems[0] = "balogna";
        
        quantities[1] = 1;
        containerTypes[1] = "carton";
        namesOfItems[1] = "eggs";
        
        quantities[2] = 1;
        containerTypes[2] = "gallon";
        namesOfItems[2] = "milk";
        
        quantities[3] = 3;
        containerTypes[3] = "liters";
        namesOfItems[3] = "soda";
        
        quantities[4] = 2;
        containerTypes[4] = "plates";
        namesOfItems[4] = "pasta";
      
        for(int n=0;n<5;n++) {
           System.out.println("My refrigerator has "+ quantities[n] + " "+containerTypes[n] + " of " + namesOfItems[n]);
        }
   
    } 

}
