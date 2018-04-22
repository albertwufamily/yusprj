/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

/**
 *
 * @author lili
 */
public class baby_names {
    public static void main (String[] args)
    {
/*
Pick three friends and help them name their daughters by creating a variable for each and
assigning one of the girl name constants to it. Pick three other friends and help them
name their sons by doing the same with the boy name constants.*/
        final String daughter1= "khloe"; final String friend1 = "andy";     
        final String daughter2= "Mary"; final String friend2 = "bob";
        final String daughter3= "Marissa"; final String friend3 = "sean";
        final String son1 = "Robert"; final String friend4 = "daniel";
        final String son2 = "Michel"; final String friend5 = "charlie";
        final String son3 = "Zach"; final String friend6 = "ollie";
        System.out.println(friend1+" your child could be called "+ daughter1);
        System.out.println(friend2+" your child could be called "+ daughter2);
        System.out.println(friend3+" your child could be called "+ daughter3);
        System.out.println(friend4+" your child could be called "+ son1);
        System.out.println(friend5+" your child could be called "+ son2);
        System.out.println(friend6+" your child could be called "+ son3);
    }       
}
