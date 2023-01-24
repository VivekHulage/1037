package practice;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci.fibonacii(10);
	}
	public static void fibonacii(int count) {
		int a=0;int b=1;
		int sum=1;
		
		for(int i=1;i<=count;i++) {
			System.out.println(a+",");
			
			a=b;
			b=sum;
			sum=a+b;
		}
	}
	

}
