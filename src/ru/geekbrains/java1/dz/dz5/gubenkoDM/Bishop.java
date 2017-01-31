package ru.geekbrains.java1.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 04.11.2016.
 */
public class Bishop extends Piece{
    @Override
    protected boolean isRightMove(String fromPosition,String toPosition) {
        //TODO
        //проверяем есть ли обе координаты на одной диагонали
        return isOnDiagonal(fromPosition,toPosition);
    }
}
