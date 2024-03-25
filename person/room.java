package person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class room {
    private List<Person> personInroom;
    private String nameRoom, loaiPhong;

    private int numberDay;

    private double wageRoom;
    public room(){
        personInroom = new ArrayList<>();
    }
    public room(room a){

    }
    public List<Person> getPersonInroom() {
        return personInroom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public double getWageRoom() {
        return wageRoom;
    }

    public void setWageRoom(double wageRoom) {
        this.wageRoom = wageRoom;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public void setPersonInroom(List<Person> person) {
        this.personInroom = person;
    }

    public int getNumberDay() {
        return numberDay;
    }

    public void setNumberDay(int numberDay) {
        this.numberDay = numberDay;
    }

    public double getWageMoney(){
        return this.wageRoom*this.numberDay;
    }
    public void inputRoomHavePerson() throws  Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name room: ");
        this.nameRoom = scanner.nextLine();
        System.out.print("input loai phong: ");
        this.loaiPhong = scanner.nextLine();
        if (this.loaiPhong == "A"){
            this.wageRoom = 500;
        } else if (this.loaiPhong == "B") {
            this.wageRoom = 300;
        } else if (this.loaiPhong == "C") {
            this.wageRoom = 100;
        }else {
            System.out.print("Nhap gia phong: ");
            this.wageRoom = scanner.nextDouble();
        }
        System.out.print("input number day want get room: ");
        this.numberDay = scanner.nextInt();
        System.out.print("input number person in rooom: ");
        int number = scanner.nextInt();
        System.out.println("input person imfomation: ");
        for (int i=0;i<number;i++){
            Person person = new Person();
            person.input();
            personInroom.add(person);
        }
        System.out.println("Thanh cong");
    }
    public void inputRoomIsNull(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name room: ");
        this.nameRoom = scanner.nextLine();
        System.out.print("input loai phong: ");
        this.loaiPhong = scanner.nextLine();
        if (this.loaiPhong == "A"){
            this.wageRoom = 500;
        } else if (this.loaiPhong == "B") {
            this.wageRoom = 300;
        } else if (this.loaiPhong == "C") {
            this.wageRoom = 100;
        }else {
            System.out.print("Nhap gia phong: ");
            this.wageRoom = scanner.nextDouble();
        }
        this.personInroom = null;
    }
    public void outputRoomHavePerson(){
        System.out.printf("%20s%10s%20.1f\n%5d", this.nameRoom , this.loaiPhong , this.wageRoom, this.numberDay);
        System.out.printf("%15s%20s%10s\n", "So cccd", "ten", "tuoi");
        for (Person p:personInroom){
            p.output();
        }
    }
    public void output(){
        System.out.printf("%20s%10s%20.1f\n", this.nameRoom , this.loaiPhong , this.wageRoom);
    }
}
