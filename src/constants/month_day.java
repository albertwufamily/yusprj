/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

/*
 *
 * @author lili
 */
public class month_day {
    public static void main (String[] args)
    {
    final int feb_1 = 32*2+1;
    final int June_15 = 32*6+15;
    final int sept_4 = 9*32+4;
    final int sept_7 = 9*32+7;
    final int dec_31 = 12*32+31;
    System.out.println("febuary 1st would be " + feb_1);
    System.out.println("june 15th would be " + June_15);
    System.out.println("september 4th would be " + sept_4);
    System.out.println("september 7th would be " + sept_7);
    System.out.println("december 31st would be " + dec_31);
    //mathematicly to get it back you would divide n(the number) by 32. the quocient would be the month and the remainder would be the date
    }
}
