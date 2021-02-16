/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p22recursividad;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author victormarsan
 */
public class P22Recursividad {

    static int contador = 0;

    static int sum = 0;
    
    static int serietotal = 1;

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 30;

        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1: // opcion 1
                    date();
                    break;
                case 2:
                    System.out.println("Type a number");
                    int nmax = keyboard.nextInt();
                    int nummin = 0;
                    section2(nummin, nmax);
                    break;
                case 3:
                    System.out.println("Type the first number");
                    int num1 = keyboard.nextInt();
                    System.out.println("Type the second number");
                    int num2 = keyboard.nextInt();
                    section3(num1, num2, sum);
                    System.out.println("Sum = " + sum);
                    break;
                case 4:
                    System.out.println("Type a number");
                    int num4 = keyboard.nextInt();
                    section4(num4);
                    break;
                case 5:
                    section5();
                    break;
                case 6:
                    section6();
                    break;
                case 7:
                    section7();
                    break;
                case 8:
                    section8();
                    break;
                case 9:
                    section9();
                    break;
                case 10:
                    section10();
                    break;
                case 0:
                    System.out.println("Good bye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }

    }

    /*private static void mRecursivo(int contador) {
        System.out.println(contador);
        contador++;
        mRecursivo(contador);
        if (contador < 100) {
            mRecursivo(contador);
        }

    }*/
    private static void date() {
        Date victorDate = new Date();
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(victorDate));
    }

    private static void section2(int nummin, int nmax) {
        
        if (nummin < nmax) {
            nummin++;
            if (nummin % 2 == 0) {
                System.out.println(nummin);
            }
            section2(nummin, nmax);
        }

    }

    private static void section3(int num1, int num2, int sum) {

        if (num1 < num2) {
            System.out.print(num1 + ",");
            sum += num1;
            num1++;
            section3(num1, num2, sum);

        } else if (num1 > num2) {
            System.out.print(num2 + ",");
            sum += num2;
            num2++;
            section3(num1, num2, sum);
        }

    }

    private static void section4(int num4) {

        if (contador < num4) {
            System.out.println("The serie is "+serietotal);
            serietotal += serietotal;
            contador++;
            section4(num4);
        }
        
    }

    private static void userMenu() {
        System.out.println("\n************");
        System.out.println("1-display date and time");
        System.out.println("2-Ask for a number N and write the even numbers from 0 to N using recursion");
        System.out.println("3-Ask for two numbers N1 and N2 and write the numbers between the 2 numbers and the sum total of them.");
        System.out.println("4-Ask for a number N and display N numbers from the series 1, 2, 3, 6, 12, ...");
        System.out.println("5-Ask for a number N and display N numbers from the series 1, 1, 2, 3, 5, ...");
        System.out.println("6-A recursive method (a function) to calculate a factorial of a number entered by user.");
        System.out.println("7-A method (a function) using recursion to calculate a series invented by you.");
        System.out.println("8-What is recursion?");
        System.out.println("9-A recursive method to visualize Pascal's Triangle");
        System.out.println("Your choice is");
    }
}
