package comswap;

import java.util.Scanner;

public class Swapno {
	

	 public static void main(String args[]){  

		  
		try (Scanner sc = new Scanner(System.in)){  //try using cuz hint is telling the resource can leak..
		System.out.println("plz enter the  first number");	
	    int	a = sc.nextInt();
	    System.out.println("plz enter the second number");
	    int b = sc.nextInt();
	   
	    int c = 0;
		
	    System.out.println("the value of var a is   "+a+"   the vlaue of var b is    "+b);
	    
	    c=a;
	    a=b;
	    b=c;
	    
	    System.out.println("the value of var. a is   "+a+"   the vlaue of var b is    "+b);
	    System.out.println("the var. values has been swapped");

		}
		
		

     }  

}
