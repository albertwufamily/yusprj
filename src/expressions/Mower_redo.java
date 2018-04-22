/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/**
 *
 * @author lili
 */
public class Mower_redo {
    public static void main (String [] agrs)
    {
        double made = 257.35;
        double gasoline = 25.82;
        double repair = 32.51;
        double sneakers = 17.41;
        double gross = made - gasoline - repair - sneakers;
        double gross_tax = gross*0.25; //tax rate is 0.25
        double mateirials = gasoline;
        double additional_ex = sneakers + repair ;
        double net_income=gross-gross_tax;
        System.out.println("mower buisness first month report");
        System.out.println("I made $" + made + " mowing lawns");
        System.out.println("I spent $" + gasoline + " on gasoline");
        System.out.println("I spent $" + gasoline + " on gasoline");
        System.out.println("I spent $" + repair + " to repair my mower");
        System.out.println("I spent $" + sneakers + " on sneakers");
        System.out.println("I spent $" + gasoline + " on matierial");
        System.out.println("I spent $" +  additional_ex + " on aditional expenses");
        System.out.println( "my gross incom is " + gross);
        System.out.println( "my gross income tax is " + gross_tax);
        System.out.println( "my final net incom is " + net_income);
    } 
}