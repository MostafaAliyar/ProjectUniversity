package aliyar.mostafa.project.objects.controller;

import aliyar.mostafa.project.objects.model.physical.Persen;
import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import aliyar.mostafa.project.objects.view.Massage;

import java.util.Date;
import java.util.Scanner;

public final class TeacherMenu extends FirstMenu{
    public TeacherMenu(Scanner scanner, Student[] students, Teacher[] teachers) {
        super(scanner, students, teachers);
    }
    protected static void showTeacherMenu() {
        System.out.println(Massage.LINE.getMessage());
        System.out.println(Massage.TEACHER_MENU.getMessage());
        teacherMenu(scanner.nextInt());
    }
    private static void teacherMenu(int index) {
        switch (index) {
            case 0:
                showTeacherMenu();
                break;
            case 1:
                int capacityIndex = Persen.checkCapacity(teachers);
                if (capacityIndex>=0){
                    createTeacher(capacityIndex);
                }else {
                    System.out.println(Massage.NO_CAPACITY_TEACHER.getMessage());
                    showTeacherMenu();
                }
                break;
            case 2:
                //questionForDelete(Status.DELETE.getStatus());
                showTeacherMenu();
                break;
            case 3:
                //questionForUpdate(Status.DELETE.getStatus());
                showTeacherMenu();
                break;
            case 4:
//                showListTeacher();
                break;
            default:
                System.out.println(Massage.ERROR_INPUT.getMessage());
                showTeacherMenu();
                break;
        }
    }
    private static void createTeacher(int index) {
        System.out.println(Massage.TITEL_CREATE_TEACHER.getMessage());
        System.out.println(Massage.GET_NAME_TEACHER.getMessage());
        String name = scanner.next();
        System.out.println(Massage.GET_COD_MELI_TEACHER.getMessage());
        int codeMeli = scanner.nextInt();
        System.out.println(Massage.GET_YEAR_TEACHER.getMessage());
        int year=scanner.nextInt();
        System.out.println(Massage.GET_MONTH_TEACHER.getMessage());
        int month=scanner.nextInt();
        System.out.println(Massage.GET_DAY_TEACHER.getMessage());
        int day=scanner.nextInt();
        Date birthday = new Date(year,month,day);
        teachers [index] = new Teacher(name,codeMeli,birthday);
        showTeacherMenu();
    }

}
