/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author lili
 */
public class ReportCard {
    public static void main (String [] args)
    {
    /*My Semester Grades
    A: 94 in English Literature
    A: 92 in Chemistry
    B: 87 in Geometry
    B: 83 in French
    C: 75 in American History*/
        int score;
        String grade;
        String subject;
        String subjects [] = new String [5];
        String grades [] = new String [5];
        int[] scores = new int [5];
        grades [0] = "A";
        grades [1] = "A";
        grades [2] = "B";
        grades [3] = "B";
        grades [4] = "C";
        scores [0] = 94;
        scores [1] = 92;
        scores [2] = 87;
        scores [3] = 83;
        scores [4] = 75;
        subjects [0] = "English literature";
        subjects [1] = "Chemestry";
        subjects [2] = "geometry";
        subjects [3] = "French";
        subjects [4] = "American history";
        for (int n=0;n<5;n++){
        System.out.println( grades[n] +": " + scores[n] + " in " + subjects[n]);
        }  
    
    }
}
