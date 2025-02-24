package Prelim;

import java.util.Scanner;
public class Lab2_Activity2_JavaProgram_SKB {
    public static void main(String[] args){
    
    int x, y, z;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Input the 1st Number: ");
    x = in.nextInt();
    System.out.println("Input the 2nd Number; ");
    y = in.nextInt();
    System.out.println("Input the 3rd Number; ");
    z = in.nextInt();
    
    if (x > y && x > z) {
        System.out.println("X is the greatest number");
    } else if (y > x && y > z) {
        System.out.println("Y is the greatest number");
    } else if (z > x && z > y) {
        System.out.println("Z is the greatest number");
    } else {
        System.out.println("There is no greatest number");
    }
    
    }
    
}
