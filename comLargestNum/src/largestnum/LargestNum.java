package largestnum;

import java.util.Scanner;

	public class LargestNum {
	
		public static void main(String args[]) {
	
			int d=0;
			int a,b,c;
			Scanner sc = new Scanner(System.in);

	 												//Taking three value as input from console.
	 
			System.out.println("plz enter first number");
			a= sc.nextInt();
	 
			System.out.println("plz enter second number");
			b= sc.nextInt();
	 
			System.out.println("plz enter third number");
			c=sc.nextInt();
	 

	 
	 
			if( d<a)  {
				d=a;
			}
		 

	 
			if (d<b) {
				d=b;
			}
			

	 
	 
			if (d<c) {
				d=c;
			}

	 
	
			System.out.println(" the largest number is   "+d  );
	 	


	}

}
