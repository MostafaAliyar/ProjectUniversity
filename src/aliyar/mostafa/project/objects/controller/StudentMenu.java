package aliyar.mostafa.project.objects.controller;

import aliyar.mostafa.project.objects.model.physical.Persen;
import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import aliyar.mostafa.project.objects.view.Massage;

import java.util.Date;
import java.util.Scanner;

public final class StudentMenu extends FirstMenu{
    StudentMenu(Scanner scanner , Student [] students, Teacher[]teachers) {
        super(scanner, students, teachers);
    }
    public static void showStudentMenu() {
        System.out.println(Massage.LINE.getMessage());
        System.out.println(Massage.STUDENT_MENU.getMessage());
        studentMenu(scanner.nextInt());
    }
    private static void studentMenu(int index) {
        switch (index) {
            case 0:
                FirstMenu.showSupMenu(index);
                break;
            case 1:
                int capacityIndex = Persen.checkCapacity(students);
                if (capacityIndex>=0){
                    createStudent(capacityIndex);
                }else {
                    System.out.println(Massage.NO_CAPACITY_STUDENT.getMessage());
                    showStudentMenu();
                }
                break;
            case 2:
                questionForChang(Status.DELETE.getStatus());
                showStudentMenu();
                break;
            case 3:
                questionForChang(Status.UPDATE.getStatus());
                showStudentMenu();
                break;
            case 4:
                showListStudent();
                showStudentMenu();
                break;
            default:
                System.out.println(Massage.ERROR_INPUT.getMessage());
                showStudentMenu();
                break;
        }
    }
    private static void showListStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(i+")"+ students[i].getName());
            }
        }
    }
    private static void questionForChang(boolean status ) {
        System.out.println(Massage.STUDENT_MENU_DU.getMessage());
        switch (scanner.nextInt()) {
            case 1:
                System.out.println(Massage.GET_COD_MELI_STUDENT.getMessage());
                int code = scanner.nextInt();
                if (status==Status.DELETE.getStatus()){
                    deleteStudent(code);
                } else if (status==Status.UPDATE.getStatus()) {
                    updateStudent(code);
                }
                break;
            case 2:
                System.out.println(Massage.GET_NAME_STUDENT.getMessage());
                String name =scanner.next();
                if (status==Status.DELETE.getStatus()){
                    deleteStudent(name);
                } else if (status==Status.UPDATE.getStatus()) {
                    updateStudent(name);
                }
                break;
            case 0 :
                showStudentMenu();
                break;
        }
    }
    private static void updateStudent(int codeMeli) {
        boolean accept = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null&&students[i].getCodMeli()==codeMeli) {
                createStudent(i);
                accept = true;
            }
        }
        if (accept) {
            System.out.println(Massage.UPDATE_STUDENT.getMessage());
        }else {
            System.out.println(Massage.ERROR_404_STUDENT.getMessage());
            showStudentMenu();
        }
    }
    private static void updateStudent(String name) {
        boolean accept = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null&&students[i].getName().equals(name)) {
                createStudent(i);
                accept = true;
            }
        }
        if (accept) {
            System.out.println(Massage.UPDATE_STUDENT.getMessage());
        }else {
            System.out.println(Massage.ERROR_404_STUDENT.getMessage());
            showStudentMenu();
        }
    }
    private static void deleteStudent(String name) {
        boolean accept = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null&&students[i].getName().equals(name)) {
                    students[i] = null;
                    accept=true;
            }
        }
        if (accept) {
            System.out.println(Massage.DELETE_STUDENT.getMessage());
        }else {
            System.out.println(Massage.ERROR_404_STUDENT.getMessage());
        }
        showStudentMenu();
    }
    private static void deleteStudent(int codMeli) {
        boolean accept = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null&&students[i].getCodMeli()==codMeli) {
                students[i] = null;
                accept=true;
            }
        }
        if (accept) {
            System.out.println(Massage.DELETE_STUDENT.getMessage());
        }else {
            System.out.println(Massage.ERROR_404_STUDENT.getMessage());
        }
        showStudentMenu();
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

