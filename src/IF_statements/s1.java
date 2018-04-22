/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Write an if statement that increments y if x is equal to y, increments z if y is greater than
x, and increments x if neither of these conditions are true.*/
package If_statments;

/**
 *
 * @author lili
 */
public class s1 {
    public static void main (String[] args)
    {
     int x = 5;
     int y = 7;
     int z = 12;
     if(x>y)
     x++;
        if (x==y)
     y++;
        else if (y>x)
            z++;
        else
            x++;
    }
}
