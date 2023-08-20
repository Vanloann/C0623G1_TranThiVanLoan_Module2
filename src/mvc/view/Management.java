package mvc.view;

import mvc.controller.StudentController;
import mvc.controller.TeacherController;
import mvc.model.Student;
import mvc.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    private final Scanner scanner =new Scanner(System.in);

    private final TeacherController teacherController = new TeacherController();

    private final StudentController studentController = new StudentController();

    public void showMenu() {
        System.out.println("----------MENU----------");
        System.out.println("1. Add Information");
        System.out.println("2. Remove Information");
        System.out.println("3. Display Information");
        System.out.println("4. Exit");
    }

    public void showObjectMenu() {
        System.out.println("1. Teacher");
        System.out.println("2. Student");
    }

    public int chooseFunction() {
        int choice = 0;
        this.showMenu();
        do {
            try {
                System.out.println("Please enter function: ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid function!");
            }
        } while (choice < 1 || choice > 4);

        if (choice == 4) {
            System.exit(4);
        }
        return choice;
    }

    public int chooseObject() {
        int option = 0;
        this.showObjectMenu();
        do {
            try {
                System.out.println("Please choose object: ");
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid object!");
            }
        } while (option < 1 || option > 2);
        return option;
    }

    public Teacher inputTeacherInfor() {
        Teacher teacher = new Teacher();
        System.out.println("Enter ID of teacher: ");
        teacher.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name of teacher: ");
        teacher.setName(scanner.nextLine());
        System.out.println("Enter Birthday of teacher: ");
        teacher.setDayOfBirth(scanner.nextLine());
        System.out.println("Enter gender of teacher: ");
        teacher.setGender(scanner.nextLine());
        System.out.println("Enter speciality of teacher: ");
        teacher.setSpeciality(scanner.nextLine());
        return teacher;
    }

    public Student inputStudentInfor() {
        Student student = new Student();
        System.out.println("Enter ID of student: ");
        student.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name of student: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter Birthday of student: ");
        student.setDayOfBirth(scanner.nextLine());
        System.out.println("Enter gender of student: ");
        student.setGender(scanner.nextLine());
        System.out.println("Enter className of student: ");
        student.setClassName(scanner.nextLine());
        System.out.println("Enter point of student: ");
        student.setPoint(Double.parseDouble(scanner.nextLine()));
        return student;
    }

    public int inputID() {
        System.out.println("Please enter ID: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void manage() {
        int choice;
        int option;
        do {
            choice = this.chooseFunction();
            option = this.chooseObject();
            switch (choice) {
                case 1:
                    if (option == 1) {
                        this.teacherController.addTeacher(this.inputTeacherInfor());
                    } else {
                        this.studentController.addStudent(this.inputStudentInfor());
                    }
                    break;
                case 2:
//                    this.chooseObject();
                    if (option == 1) {
                        this.teacherController.removeTeacher(this.inputID());
                    } else {
                        this.studentController.removeStudent(this.inputID());
                    }
                    break;
                case 3:
//                    this.chooseObject();
                    if (option == 1) {
                        List<Teacher> teachers = this.teacherController.showTeacher();
                        for (Teacher teacher : teachers) {
                            System.out.println(teacher);
                        }
                    } else {
                        List<Student> students = this.studentController.showStudent();
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 4);
    }

}
