package person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    private List<room> listRoomInHotel;
    private List<Person> personInHotel;
    public Hotel(){
        this.listRoomInHotel = new ArrayList<>();
        this.personInHotel = new ArrayList<>();
    }

    public List<room> getListRoomInHotel() {
        return listRoomInHotel;
    }

    public void setListRoomInHotel(List<room> listRoomInHotel) {
        this.listRoomInHotel = listRoomInHotel;
    }


    // su ly su kien lien quan den khach thue
    public void getListPersonInHotel(){
        for (room roomAcess: this.listRoomInHotel){
            this.personInHotel.addAll(roomAcess.getPersonInroom());
        }
        System.out.println("Infomation person in hotel: ");
        System.out.printf("%15s%20s%10s\n", "So cccd", "ten", "tuoi");
        for (Person a: personInHotel){
            a.output();
        }
    }
    public void findPersonInHotelForName(String key){
        for (Person p: personInHotel){
            if (p.getName().equals(key)){
                System.out.printf("%15s%20s%10s\n", "So cccd", "ten", "tuoi");
                p.output();
            }
        }
    }
    public void findPersonInHotelForCCCD(String key){
        for (Person p: personInHotel){
            if (p.getCccd().equals(key)){
                System.out.printf("%15s%20s%10s\n", "So cccd", "ten", "tuoi");
                p.output();
            }
        }
    }

    // su ly su kien lien quan den phong

    public void inputARoomImfomation(){
        try {
            System.out.println("Input number room need add imfomation: ");
            int number = new Scanner(System.in).nextInt();
            System.out.println("Input imfomation room in hotel: ");
            for (int i=0;i<number;i++){
                room a = new room();
                a.inputRoomIsNull();
                listRoomInHotel.add(a);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void inputARoomInfomationWithPerson(){
        try {
            System.out.println("Input number room need add imfomation: ");
            int number = new Scanner(System.in).nextInt();
            System.out.println("Input imfomation room in hotel: ");
            for (int i=0;i<number;i++){
                room a = new room();
                a.inputRoomHavePerson();
                listRoomInHotel.add(a);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getInfomationRoomIsNull(){
        System.out.println("List room not have person:");
        for (room roomInHotel: listRoomInHotel){
            if (roomInHotel.getPersonInroom() == null){
                roomInHotel.output();
            }
        }
    }
    public void getInfomationRoomHavePerson(){
        System.out.println("List room not have person:");
        for (room roomInHotel: listRoomInHotel){
            if (roomInHotel.getPersonInroom() != null){
                roomInHotel.output();
            }
        }
    }
    public void getInfomationRoom(){
        System.out.println("List room not have person:");
        for (room roomInHotel: listRoomInHotel){
            roomInHotel.output();
        }
    }
    public void setPersonInfomationForRoomNotPerson(){
        this.getInfomationRoomIsNull();
        System.out.println("input the name of the room want rent: ");
        String nameRoom = new Scanner(System.in).nextLine();
        for (room r: listRoomInHotel){
            if (r.getNameRoom().equals(nameRoom)){
                List<Person> people = new ArrayList<>();
                System.out.print("input number person in rooom: ");
                int number = new Scanner(System.in).nextInt();
                System.out.println("input person imfomation: ");
                for (int i=0;i<number;i++){
                    Person person = new Person();
                    try {
                        person.input();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    people.add(person);
                }
                r.setPersonInroom(people);
            }
        }
    }
}
