/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/*If the rightmost operand of the remainder operator is 2, the operation can be used to
determine if a number is odd. Write a class called Odder , whose main method determines if
the numbers 4 ,13, 80, 41, 6, and 25 are odd. For each variable, the program should display
a string containing the variable name followed by “ is odd? ” followed by true or false.
*
 *
 * @author lili
 */
public class odder {
     public static void main (String [] args)
     {
         int number1 = 4;
         int number2 = 13;
         int number3 = 80;
         int number4 = 41;
         int number5 = 6;
         int number6 = 25;
         System.out.println(" number1 is odd? " + (number1%2 > 0));
         System.out.println(" number2 is odd? " + (number2%2 > 0));
         System.out.println(" number3 is odd? " + (number3%2 > 0));
         System.out.println(" number4 is odd? " + (number4%2 > 0));
         System.out.println(" number5 is odd? " + (number5%2 > 0));
         System.out.println(" number6 is odd? " + (number6%2 > 0));
     }
}
