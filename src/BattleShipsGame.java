
import java.util.Scanner;

public class BattleShipsGame {
    static int counterMyShips = 0;

    public static void main(String[] args) {

        Grid.makeBattleGround(0);
        while (counterMyShips < 5) {
            placeMyShips();
            System.out.println(counterMyShips);
        }
        if(counterMyShips==5){
            Grid.printGrid();
        }

    }

    public static boolean noGoodMove(int x, int y) {
        if (x >= Grid.row || x < 0 || y >= Grid.col || y < 0) return true;
        if (!Grid.sea[x+1][y+1].equals(" ")) return true;
        return false;
    }

    public static void placeMyShips() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter X coordinate for your "+(counterMyShips+1)+" ship: ");
        int x = input.nextInt();
        System.out.print("Enter Y coordinate for your  "+(counterMyShips+1)+" ship: ");
        int y = input.nextInt();

        if (noGoodMove(x, y)) {
            System.out.println("Please choose different coordinates");
        } else {
            Grid.sea[x+1][y+1] = "@";
            counterMyShips++;
        }
    }
}