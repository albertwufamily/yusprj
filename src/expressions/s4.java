/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/*
Declare a variable named I_like_Java and initialize it to true. Declare another variable
named homework_is_east and initialize it to false. Using println statements and boolean
expressions, display the following:
The logical AND of the two variables
The logical OR of the two variables
The NOT of the logical OR of the two variables
*
 *
 * @author lili
 */

public class s4 {
    public static void main(String [] args)
    {
         boolean I_Like_Java=true;
         boolean homework_is_east=false;
         System.out.println(I_Like_Java && homework_is_east);
         System.out.println(I_Like_Java || homework_is_east);
         System.out.println(!(I_Like_Java || homework_is_east));
    }       
}
