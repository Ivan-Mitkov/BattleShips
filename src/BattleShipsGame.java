
import java.util.Scanner;

public class BattleShipsGame {
    static int counterMyShips = 0;

    public static void main(String[] args) {

        Grid.makeBattleGround(0);
        while (counterMyShips < 5) {
            placeMyShips();
            System.out.println(counterMyShips);
        }
        ComputerMoves.placeComputer();
        if(counterMyShips==5&&ComputerMoves.counterComputerShips==5){
            Grid.printGrid();
        }

    }



    public static void placeMyShips() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter X coordinate for your "+(counterMyShips+1)+" ship: ");
        int x = input.nextInt();
        System.out.print("Enter Y coordinate for your  "+(counterMyShips+1)+" ship: ");
        int y = input.nextInt();

        if (CheckUtil.noGoodMove(x, y)) {
            System.out.println("Please choose different coordinates");
        } else {
            Grid.sea[x+1][y+1] = GameSymbols.myShips;
            counterMyShips++;
        }
    }
}