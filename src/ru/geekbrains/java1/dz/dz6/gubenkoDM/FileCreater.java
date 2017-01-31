package ru.geekbrains.java1.dz.dz6.gubenkoDM;

import java.io.*;
import java.util.Random;

/**
 * Created by Nestor on 09.11.2016.
 */
public class FileCreater {
    private int fileSize;

    public String getFileName() {
        return fileName;
    }

    private String fileName;
    private final int FILE_SIMB_NUM=33;

    public  FileCreater(int fileSize,String fileName) {
        this.fileSize=fileSize;
        this.fileName=fileName;
    }

    private void fillData(byte[] data){
        for (int i=0;i<data.length;i++){
            data[i]=(byte)(i+FILE_SIMB_NUM);
        }
    }


    public void fillFile() {
        if (fileName.isEmpty()){
            System.out.println("Вы ввели пустое имя файла");
            return;
        }
        //создали объект файла
        File file=new File(fileName);
        //объявили поток вывода байт для работы с файлом
        FileOutputStream fOut=null;
        byte[] data=new byte[fileSize];
        fillData(data);
        //пробуем открыть файл для записи в него
        //если не получится обработаем
        try {
            fOut = new FileOutputStream(file);
            //производим запись в файл единым буфером
            fOut.write(data);
        } catch (IOException e) {
            System.out.println("Ошибка записи  файла "+fileName);
            //выводим трассировку стека
            e.printStackTrace();
        }finally{
            try {
                //закроем поток вывода
                fOut.close();
                //освободим буферы
                fOut.flush();
                System.out.println("Файл ".concat(fileName).concat(" заполнен"));
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла "+fileName);
                e.printStackTrace();
            }
        }





    }
}
