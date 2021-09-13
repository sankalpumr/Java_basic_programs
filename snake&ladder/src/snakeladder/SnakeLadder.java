package snakeladder;

public class SnakeLadder {


    private static int playerPosition = 0; // playerposition taken 0 

    private static int snake(int die) {
        System.out.println("Player1 is Bitten By Snake");
        if(playerPosition - die < 1){    // if the playerposition value minus die value is going in negative so
        								//  playerposition will remain same otherwise if its positive so it wil calculate 
            return 0;
        }else{
            return playerPosition - die;
        }
    }

    private static int ladder(int die) {
        System.out.println("Player1 moved Ahead Through Ladder");
        if(playerPosition + die > 100){         //if it goes beyond 100 than it stays in the last same position otherwise
        										// it will calculate and return further value
            return playerPosition;
        }else{
            return playerPosition + die;
        }
    }

    public static void main(String[] args) {

        int die = 0;      //Took a variable to hold the value of dice    
        int random = 0;   // Took a variable to hold the randome function value to call the method randomly
        int n = 0;
        do {
             die = (int) Math.floor(Math.random() % 10 * 6 + 1);
             random = (int) Math.floor(Math.random() % 10 * 3 + 1);
             n = n + 1;  //we want to calculate the number of dice rolled till player wins

            if (random == 1) {
                System.out.println("Player1 still At The Same Position");
                System.out.println("Player1 Is Now At Position: " + playerPosition);


            } else if (random == 2) {
                playerPosition = ladder(die);
                System.out.println("Player1 Is Now At Position: " + playerPosition);


            } else {
                playerPosition =  snake(die);
                System.out.println("Player1 Is Now At Position: " + playerPosition);

            }
        } while (playerPosition != 100);
        System.out.println("Number of die rolls  :-" + n);
        System.out.println("player has won and it reached at position  :- " + playerPosition);


    }
    }
