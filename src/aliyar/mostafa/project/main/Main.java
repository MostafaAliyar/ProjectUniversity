package aliyar.mostafa.project.main;

import aliyar.mostafa.project.objects.lagical.Massage;
import aliyar.mostafa.project.objects.physical.Persen;
import aliyar.mostafa.project.objects.physical.Student;
import aliyar.mostafa.project.objects.physical.Teacher;

import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static Student[] students;

    public static void main(String[] args) {
        firstQuestion();
        /*System.out.println(Massage.CREATE_LESSONS.getMessage());
        number = scanner.nextInt();
        switch (number){
            case 1:
                showListPublic();
                break;
            case 2:
                showListComputer();
                break;
            case 3:
                showListArchitectur();
                break;
        }*/
    }

    private static void firstQuestion() {
        int number;
        System.out.println(Massage.WELCOME.getMessage());
        System.out.println(Massage.GET_NUMBER_STUDENT.getMessage());
        number = scanner.nextInt();
        students = new Student[number];
        System.out.println(Massage.GET_NUMBER_TEACHER.getMessage());
        number = scanner.nextInt();
        Teacher[] teachers = new Teacher[number];
        System.out.println("دانشگاه با ضرفیت "+students.length+" دانشجو و "+teachers.length+ "تعداد استاد ایجاد شد.");
        System.out.println(Massage.LINE.getMessage());
        showMainMenu();
        System.out.println(Massage.LINE.getMessage());
    }

    private static void showMainMenu() {
        System.out.println(Massage.TITEL_MAIN_MENU.getMessage());
        showSupMenu(scanner.nextInt());
    }

    private static void showSupMenu(int index) {
        switch (index) {
            case 0:
                showMainMenu();
                break;
            case 1:
                showStudentMenu();
                break;
            case 2:
                break;

        }
    }

    private static void showStudentMenu() {
        System.out.println(Massage.LINE.getMessage());
        System.out.println(Massage.STUDENT_MENU.getMessage());
        studentMenu(scanner.nextInt());
    }

    private static void studentMenu(int index) {
        switch (index) {
            case 0:
                showSupMenu(1);
                break;
            case 1:
                int capacityIndex =Persen.checkCapacity(students);
                if (capacityIndex>=0){
                    createStudent(capacityIndex);
                }else {
                    System.out.println(Massage.NO_CAPACITY_STUDENT.getMessage());
                    showStudentMenu();
                }
                break;

        }
    }



    private static void createStudent(int index) {
        System.out.println(Massage.LINE.getMessage());
        System.out.println(Massage.GET_NAME_STUDENT.getMessage());
        String name=scanner.next();
        scanner.nextLine();
        System.out.println(Massage.GET_COD_MELI_STUDENT.getMessage());
        int codMeli=scanner.nextInt();
        System.out.println(Massage.GET_YEAR_STUDENT.getMessage());
        int year=scanner.nextInt();
        System.out.println(Massage.GET_MONTH_STUDENT.getMessage());
        int month=scanner.nextInt();
        System.out.println(Massage.GET_DAY_STUDENT.getMessage());
        int day=scanner.nextInt();
        Date date = new Date(year,month,day);
        students[index]=new Student(name,codMeli,date);
        System.out.println(Massage.CREATE_STUDENT_DONE.getMessage());
        showStudentMenu();
    }
}