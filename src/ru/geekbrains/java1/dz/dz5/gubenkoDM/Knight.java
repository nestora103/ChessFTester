package ru.geekbrains.java1.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 04.11.2016.
 */
public class Knight extends Piece{
    @Override
    protected boolean isRightMove(String fromPosition,String toPosition) {
        //TODO
        //это конь=). Страшная фигура.
        if (!((isOnHorizontal(fromPosition,toPosition))||(isOnVertical(fromPosition,toPosition))||isOnDiagonal(fromPosition,toPosition))){
            //если координаты назначения нет нигде
            int dx,dy;
            dx=Math.abs((int)toPosition.charAt(0)-(int)fromPosition.charAt(0));
            dy=Math.abs((int)toPosition.charAt(1)-(int)fromPosition.charAt(1));
            //
            if (((dx==2)&&(dy==1))||((dx==1)&&(dy==2))){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
}
