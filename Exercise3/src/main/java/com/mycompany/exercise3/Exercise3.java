/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Exercise3 {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number");
        int num2 = input.nextInt();
        int product = num1*num2;
        int sum = num1+ num2;
        int diff = num1-num2;
        System.out.println("Sum=" + sum);
        System.out.println("Difference=" + diff);
        System.out.println("Product ="+ product);
    }
}
