package data;

import java.io.Serializable;
import java.util.*;

public class town implements Serializable {
    private  List<family> list;

    public town(List<family> list) {
        this.list = list;
    }

    public town() {
        this.list = new ArrayList<>();
    }
    public town(Object a){
        town b = (town) a;
        this.list = b.getList();
    }

    public List<family> getList() {
        return list;
    }

    public void setList(List<family> list) {
        this.list = list;
    }
    public void input() throws Exception {
        System.out.print("Nhap so luong gia dinh trong khu pho: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhap thong tin cac ho gia dinh: \n");
        for (int i=0;i< n;i++){
            family a = new family();
            a.input();
            this.list.add(a);
        }
        System.out.println("Thanh cong");
    }
    public void out(){
        System.out.println("thong tin cac ho gia dinh trong khu pho: ");
        for (family family: list){
            family.output();
        }
    }
}
