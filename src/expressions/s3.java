/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/**
 *
 * @author lili
 Declare a variable of type byte, and initialize it to the value 5. Declare a second variable of
type byte, and initialize it to the expression 20/4. Declare a third variable of type byte, and
initialize it to the value 6. Using println statements and boolean expressions, compare each
variable with each of the other variables, and display if it is greater than, less than, or equal.
 */
public class s3 {
    public static void main (String [] args)
    {
            byte var1;
            var1 = 5;
            byte var2;
            var2 = 20/4;
            byte var3;
            var3 = 6;
            System.out.println (var1>var2);
            System.out.println (var1>var3);
            System.out.println (var2>var1);
            System.out.println (var2>var3);
            System.out.println (var3>var1);
            System.out.println (var3>var2);
    }       
}