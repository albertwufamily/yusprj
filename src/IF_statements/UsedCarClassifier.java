/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_statments;

/**
 *
 * @author lili
 */
public class UsedCarClassifier {
    public static void main (String [] args)
    {
     int mileage = 80000;
     boolean city =true;
     boolean rebuild = false;
        if (rebuild==true)
            if (mileage>120000)
                System.out.println ("creampuff");
            else System.out.println("average");
        else if (city == false)
            if (mileage>100000)
                System.out.println("beater");
            else if (mileage<20000)
                System.out.println("creampuff");
            else 
                System.out.println("average");
        else
            if (mileage>70000)
                System.out.println("beater");
            else if (mileage<10000)
                System.out.println("creampuff");
            else 
                System.out.println("average");
    }

}