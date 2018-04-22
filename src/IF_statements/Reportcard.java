/*      90 <= score1 <=100)
        80 <= B <= 89
        70 <= C <= 79
        65 <= D <= 69
        F <= 64
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_statments;

/**
 *
 * @author lili
 */
public class Reportcard {
    public static void main (String [] args)
    {
        int score1 = 94;
        int score2 = 92;
        int score3 = 87;
        int score4 = 83;
        int score5 = 75;
        String subject1 = "English literature";
        String subject2 = "Chemestry";
        String subject3 = "geometry";
        String subject4 = "French";
        String subject5 = "American history";
        
        if (90 <= score1 && score1 <=100) 
            System.out.println("I got a grade A in "+subject1);
        else if (80 <= score1 && score1 <=89) 
            System.out.println("I got a grade B in "+subject1);
        else if (70 <= score1 && score1 <=79) 
            System.out.println("I got a grade C in "+subject1);
        if (65 <= score1 && score1 <=69) 
            System.out.println("I got a grade D in "+subject1);
        if (score1 <=64) 
            System.out.println("I got a grade F in "+subject1);
        
        if (90 <= score2 && score2 <=100) 
            System.out.println("I got a grade A in "+subject2);
        else if (80 <= score2 && score2 <=89) 
            System.out.println("I got a grade B in "+subject2);
        else if (70 <= score2 && score2 <=79) 
            System.out.println("I got a grade C in "+subject2);
        if (65 <= score2 && score2 <=69) 
            System.out.println("I got a grade D in "+subject2);
        if (score2 <=64) 
            System.out.println("I got a grade F in "+subject2);
        
        if (90 <= score3 && score3 <=100) 
            System.out.println("I got a grade A in "+subject3);
        else if (80 <= score3 && score3 <=89) 
            System.out.println("I got a grade B in "+subject3);
        else if (70 <= score3 && score3 <=79) 
            System.out.println("I got a grade C in "+subject3);
        if (65 <= score3 && score3 <=69) 
            System.out.println("I got a grade D in "+subject3);
        if (score3 <=64) 
            System.out.println("I got a grade F in "+subject3);
        
        if (90 <= score4 && score4 <=100) 
            System.out.println("I got a grade A in "+subject4);
        else if (80 <= score4 && score4 <=89) 
            System.out.println("I got a grade B in "+subject4);
        else if (70 <= score4 && score4 <=79) 
            System.out.println("I got a grade C in "+subject4);
        if (65 <= score4 && score4 <=69) 
            System.out.println("I got a grade D in "+subject4);
        if (score4 <=64) 
            System.out.println("I got a grade F in "+subject4);
        
        if (90 <= score5 && score5 <=100) 
            System.out.println("I got a grade A in "+subject5);
        else if (80 <= score5 && score5 <=89) 
            System.out.println("I got a grade B in "+subject5);
        else if (70 <= score5 && score5 <=79) 
            System.out.println("I got a grade C in "+subject5);
        if (65 <= score5 && score5 <=69) 
            System.out.println("I got a grade D in "+subject5);
        if (score5 <=64) 
            System.out.println("I got a grade F in "+subject5);
        
    }
}
