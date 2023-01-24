package practice;

public class SortingArray {

	public static void main(String[] args) {
		int[]arr= {3,9,7,5,1};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;      //swapping
				}
				
				
				
				//System.out.println(arr[1]);
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i] +" ");
		
	}
		System.out.println("Second largest number is "+arr[1]);
		System.out.println("Second smallest number is "+arr[arr.length-2]);
}
}
