package coinflip;

import java.util.Random;

public class Coinflip {
	
	 public static void main(String args[]) {
			
		 int head=0;
		 int tail=0;
		 Random rn = new Random();
	
	
		 for (int i=1; i<=10; i++) {
		 int r = rn.nextInt(2) + 1;
         System.out.println(" the number is  " +r);
         
     
     
         if(r == 1)
         {   
            System.out.println("the head ");
                head++;
         }
         
           else
         {
           	 System.out.println("the tail");
           	 	tail++;
         } 	 	
  
  
   
    }

		 int r=head + tail;
		 
		 System.out.println("the head came " +head +"   times");
		 System.out.println("the tail came " +tail +"   times");
	 	 System.out.println("coin tosed  " +r+"    times ");

	 	 
	 	 double h = ((head*100)/10);
	 	 double t = ((tail*100)/10);

	 	 System.out.println("the percantage of head  " +h);
	 	 System.out.println("the percantage of tail  " +t);
	 }
	 
}
	 



