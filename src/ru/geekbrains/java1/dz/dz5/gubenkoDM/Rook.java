package ru.geekbrains.java1.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 04.11.2016.
 */
public class Rook extends Piece {
    @Override
    protected boolean isRightMove(String fromPosition,String toPosition) {
        //проверяем наличие одеих координат на одной горизонтали доски или на одной вертикали
        return ((isOnHorizontal(fromPosition,toPosition))||(isOnVertical(fromPosition,toPosition)));
    }
}
