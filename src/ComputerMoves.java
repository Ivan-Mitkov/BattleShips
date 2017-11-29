import java.util.concurrent.ThreadLocalRandom;

public class ComputerMoves {
    static int counterComputerShips = 0;

    public static void placeComputer(){
        while(counterComputerShips<5){
            checkComputerShips();
        }
    }

    public static void checkComputerShips() {

        int[] coor =createRandomCoordinates();
        int x=coor[0];
        int y = coor[1];
        if (CheckUtil.noGoodMove(x,y)) {
           return;
        } else {
            Grid.sea[x+1][y+1] = GameSymbols.computerShips;
            counterComputerShips++;
        }
    }
    public static int[] createRandomCoordinates(){
        int minX=0;
        int maxX=Grid.getRow();

        int minY=0;
        int maxY=Grid.getCol();

        int randomNumX = ThreadLocalRandom.current().nextInt(minX, maxX -2);
        int randomNumY = ThreadLocalRandom.current().nextInt(minY, maxY -2);


        int[]coord={randomNumX,randomNumY};
        return coord;

    }
}
