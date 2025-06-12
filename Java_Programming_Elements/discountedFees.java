import java.util.*;
public class discountedFees {
    public void calculateDiscountedFees() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total fees: ");
        double totalFees = scanner.nextDouble();
        
        System.out.print("Enter the discount Amount: ");
        double discountAmount = scanner.nextDouble();
        
        double discountPercentage = ( discountAmount* 100) / totalFees;
        double discountedFees = totalFees - discountAmount;
        
        System.out.printf("The discounted fees is: %.2f\n", discountedFees);
        System.out.printf("The discount percentage is: %.2f%%\n", discountPercentage);
        
        
        scanner.close();
    }
    public static void main(String[] args) {
        discountedFees df = new discountedFees();
        df.calculateDiscountedFees();
    }
}
