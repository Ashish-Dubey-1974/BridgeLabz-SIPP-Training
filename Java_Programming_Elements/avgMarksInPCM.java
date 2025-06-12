public class avgMarksInPCM {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter marks in Physics: ");
        double physics = scanner.nextDouble();
        
        System.out.print("Enter marks in Chemistry: ");
        double chemistry = scanner.nextDouble();
        
        System.out.print("Enter marks in Mathematics: ");
        double mathematics = scanner.nextDouble();
        
        double average = (physics + chemistry + mathematics) / 3;
        
        System.out.printf("Average marks in PCM: %.2f\n", average);
        
        scanner.close();
    }
    
}
