package ru.geekbrains.java1.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 04.11.2016.
 */
public class King extends Piece {
    @Override
    protected boolean isRightMove(String fromPosition,String toPosition) {
        //TODO
        if ((isOnHorizontal(fromPosition,toPosition))||(isOnVertical(fromPosition,toPosition))||(isOnDiagonal(fromPosition,toPosition))){
            //проверяем что ходить придется только на 1 клетку
            if (Math.abs((int)toPosition.charAt(1)-(int)fromPosition.charAt(1))==1){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
}
