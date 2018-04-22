/*3)- Create a class named Comparisons whose main method does the following:
- Compare one byte variable with another, and prints “The first number is greater.” if the
first variable is greater than the second.
- Compares one float variable with another. Prints “The first number is greater.” if the first
variable is greater than the second. Prints “The second number is greater.” if the second
variable is greater than the first. Prints “Both numbers are equal.” if they are both equal.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_statments;

/**
 *
 * @author lili
 */
public class s3 {
    public static void main (String [] args)
    {
    byte a = 15, b = 14;
    if (a>b)
    System.out.println("a is greater than b");
        float c = 15f, d = 14f;
        if (c>d)
    System.out.println("c is greater than d");
        if (d>c)
    System.out.println("d is greater than c");
        if (c==d)
    System.out.println("c is equal to d");
    }
}
