package comfact;

import java.util.Scanner;

public class Factz {
	
	
	 public static void main(String args[]){  

			int i,fact=1;  

			Scanner sc = new Scanner(System.in);
			System.out.println("plz enter the number to find the fact.");
			int number= sc.nextInt();
	   
		    for(i=1;i<=number;i++){    
	        fact=fact*i;    
			
	        if (number%i==0){
		    System.out.println(i+" is Factor of Number: "+number);

	        }    
		    }
		   System.out.println("Factorial of "+number+" is: "+fact);    
			
	         
		
		 
	      }  
		 
	}  



