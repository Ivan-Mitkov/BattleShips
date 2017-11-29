public class CheckUtil {

    public static boolean noGoodMove(int x, int y) {
        if (x >= Grid.row || x < 0 || y >= Grid.col || y < 0) return true;
        if (!Grid.sea[x+1][y+1].equals(" ")) return true;
        return false;
    }
    public static boolean hit(int x, int y){

        if (Grid.sea[x+1][y+1].equals(GameSymbols.computerShips)) {
            Grid.sea[x+1][y+1]=GameSymbols.hit;
            ComputerMoves.counterComputerShips--;
            return true;
        }
        return false;
    }
    public static boolean myShipHit(int x, int y){
        if (Grid.sea[x+1][y+1].equals(GameSymbols.myShips)){
            Grid.sea[x+1][y+1]=GameSymbols.myShipHit;
            BattleShipsGame.counterMyShips--;
            return true;
        }
        return false;
    }
    public static boolean miss(int x, int y){
        if (Grid.sea[x+1][y+1].equals(" ")){
            Grid.sea[x+1][y+1]=GameSymbols.miss;
            return true;
        }
        return false;
    }

    public static boolean computerHit(int x, int y){
        BattleShipsGame.counterMyShips--;
        return myShipHit(x,y);
    }
    public static boolean computerMiss(int x, int y){
        if (Grid.sea[x+1][y+1].equals(" ")){
            Grid.sea[x+1][y+1]=GameSymbols.computerMiss;
            return true;
        }
        return false;
    }
    public static boolean computerHitHisShip(int x, int y){
        if (Grid.sea[x+1][y+1].equals(GameSymbols.computerShips)) {
            Grid.sea[x+1][y+1]=GameSymbols.hit;
            ComputerMoves.counterComputerShips--;
            return true;
        }
        return false;
    }

}
