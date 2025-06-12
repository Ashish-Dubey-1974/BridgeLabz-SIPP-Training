import java.util.Scanner;
public class distributionOfPens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of pens: ");
        int totalPens = scanner.nextInt();
        scanner.close();
        
        
        int pensPerStudent = totalPens / 3;

        int remainingPens = totalPens % 3;
        
        System.out.println("Each student gets " + pensPerStudent + " pens.");
        System.out.println("Remaining pens: " + remainingPens);
    }
    
}
