
public class Grid {
    public static int row = 12;

    public static int getRow() {
        return row;
    }

    public static int getCol() {
        return col;
    }

    public static int col =12;
    static int round=0;
    static String [][] sea=new String[row][col];
    public static void makeBattleGround(int round){

        System.out.println("*** Welcome to Battle Ship Game *** ");
        System.out.println();

        if(round==0){
            System.out.println("Right now the sea is empty   ");
        }
        else{
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                if((i==0||i==row-1) &&(j==0||j==col-1) ){
                       sea[i][j]="  ";

                }
                else if(i==0||i==row-1){
                    sea[i][j]=j-1 +"";
                }
                else if(j==0){
                    sea[i][j]=j>=10?i-1+"|":i-1+" |";
                }
                else if(j==col-1){
                    sea[i][j]=j>=10?"|"+(i-1):"| "+(i-1);
                }
                else {
                    sea[i][j]=" ";
                }


            }
        }
        printGrid();


    }
    public static void printGrid(){
        for(int i=0; i<row;i++){
            for(int j=0; j<col;j++){
                System.out.print(sea[i][j]);
            }
            System.out.println();
        }
    }
}
