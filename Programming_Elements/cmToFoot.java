import java.util.*;
public class cmToFoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length in centimeters: ");
        double cm = scanner.nextDouble();
        
        
        double inches = cm / 2.54;
        int feet = (int)inches / 12;
        inches = inches % 12;
        
        System.out.printf("%d feet and %.2f inches.\n", feet, inches);
       
        
        scanner.close();
    }
}