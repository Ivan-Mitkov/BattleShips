public class CheckUtil {

    public static boolean noGoodMove(int x, int y) {
        if (x >= Grid.row || x < 0 || y >= Grid.col || y < 0) return true;
        if (!Grid.sea[x+1][y+1].equals(" ")) return true;
        return false;
    }

}
