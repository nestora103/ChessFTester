package ru.geekbrains.java1.dz.dz6.gubenkoDM;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Nestor on 09.11.2016.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        FileCreater fFile;
        FileCreater tFile;
        System.out.println("Введите имя первого файла без расширения");
        fFile=new FileCreater(new Random().nextInt(101),sc.nextLine());
        fFile.fillFile();
        System.out.println("Введите имя второго файла без расширения");
        tFile=new FileCreater(new Random().nextInt(101),sc.nextLine());
        tFile.fillFile();


        System.out.println("Введите имя файла без расширения соединяющего в себе первые 2");
        ConcatTwoFile concTwoF=new ConcatTwoFile(fFile,tFile,sc.nextLine());
        concTwoF.concat();

        System.out.println("Введите слово для поиска в ранее сформированном файле");
        WordSearcher ws=new WordSearcher(sc.nextLine(),concTwoF.getcFile());
        if (ws.search()){
            System.out.println("Введенное Вами слово присутствует в файле");
        }else{
            System.out.println("Введенное Вами слово отсутствует в файле");
        }
    }
}
