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
public class redo_report_card {
     public static void main (String [] args)
    {
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
        int average = ((scores[0] + scores[1] + scores[2] + scores[3] + scores[4])/5);
        subjects [0] = "English literature";
        subjects [1] = "Chemestry";
        subjects [2] = "geometry";
        subjects [3] = "French";
        subjects [4] = "American history";
        for (int n=0;n<5;n++){
        System.out.println( grades[n] +": " + scores[n] + " in " + subjects[n]);
        }  
    System.out.println("My average score was " + average);
        System.out.println ( "Did I make the honor role? " + ((scores[0]>=70)&&(scores[1]>=70)&&(scores[2]>=70)&&(scores[3]>=70)&&(scores[4]>=70)));
    }
}
