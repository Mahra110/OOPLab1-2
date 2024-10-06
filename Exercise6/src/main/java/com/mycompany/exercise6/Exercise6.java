/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise6;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Exercise6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter RPM1: ");
        double RPM1 = input.nextDouble();
        System.out.print("Enter diameter of pulley 1: ");
        double diameter1 = input.nextDouble();
        System.out.print("Enter diameter of pulley 2: ");
        double diameter2 = input.nextDouble();
        double RPM2 = (diameter1 / diameter2) * RPM1;
        System.out.println("The speed of the second pulley (RPM2) is: " + RPM2);
        System.out.print("Enter the force exerted: ");
        double forceExerted = input.nextDouble();
        System.out.print("Enter the number of up ropes: ");
        int numOfRopes = input.nextInt();
        double weightLifted = forceExerted * numOfRopes;
        System.out.println("The weight that can be lifted is: " + weightLifted);
        
     
    }
}
