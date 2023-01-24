package practice;

public class primeNumber {

	public static void main(String[] args) {
	  System.out.println(primeNumber.isPrime(3));        ;
	  System.out.println(primeNumber.isPrime(9)); 
	  System.out.println(primeNumber.isPrime(2)); 
	  System.out.println(primeNumber.isPrime(47)); 
	}
	public static boolean isPrime(int n) {
//		if (n==0 || n==1) {
//			return false;
//		}
//		if(n==2) {
//			return true;
//			
//		}
		for(int i=2;i<=n-1;i++) {
			if (n%i==0) {
				return false;
				
			}
			else {
				return true;
			}
		}
		return false;
		
	
	}

}
