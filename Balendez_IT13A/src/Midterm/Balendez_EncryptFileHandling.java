package Midterm;

import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class Balendez_EncryptFileHandling {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File myObj = new File ("C:\\Users\\pat\\Documents\\GitHub\\IT13A_BALENDEZ\\Balendez_IT13A\\input.txt");
        try (Scanner myReader = new Scanner (myObj)) {
            int number = 4;
            
            while (myReader.hasNextLine ()){
                String data = myReader.nextLine ();
                String encrypt = encryptmessage (data, number);
                System.out.println("Text: " + data);
                System.out.println("Encrypt: " + encrypt);
                System.out.println();
                
            }
        }
    }
    public static String encryptmessage (String message, int number) {
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] += number;
        }
        return new String(chars);
    }
}
