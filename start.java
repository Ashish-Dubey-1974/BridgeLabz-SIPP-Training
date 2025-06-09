import java.util.*;
class start{
 public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 checkPrime(n);
 }
 static void checkPrime(int val){
	 if(val<=1){
		 System.out.print("False");
		 return;
		 }
	 if(val<=3){
		 System.out.print("True");
		 return;
	 }
	 for(int i=3;i*i<=val;i++){
		 if(val%i==0){
			 System.out.print("False");
			 return;
		 }
	 }
	 System.out.print("True");
 }
}