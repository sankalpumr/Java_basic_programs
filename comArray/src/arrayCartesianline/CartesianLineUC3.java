package arrayCartesianline;

import java.util.Scanner;

public class CartesianLineUC3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[4];
        int y[] = new int[4];
        double first_Line;
        double second_Line;


        for (int i = 0; i < x.length; i++) {
            System.out.println("Enter The Coordinates Of x Line: ");
            x[i] = sc.nextInt();

        }


        for (int j = 0; j < y.length; j++) {
            System.out.println("Enter The Coordinates Of y line: ");
            y[j] = sc.nextInt();
        }

        first_Line = Math.sqrt((x[1] - x[0]) * (x[1] - x[0]) + (y[1] - y[0]) * (y[1] - y[0]));
        second_Line = Math.sqrt((x[3] - x[2]) * (x[3] - x[2]) + (y[3] - y[2]) * (y[3] - y[2]));

        if (first_Line == second_Line) {
            System.out.println("the both lines are equal");
        } else if (first_Line < second_Line) {
            System.out.println("first line's length is less than second line ");
        } else {
            System.out.println("first line's length is greater than second line");
        }


    }

}
