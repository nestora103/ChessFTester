package ru.geekbrains.java1.dz.dz5.gubenkoDM;

/**
 * Created by Nestor on 04.11.2016.
 */
public class Queen extends Piece  {
    @Override
    protected boolean isRightMove(String fromPosition,String toPosition) {
        //проверяем что координаты находятся на одной вертикали
        if (isOnVertical(fromPosition,toPosition)){
            return true;
        }else if(isOnHorizontal(fromPosition,toPosition)){//проверим есть ли они на одной горизонтали
            return true;
        }else if(isOnDiagonal(fromPosition,toPosition)){//проверим есть ли они на одной диагонали
            return true;
        }else{
            return false;
        }
    }
}
