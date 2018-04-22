/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package If_statments;

/**
 *
 * @author lili
 */
public class CheckEnrollment {
    public static void main(String[] args) {
        final int feb = 2;
        final int jan = 1;
        int java = (feb<<5) + 1;
        int E_history = (jan<<5) + 20;
        int Contemporary_Art = (feb<<5) + 1;
        int today = jan * 32 + 25;
        int java_students = 35,cont_art_students=42, EH_students=28;
        if (today <= java) {
                if (java_students< 40) {
                System.out.println("I can go to java class");
            } else {
                System.out.println("I can't go to Contemporary_Art class");
            }
        } else {
            System.out.println("I can't go to java class");
        }

        if (today <= Contemporary_Art) {
            if (cont_art_students < 40) {
                System.out.println("I can go to Contemporary Art class");
            } else {
                System.out.println("I can't go to Contemporary_Art class");
            }
        } else {
            System.out.println("I can't go to Contemporary_Art class");
        }

        if (today <= E_history) {
             if  (EH_students< 40)
                System.out.println("I can go to European history class");
            else {
                System.out.println("I can't go to Contemporary_Art class");
            }

        } else {
            System.out.println("I can't go to European history class");
        }
    }    
}
