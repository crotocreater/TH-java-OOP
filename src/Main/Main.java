package Main;

import data.town;
import dataFile.fileIO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fileIO fIO = new fileIO();
        town tn = new town(fIO.outputFile());
        while (true){
            System.out.println("lua chon: " +
                    "\n1.Them" +
                    "\n2.Hien thi" +
                    "\n3.thoat");
            int i = new Scanner(System.in).nextInt();
            if(i==1)  {
                try {
                    tn.input();
                }catch (Exception e){
                    e.printStackTrace();
                }
            } else if (i==2) {
                tn.out();
            } else if (i==3) {
                fIO.inputFile(tn);
                return;
            }else {
                continue;
            }
        }
    }
}