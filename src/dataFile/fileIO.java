package dataFile;

import data.town;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fileIO {
    String filePath = "E:\\java\\IdeaProjects\\Java_code\\baitap1\\BT4\\data\\data.dat";
    public void inputFile(town a){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.filePath))){
            objectOutputStream.writeObject(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public town outputFile() {
       town t = new town();
       try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.filePath))){
           t = (town) ois.readObject();
       }catch (Exception e){
           e.printStackTrace();
       }
       return t;
    }
}
