package person;

import java.util.Scanner;

public class Person {
    private String name, cccd;
    private int age;
    public Person(){}

    public String getName() {
        return name;
    }

    public String getCccd() {
        return cccd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input() throws  Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name: ");
        this.name = scanner.nextLine();
        System.out.print("input cccd: ");
        this.cccd = scanner.nextLine();
        System.out.print("input age: ");
        this.age = scanner.nextInt();
    }
    public void output(){
        System.out.printf("%15s%20s%10d\n", this.cccd, this.name, this.age);
    }
}
