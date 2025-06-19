public class discountedAmount {
    public static void main(String[] args) {
        int fees = 125000;
        int discountPercentage = 10;
        double discountAmount = (fees * discountPercentage) / 100.0;
        double discountedFees = fees - discountAmount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f",discountAmount, discountedFees);
    }
}
