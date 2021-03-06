public class CheckUtil {

    protected static boolean noGoodMove(int x, int y) {
        if (x >= Grid.row || x < 0 || y >= Grid.col || y < 0) return true;
        if (!Grid.sea[x+1][y+1].equals(" ")) return true;
        return false;
    }
    protected static boolean noGoodMoveInBattle(int x, int y){
        if (x >= Grid.row || x < 0 || y >= Grid.col || y < 0) return true;
        if (Grid.sea[x+1][y+1].equals(GameSymbols.computerMiss)) return true;
        return false;
    }
    protected static boolean noGoodMyMoveInBattle(int x, int y){
        if (x >= Grid.row || x < 0 || y >= Grid.col || y < 0) return true;
        if (Grid.sea[x+1][y+1].equals(GameSymbols.miss)) return true;
        return false;
    }

    protected static boolean hit(int x, int y){

        if (Grid.sea[x+1][y+1].equals(GameSymbols.computerShips)) {
            Grid.sea[x+1][y+1]=GameSymbols.hit;
            ComputerMoves.counterComputerShips--;
            return true;
        }
        return false;
    }
    protected static boolean myShipHit(int x, int y){
        if (Grid.sea[x+1][y+1].equals(GameSymbols.myShips)){
            Grid.sea[x+1][y+1]=GameSymbols.myShipHit;
            BattleShipsGame.counterMyShips--;
            return true;
        }
        return false;
    }
    protected static boolean miss(int x, int y){
        if (Grid.sea[x+1][y+1].equals(" ")){
            Grid.sea[x+1][y+1]=GameSymbols.miss;
            return true;
        }
        return false;
    }

    protected static boolean computerHit(int x, int y){
        if (Grid.sea[x+1][y+1].equals(GameSymbols.myShips)) {
            Grid.sea[x+1][y+1]=GameSymbols.hit;
            BattleShipsGame.counterMyShips--;
            return true;
        }
        return false;
    }
    protected static boolean computerMiss(int x, int y){
        if (Grid.sea[x+1][y+1].equals(" ")){
            Grid.sea[x+1][y+1]=GameSymbols.computerMiss;
            return true;
        }
        return false;
    }
    protected static boolean computerHitHisShip(int x, int y){
        if (Grid.sea[x+1][y+1].equals(GameSymbols.computerShips)) {
            Grid.sea[x+1][y+1]=GameSymbols.hit;
            ComputerMoves.counterComputerShips--;
            return true;
        }
        return false;
    }

}
