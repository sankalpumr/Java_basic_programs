package emp_wage_fulltime_parttime;

public class Empwage {
	
	  public static void main(String[] args) {
	        int empHr=0;
	        int empWage=0;
	        int empWagePerHr=20;

	        int empCheck= (int) Math.floor(Math.random()%10*3);
	        if (empCheck == 1){
	            System.out.println("Employee Is Full Time Employee");
	            empHr=8;
	        }else if (empCheck==2){
	            System.out.println("Employee Is Part Time Employee");
	            empHr=4;
	        }
	        else {
	            System.out.println("Employee Is Absent");
	            empHr=0;
	        }
	        empWage=empHr*empWagePerHr;
	        System.out.println("Employee Wage: "+empWage);

	    }

}
