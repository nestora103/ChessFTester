package ru.geekbrains.java1.dz.dz5.gubenkoDM;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Nestor on 04.11.2016.
 */
public class ChessTest  {
    private String piece;
    private String fromPosition;
    private String toPosition;
    private Set pieceSet=new HashSet();


    public Set getPieceSet() {
        return pieceSet;
    }

    public void setPieceSet(Set pieceSet) {
        this.pieceSet = pieceSet;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public void setFromPosition(String fromPosition) {
        this.fromPosition = fromPosition;
    }

    public void setToPosition(String toPosition) {
        this.toPosition = toPosition;
    }

    public String getPiece() {
        return piece;
    }

    public String getFromPosition() {
        return fromPosition;
    }

    public String getToPosition() {
        return toPosition;
    }

    public final boolean isEqualsCoord(){
        return fromPosition.equals(toPosition);
    }

    private int getPieceCod(String pieceName) {
        if (pieceName.equals("пешка")){
            return 0;
        }else if (pieceName.equals("ладья")){
            return 1;
        }else if (pieceName.equals("конь")){
            return 2;
        }else if (pieceName.equals("слон")){
            return 3;
        }else if (pieceName.equals("ферзь")){
            return 4;
        }else{
            return 5;
        }
    }

    public final boolean isName(){
       return pieceSet.contains(piece);
    }

    public final int isFrom(){
        if (((int)fromPosition.charAt(0)>=97)&&((int)fromPosition.charAt(0)<=104)){
            if (((int)fromPosition.charAt(1)>=49)&&((int)fromPosition.charAt(1)<=56)){
                return 0;
            }else {
                return 1;
            }
        }else{
            return 2;
        }
    }

    public final int isTo(){
        if (((int)toPosition.charAt(0)>=97)&&((int)toPosition.charAt(0)<=104)){
            if (((int)toPosition.charAt(1)>=49)&&((int)toPosition.charAt(1)<=56)){
                if (!isEqualsCoord()){
                    return 0;
                 }else {
                    return 1;
                 }
            }else {
                return 2;
             }
        }else{
            return 3;
         }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ChessTest csT=new ChessTest();

        //создали пустое множество фигур
        Set pSet=new HashSet();
        //заполнили множество вариантами фигур
        pSet.add("пешка");
        pSet.add("ладья");
        pSet.add("конь");
        pSet.add("слон");
        pSet.add("ферзь");
        pSet.add("король");
        //передали заполненное множество на установку классу игры. Для случая если оно может когда то понадобится
        csT.setPieceSet(pSet);
        //переменная для хранения кода фигуры
        int pieceCod;


        while (true){
            System.out.println("Введите название шахматной фигуры. Доступные фигуры: пешка,ладья,конь,слон,ферзь,король.");
            //передаем пользовательский ввод с названием фигуры приведенной к нижнему регистру
            csT.setPiece(sc.next().toLowerCase());

            //проверяем есть ли такая фигура в множестве.

            if (csT.isName()){
                pieceCod=csT.getPieceCod(csT.getPiece());
                break;
            }else{
                System.out.println("Такой фигуры нет!");
            }
        }

        System.out.println("Доска:");

        ChessUI cUI=new ChessUI();
        //заполняем и отрисовываем доску
        cUI.drawField();

        while (true){
            System.out.println("Введите начальное положение фигуры на доске. Возможные варианты: a1-a8,b1-b8,c1-c8,d1-d8,e1-e8,f1-f8,g1-g8,h1-h8");
            //передаем пользовательский ввод с начальным положением фигуры
            csT.setFromPosition(sc.next().toLowerCase());

            //проверка на корректность начальной координаты

            if (csT.isFrom()==0){
                break;
            }else if(csT.isFrom()==1){
                System.out.println("Неверно задана циферная координата!");
            }else{
                System.out.println("Неверно задана буквенная координата!");
            }
        }

        while (true){
            System.out.println("Введите конечное положение фигуры на доске. Возможные варианты: a1-a8,b1-b8,c1-c8,d1-d8,e1-e8,f1-f8,g1-g8,h1-h8");
            //передаем пользовательский ввод с конечным положением фигуры
            csT.setToPosition(sc.next().toLowerCase());

            //проверка на корректность конечной координаты
            if (csT.isFrom()==0){
                break;
            }else if(csT.isFrom()==1){
                System.out.println("Начальная и конечная координаты совпадают и равны "+csT.getToPosition());
            }else if(csT.isFrom()==2){
                System.out.println("Неверно задана циферная координата!");
            }else{
                System.out.println("Неверно задана буквенная координата!");
            }
        }

        //создаем фигуру
        Piece p = null;

        //определяем по коду фигуры что же все таки у нас за фигура и как с ней работать
        switch (pieceCod){
            case 0:
                p=new Pawn();
                break;
            case 1:
                p=new Rook();
                break;
            case 2:
                p=new Knight();
                break;
            case 3:
                p=new Bishop();
                break;
            case 4:
                p=new Queen();
                break;
            case 5:
                p=new King();
                break;
        }

        if (p.isRightMove(csT.getFromPosition(),csT.getToPosition())){
            System.out.println("Такой ход возможен!");
        }else{
            System.out.println("Такой ход невозможен!");
        }





    }


}
