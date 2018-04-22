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
public class CarManufacturer {
    public static void main (String [] args)
    {
    String mycar = "Ford";
    String car1 = "ACURA";
    String car2 = "CHRYSLER";
    String car3 = "GM";
    String car4 = "HONDA";
    String car5 = "HUNDAI";
    String car6 = "CHEVROLET";
    String car7 = "BUICK";
    String car8 = "CADILLAC";
    String car9 = "BMW";
    String car10 = "TOYOTA";
    String car11= "NISSAN";
    String car12= "Ford";
    System.out.println("mycar is not an Acura? " + !(mycar==car1));
    System.out.println("mycar is not a Chrysler? " + !(mycar==car2));
    System.out.println("mycar is not a GM? " + !(mycar==car3));
    System.out.println("mycar is not a Honda? " + !(mycar==car4));
    System.out.println("mycar is not a Hundai? " + !(mycar==car5));
    System.out.println("mycar is not a Chevrolet? " + !(mycar==car6));
    System.out.println("mycar is not a Cadillac? " + !(mycar==car7));
    System.out.println("mycar is not a Buick? " + !(mycar==car8));
    System.out.println("mycar is not a Bmw? " + !(mycar==car9));
    System.out.println("mycar is not a Toyoda? " + !(mycar==car10));
    System.out.println("mycar is not a Nissan? " + !(mycar==car11));
    System.out.println("mycar is not a Ford? "+ !(mycar==car12));
    
    }
}