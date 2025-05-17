package aliyar.mostafa.project.objects.controller;

import aliyar.mostafa.project.objects.model.physical.Persen;
import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import aliyar.mostafa.project.objects.view.Massage;

import java.util.Date;
import java.util.Scanner;


public class PersonController {
    public static Student[] students;
    public static Teacher[] teachers;
    public PersonController(Student[] students, Teacher[] teachers){
      PersonController.students = students;
      PersonController.teachers = teachers;
    }
    private static final int CODE_MELI = 1;
    private static final int NAME = 2;
    public static int checkCapacity(Persen[] persen) {
        for (int i = 0; i < persen.length; i++) {
            if (persen[i]==null)
                return i;
        }
        return -1;
    }
    protected static void questionForChange(boolean status, Scanner scanner, Persen[] persen) {
        System.out.println(Massage.STUDENT_MENU_DU.getMessage());
        switch (scanner.nextInt()) {
            case CODE_MELI:
                System.out.println(Massage.GET_COD_MELI_STUDENT.getMessage());
                int code = scanner.nextInt();
                if (status==Status.DELETE.getStatus()){// میخوایم دیلیت کنیم یا آپدیت؟
                    if (deletePerson(code,persen)) {// دیلیت شد یانه؟
                        System.out.println(Massage.DELETE_PERSON.getMessage());
                    }else {
                        System.out.println(Massage.ERROR_404_PERSON.getMessage());
                    }
                    StudentMenu.showStudentMenu();
                } else if (status==Status.UPDATE.getStatus()) {
                    if (updatePerson(code,scanner,persen)) {//آپدیت شد یا نه ؟
                        System.out.println(Massage.UPDATE_PERSON.getMessage());
                    }else {
                        System.out.println(Massage.ERROR_404_PERSON.getMessage());
                        StudentMenu.showStudentMenu();// به دلیل اینکه در زمان آپدیت از متد createStudent استفاده میشه دز اینجا منو رو آوردیم
                    }
                }
                break;
            case NAME:
                System.out.println(Massage.GET_NAME_STUDENT.getMessage());
                String name =scanner.next();
                if (status==Status.DELETE.getStatus()){// میخوایم دیلیت کنیم یا آپدیت؟
                    if (deletePerson(name,persen)) {//دیلیت شد یا نه ؟
                        System.out.println(Massage.DELETE_PERSON.getMessage());
                    }else {
                        System.out.println(Massage.ERROR_404_PERSON.getMessage());
                    }
                    StudentMenu.showStudentMenu();
                } else if (status==Status.UPDATE.getStatus()) {
                    if (updatePerson(name,scanner,persen)) {//آپدیت شد یا نه ؟
                        System.out.println(Massage.UPDATE_PERSON.getMessage());
                    }else {
                        System.out.println(Massage.ERROR_404_PERSON.getMessage());
                        StudentMenu.showStudentMenu();// به دلیل اینکه در زمان آپدیت از متد createStudent استفاده میشه دز اینجا منو رو آوردیم
                    }

                }
                break;
            case 0 :
                StudentMenu.showStudentMenu();
                break;
        }
    }
    private static boolean updatePerson(int codeMeli, Scanner scanner, Persen[] persons) {
        boolean accept = false;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]!=null&&persons[i].getCodMeli()==codeMeli) {
                if(persons[i].getClass().getName().equals(Student.class.getName())){// بررسی میکنه جنس کلاس چیه
                    createStudent(i,scanner);
                } else if (persons[i].getClass().getName().equals(Teacher.class.getName())) {
                    createTeacher(i,scanner);
                }
                accept = true;
            }
        }
        return accept;
    }

    private static boolean updatePerson(String name, Scanner scanner, Persen[] persons) {
        boolean accept = false;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]!=null&&persons[i].getName().equals(name)) {// بررسی میکنه که متغیر null نباشه ونامش با نام داخل شی برایر باشه
                if(persons[i].getClass().getName().equals(Student.class.getName())){// بررسی میکنه جنس کلاس چیه
                    createStudent(i,scanner);
                } else if (persons[i].getClass().getName().equals(Teacher.class.getName())) {
                    createTeacher(i,scanner);
                }
                accept = true;
            }
        }
        return accept;
    }
    private static boolean deletePerson(String name, Persen[] persons) {
        boolean accept = false;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]!=null&&persons[i].getName().equals(name)) {
                persons[i] = null;
                accept=true;
            }
        }
        return accept;
    }
    private static boolean deletePerson(int codMeli , Persen[] persons) {
        boolean accept = false;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i]!=null&&persons[i].getCodMeli()==codMeli) {
                persons[i] = null;
                accept=true;
            }
        }
        return accept;
    }

    protected static void createStudent(int index ,Scanner scanner) {
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
        StudentMenu.showStudentMenu();
    }
    protected static void createTeacher(int index, Scanner scanner) {
        System.out.println(Massage.LINE.getMessage());
        System.out.println(Massage.GET_NAME_TEACHER.getMessage());
        String name=scanner.next();
        scanner.nextLine();
        System.out.println(Massage.GET_COD_MELI_TEACHER.getMessage());
        int codMeli=scanner.nextInt();
        System.out.println(Massage.GET_YEAR_TEACHER.getMessage());
        int year=scanner.nextInt();
        System.out.println(Massage.GET_MONTH_TEACHER.getMessage());
        int month=scanner.nextInt();
        System.out.println(Massage.GET_DAY_TEACHER.getMessage());
        int day=scanner.nextInt();
        Date date = new Date(year,month,day);
        students[index]=new Student(name,codMeli,date);
        System.out.println(Massage.CREATE_TEACHER_DONE.getMessage());
        TeacherMenu.showTeacherMenu();
    }
    public static void showListPerson(Persen[] persons) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                System.out.println(i+")"+ persons[i].getName());
            }
        }
    }


}
