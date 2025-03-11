package Midterm;

import java.util.Scanner;

public class Lab_Act3_Palindrome {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = in.nextLine();
    
    String reversed = "";
    
    for (int y = word.length() - 1; y >= 0; y--)
    {    reversed += word.charAt(y);
    }
    if (word.equalsIgnoreCase(reversed)){
        System.out.println(word.toLowerCase() + " is a palindrome");
    } else { 
        System.out.println(word.toLowerCase() + " is NOT a palindrome");
    }
    }
}
