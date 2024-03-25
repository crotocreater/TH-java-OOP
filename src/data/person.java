package data;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.Serializable;
import java.util.Scanner;

public class person implements Serializable {
    private String name, gender;
    private int age;
    public person(){}

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name: ");
        this.name = scanner.nextLine();
        System.out.print("input gender: ");
        this.gender = scanner.nextLine();
        System.out.print("input age: ");
        this.age = scanner.nextInt();
    }
    public void output(){
        System.out.printf("%20s%10s%10d\n", this.name, this.gender, this.age);
    }
}
