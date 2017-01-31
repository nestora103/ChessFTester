package ru.geekbrains.java1.dz.dz6.gubenkoDM;

import java.io.*;

/**
 * Created by Nestor on 09.11.2016.
 */
public class WordSearcher {
    private String subStr;
    private String sourceFile;
    public WordSearcher(String s, String s1) {
        subStr=s;
        sourceFile=s1;
    }

    public boolean search(){
        FileInputStream fin = null;
        byte[] buf;

        try {
            fin = new FileInputStream(sourceFile) ;
            buf=new byte[(int)new File(sourceFile).length()];
            int bufCount=fin.read(buf);
            for(int i=0;i<bufCount;i++){
                if ((char)buf[i]==subStr.charAt(0)){


                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка открытия первого файла на чтение");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка открытия файла склеивания на запись");
            e.printStackTrace();
        }finally {
            try {
                fin.close();

            }catch (IOException e){
                System.out.println("Произошла ошибка закрытия файлов");
                e.printStackTrace();
            }

        }
        return true;
    }
}
