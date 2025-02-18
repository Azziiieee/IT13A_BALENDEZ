/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author Aiza
 */
public class Lab_act1_arithmitics {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 6;
        int no3 = 4;
        int no4 = 3;
        
        int r1 = no1 * no3 + no2;
        int r2 = no1 - no3 % no2;
        int r3 = no1 + no3 + no2 / no4;
        int r4 = no1 * no2 - no3 * no3;
        
        System.out.println("10 * 4 + 6 = "+ r1);
        System.out.println("(10 - 4 ) % 6 = "+ r2);
        System.out.println("(10 + 4 + 6) / 3 ="+ r3);
        System.out.println("10 * 6 - (4*4) = "+ r4);
    }
}
