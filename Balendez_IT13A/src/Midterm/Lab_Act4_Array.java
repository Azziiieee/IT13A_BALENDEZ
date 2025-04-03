
package Midterm;

public class Lab_Act4_Array {
    public static void main(String[] args) {
         
        char letters[] = {'A', 'B', 'C', 'D', 'E' , 'F', 'G'};
        
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + ", ");
        }
        System.out.println();
        
        
        //Multidemensional
        
        int numbers[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        for (int a = 0; a < numbers.length; a++) {
            System.out.print("The elements in row " + (a + 1) + ": ");
            for (int b = 0; b < numbers[a].length; b++) {
                System.out.print(numbers [a][b] + " ");
            }
            System.out.println();  
        }
    }
}
