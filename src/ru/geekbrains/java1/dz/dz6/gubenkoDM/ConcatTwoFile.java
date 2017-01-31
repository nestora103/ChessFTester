package ru.geekbrains.java1.dz.dz6.gubenkoDM;

import java.io.*;

/**
 * Created by Nestor on 09.11.2016.
 */
public class ConcatTwoFile {
    private FileCreater fFile;
    private FileCreater tFile;
    private String cFile;

    public String getcFile() {
        return cFile;
    }

    public ConcatTwoFile(FileCreater fFile, FileCreater tFile, String cFile) {
        this.fFile=fFile;
        this.tFile=tFile;

        this.cFile=cFile;
    }

    public void concat(){
        File file = new File(cFile);
        FileInputStream fin = null;
        FileOutputStream fout = null;
        File fileBuff=new File(fFile.getFileName());
        byte[] buf;

        try {
            fin = new FileInputStream(fileBuff) ;
            fout = new FileOutputStream(file) ;
            buf=new byte[(int)fileBuff.length()];
            int bufCount=fin.read(buf);
            fout.write(buf,0,bufCount);

        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка открытия первого файла на чтение");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка открытия файла склеивания на запись");
            e.printStackTrace();
        }finally {
            try {
                fin.close();
                fout.close();
            }catch (IOException e){
                System.out.println("Произошла ошибка закрытия файлов");
                e.printStackTrace();
            }

        }
        fileBuff=null;
        fileBuff=new File(tFile.getFileName());

        try {
            fin = new FileInputStream(fileBuff) ;
            fout = new FileOutputStream(file,true) ;
            buf=new byte[(int)fileBuff.length()];
            int bufCount=fin.read(buf);
            fout.write(buf,0,bufCount);

        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка открытия первого файла на чтение");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка открытия файла склеивания на запись");
            e.printStackTrace();
        }finally {
            try {
                fin.close();
                fout.close();
            }catch (IOException e){
                System.out.println("Произошла ошибка закрытия файлов");
                e.printStackTrace();
            }

        }
    }




}
