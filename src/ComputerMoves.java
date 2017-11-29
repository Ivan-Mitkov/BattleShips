import java.util.concurrent.ThreadLocalRandom;

public class ComputerMoves {
    static int counterComputerShips = 0;

    public static void placeComputer(){
        while(counterComputerShips<5){
            checkComputerShips();
        }
    }

    public static void checkComputerShips() {

        int[] coor = createRandomCoordinates();
        int x = coor[0];
        int y = coor[1];
        if (CheckUtil.noGoodMove(x, y)) {
            return;
        } else {
            Grid.sea[x + 1][y + 1] = GameSymbols.computerShips;
            counterComputerShips++;
            System.out.println(GameSymbols.messageComputerDeploy);
        }
    }

    public static int[] createRandomCoordinates(){
        int minX=-1;
        int maxX=Grid.getRow();

        int minY=-1;
        int maxY=Grid.getCol();

        int randomNumX = ThreadLocalRandom.current().nextInt(minX, maxX -2);
        int randomNumY = ThreadLocalRandom.current().nextInt(minY, maxY -2);


        int[]coord={randomNumX,randomNumY};
        return coord;

    }
    public static void computerMove(){
        int[] coor =createRandomCoordinates();
        int x=coor[0]+1;
        int y = coor[1]+1;
        if(CheckUtil.noGoodMoveInBattle(x,y)){
            return;
        }

        if(CheckUtil.hit(x,y)){
            System.out.println(GameSymbols.computerHitHisOwn);
            return;
        }
        if(CheckUtil.computerMiss(x,y)){
            System.out.println(GameSymbols.getComputerMissMessage);
        }
        if(CheckUtil.computerHit(x,y)){
            System.out.println(GameSymbols.computerHit);
        }
        if(CheckUtil.computerHitHisShip(x,y)){
            System.out.println(GameSymbols.computerHitHisOwn);
        }
    }
}
