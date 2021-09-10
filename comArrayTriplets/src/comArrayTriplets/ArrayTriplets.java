package comArrayTriplets;

import java.util.Scanner;

public class ArrayTriplets {
	
	static void findTriplets(int[] arr, int n)
	{

    boolean found = false;
	for (int i=0; i<n-2; i++) {
        for (int j=i+1; j<n-1; j++)	{	        
        	for (int k=j+1; k<n; k++)        
			{

        		if (arr[i]+arr[j]+arr[k] == 0)
                  {
	                System.out.print(arr[i]);
                    System.out.print(" ");
                    System.out.print(arr[j]);
                    System.out.print(" ");               
                    System.out.print(arr[k]);
	                System.out.print("\n");
                    found = true;
	                }
	            }
	        }
	    }
	 
	    // If no triplet with 0 sum found in array then
	    if (found == false)
	        System.out.println(" not exist ");
	 
	}
	 
 
	public static void main(String[] args)
	{
		int arr[]= new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("plz enter 5 numbers positive and negative ");

		for(int p = 0; p < arr.length; p++)     
        arr[p] = sc.nextInt(); 

		
	    int n =arr.length;
	    findTriplets(arr, n);
	 
	}

}
