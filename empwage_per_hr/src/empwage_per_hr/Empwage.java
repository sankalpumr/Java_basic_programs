package empwage_per_hr;

public class Empwage {
	
	  public static void main(String[] args) {
	        int empHr=8;
	        int empWage=0;
	        int empWagePerHr=20;
	        int empCheck= (int) Math.floor(Math.random()%10*2);
	        if (empCheck == 1){
	            System.out.println("Employee Is Present");
	            empHr=8;
	        }else {
	            System.out.println("Employee Is Absent");
	            empHr=0;
	        }
	        empWage=empHr*empWagePerHr;
	        System.out.println("Employee Wage: "+empWage);

	    }
	}


