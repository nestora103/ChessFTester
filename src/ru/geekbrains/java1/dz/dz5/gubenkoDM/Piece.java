package ru.geekbrains.java1.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 04.11.2016.
 */
public abstract class Piece {
    private String piece;
    private String fromPosition;
    private String toPosition;
    protected abstract boolean isRightMove(String fromPosition,String toPosition);

    protected boolean isOnDiagonal(String fromPosition,String toPosition){
        int dx,dy;
        //вычисляем смещения в координатах по модулю
        dx=Math.abs((int)toPosition.charAt(0)-(int)fromPosition.charAt(0));
        dy=Math.abs((int)toPosition.charAt(1)-(int)fromPosition.charAt(1));
        if (dx==dy){
            return true;
        }else{
            return false;
        }
    }

    protected boolean isOnHorizontal(String fromPosition,String toPosition){
        return toPosition.charAt(1)==fromPosition.charAt(1);
    }

    protected boolean isOnVertical(String fromPosition,String toPosition){
        return toPosition.charAt(0)==fromPosition.charAt(0);
    }

}
