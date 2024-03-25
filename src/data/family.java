package data;

import java.io.Serializable;
import java.sql.SQLSyntaxErrorException;
import java.util.*;

public class family implements Serializable {
    private List<person> listTV;
    private String addressHouse;

    public family(){
        this.listTV = new ArrayList<>();
    }

    public List<person> getListTV() {
        return listTV;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public void setListTV(List<person> listTV) {
        this.listTV = listTV;
    }
    public void input() throws Exception{
        System.out.print("nhap dia chi nha: ");
        this.addressHouse = new Scanner(System.in).nextLine();
        System.out.print("Nhap so thanh vien trong gia dinh: ");
        int number = new Scanner(System.in).nextInt();
        for (int i =0;i<number;i++){
            person p = new person();
            p.input();
            this.listTV.add(p);
        }
    }
    public void output(){
        System.out.println("thong tin gia dinh: ");
        System.out.println("Dia chi: "+ this.addressHouse);
        Comparator<person> comp = new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                if (o1.getAge()>o2.getAge()){
                    return 1;
                }else return -1;
            }
        };
        Collections.sort(this.listTV,comp);
        System.out.printf("%20s%10s%10s\n", "ten", "gioi tinh", "tuoi");
        for (person p:this.listTV){
            p.output();
        }
    }
}

