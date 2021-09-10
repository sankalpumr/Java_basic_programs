package newtest1;

public class EmpCheck {

     public static void main(String args[]){

          int EmpPresent=1;

          double Employee= Math.floor(Math.random() * 10)%2;

          if(EmpPresent== Employee){

               System.out.println("The Employee is present ");
          }
               else{
                    System.out.println("The Employee is absent ");
          }


     }


}
