package comFindQuotient;

import java.util.Scanner;

public class FindQuotient {
	
		 public static void main(String args[]){  

			  

				Scanner sc = new Scanner(System.in);
				System.out.println("plz enter the number to find the result.");
				int number= sc.nextInt();
				int i = sc.nextInt();


				if (number%i==0){
		        int q= (number / i);
			    System.out.println(number+"  is divisible with  "  +i + "  ad Quotient is  " + q);
		        }    


				else  {
		        float p =(number%i);
		       	System.out.println(i+" devided by :  "+i+" remainder is   " +p);
				}
	      

	
	
	}
}
	


