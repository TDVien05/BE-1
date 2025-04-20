
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class InputAndOutput {
    public static void main(String[] args) {
        // To input data, you should declare scanner to input
        Scanner scanner = new Scanner(System.in);
        
        // You shoulf use System.out.println for output
        System.out.println("Enter your name : ");
        
        String name = scanner.nextLine();
//        scanner.nextInt() : for int number
//        scanner.nextBoolean() : for true/ false value
//        scanner.nextFloat() : for float
//        scanner.ChoiceFormat.nextDouble() : use for Double
//        ....
//        
        
        System.out.println(name);
        
    }
}
