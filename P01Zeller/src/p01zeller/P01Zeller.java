/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01zeller;

import java.util.Scanner;

/**
 *
 * @author victormarsan
 */
public class P01Zeller {

    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Victor");
        int mes = 9, any, dia = 13;

        System.out.println("Year?");
        any= keyboard.nextInt();
        
        if (any%4==0 && (any%100!= 0 || any%400 == 0)) {
            dia = 12;
        }
        
        String stDat = birthDay_Zeller(dia, mes, any);
        System.out.println("International programmer day: " + stDat + " and the day is " + dia);
    }
    
    

    private static String birthDay_Zeller(int dia, int mes, int any) {

        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

        int a, y, m, d;

        a = (14 - mes) / 12;
        y = any - a;
        m = mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return ArrayWeek[d];
    }

}
