/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise_5;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Exercise_5 {
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cookie=input.nextInt();
        int noOfBox=cookie/12;
        int noOfLeftoverBox=noOfBox%24;
        int noOfCarton=noOfBox/24;
        int noOfLeftoverCookie=cookie%12;
        double moneyFromCarton=noOfCarton*24*1.14;
        double moneyFromLeftover=noOfLeftoverBox*0.57;
        double total=moneyFromCarton+moneyFromLeftover;
        System.out.println("No. of Box(es): "+ noOfBox);
        System.out.println("No. of Carton(s): "+ noOfCarton);
        System.out.println("No. of Leftover Box(es): "+ noOfLeftoverBox);
        System.out.println("No. of Leftover Cookie(s): "+ noOfLeftoverCookie);
        System.out.println("Total Money Made: "+ total + " dollars");
    }
}
