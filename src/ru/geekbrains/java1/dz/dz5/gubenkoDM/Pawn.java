package ru.geekbrains.java1.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 04.11.2016.
 */
public class Pawn extends Piece {
    @Override
    protected final boolean isRightMove(String fromPosition,String toPosition) {
        //проверяем что координаты находятся на одной вертикали
        //что вторая координата строго больше первой и раздница между ними не больше 2
        if (isOnVertical(fromPosition,toPosition)){
            if ((int)toPosition.charAt(1)>(int)fromPosition.charAt(1)){
                if (Math.abs((int)toPosition.charAt(1)-(int)fromPosition.charAt(1))<=2){
                    return true;
                }else {
                    return false;
                }
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
}
