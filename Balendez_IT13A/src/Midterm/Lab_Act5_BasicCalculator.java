
package Midterm;

public class Lab_Act5_BasicCalculator {
    public static int myAddition (int a, int b) {
        return a + b;
    }
    public static int mySubtraction (int a, int b) {
        return a - b;
    }
    public static int myMultiplication (int a, int b) {
        return a * b;
    }
    public static int myDivision (int a, int b) {
        return a / b;
    }
    public static double myPercentage ( double myPayment, double myTax){
        return myPayment * (myTax / 100);
    }
    
    public static void main(String[] args) {
        int result1 = myAddition (100, 50);
        System.out.println("Addition: " + result1);
        int result2 = mySubtraction (100, 50);
        System.out.println("Subtraction: " + result2);
        int result3 = myMultiplication (100, 50);
        System.out.println("Multiplication: " + result3);
        int result4 = myDivision (100, 50);
        System.out.println("Division: " + result4);
        double result5 = myPercentage (100, 50);
        System.out.println("Percentage: " + result5);
    }
}
