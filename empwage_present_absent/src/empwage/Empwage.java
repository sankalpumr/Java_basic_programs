package empwage;

public class Empwage {

    public static void main(String[] args) {
        int employeePresent=1;
        int empCheck= (int) Math.floor(Math.random()%10*2);

        
        if (empCheck == 1){
            System.out.println("Employee Is Present");
        }else {
            System.out.println("Employee Is Absent");
        }
    }

}
