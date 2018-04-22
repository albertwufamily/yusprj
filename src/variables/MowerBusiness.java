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
public class MowerBusiness {
    public static void main (String [] agrs)
    {
        double made = 257.35;
        double gasoline = 25.82;
        double repair = 32.51;
        double sneakers = 17.41;
        System.out.println("mower buisness first month report");
        System.out.println("I made $" + made + "  mowing lawns");
        System.out.println("I spent $" + gasoline + " on gasoline");
        System.out.println("I spent $" + gasoline + " on gasoline");
        System.out.println("I spent $" + repair + " to repair my mower");
        System.out.println("I spent $" + sneakers + " on sneakers");
        System.out.println( "my final net incom is " + (made - gasoline - repair - sneakers));
    }       
}
   /*         
    You start a summer lawn mowing business to pay for Java lessons. In your first month, you
have earned $257.35. You spent $25.82 on gasoline. You spent $32.51 to repair your
mower. You also spent $17.41 on new sneakers. Write a class named MowerBusiness
whose main method has variables for the earnings and expenses above. Use them in a
report that documents your first month in business.


    */