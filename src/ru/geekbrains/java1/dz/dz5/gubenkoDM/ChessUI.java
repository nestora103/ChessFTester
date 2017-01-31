package ru.geekbrains.java1.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 04.11.2016.
 */
public class ChessUI {
    private final int FIELDSIZE=8;
    protected String[][] chessField=new String[FIELDSIZE+1][FIELDSIZE+1];

    public void drawField() {
        int l=0;
        for (int i=0,k=8;i<=FIELDSIZE;i++,k--){
            for (int j=0;j<=FIELDSIZE;j++){
                if ((j==0)&&(k!=0)){
                    chessField[i][j]=String.valueOf(k);
                }else{
                    if (k==0){
                        switch (l){
                            case 0:
                                chessField[i][j]=" ";
                                break;
                            case 1:
                                chessField[i][j]="a";
                                break;
                            case 2:
                                chessField[i][j]="b";
                                break;
                            case 3:
                                chessField[i][j]="c";
                                break;
                            case 4:
                                chessField[i][j]="d";
                                break;
                            case 5:
                                chessField[i][j]="e";
                                break;
                            case 6:
                                chessField[i][j]="f";
                                break;
                            case 7:
                                chessField[i][j]="g";
                                break;
                            case 8:
                                chessField[i][j]="h";
                                break;
                        }
                        l++;

                    }else{
                        chessField[i][j]=" ";
                    }
                }
            }
        }

        System.out.println(" -----------------");

        for (int i=0;i<=FIELDSIZE;i++) {
            for (int j = 0; j <= FIELDSIZE; j++) {
                if (j==0){
                    System.out.print("|"+chessField[i][j]);
                    System.out.print("|");

                }else{
                    System.out.print(chessField[i][j]+"|");
                }
            }
            System.out.println();
        }

        System.out.println(" -----------------");
    }
}
