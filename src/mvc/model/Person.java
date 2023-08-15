package ss02_vong_lap.mvc.model;

import java.util.Scanner;

public abstract class Person {
    private int id;
    private String name;
    private String dayOfBirth;
    private String gender;

    public Person() {}

    public Person(int id, String name, String dayOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    Scanner scanner = new Scanner(System.in);
    public void setInformation() {
//        System.out.println("Nhập id: ");
//        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        dayOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        gender = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
