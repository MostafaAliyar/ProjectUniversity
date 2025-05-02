package aliyar.mostafa.project.objects.view;

import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import aliyar.mostafa.project.objects.physical.Persen;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static Student[] students;
    private static final boolean STATUS_DELETE = false;
    private static final boolean STATUS_UPDATE = true;

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
                showTeacherMenu();
                break;

        }
    }

    private static void showTeacherMenu() {
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
                createTeacher();
                break;
            case 2:
//                deleteTeacher();
                break;
            case 3:
//                editTeacher();
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

    private static void createTeacher() {
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
        Teacher newTeacher = new Teacher(name,codeMeli,birthday);

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
            case 2:
                questionForChang(STATUS_DELETE);
                showStudentMenu();
                break;
            case 3:
                questionForChang(STATUS_UPDATE);
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
                if (status==STATUS_DELETE){
                    deleteStudent(scanner.nextInt());
                } else if (status==STATUS_UPDATE) {
                    updateStudent(scanner.nextInt());
                }
                break;
            case 2:
                System.out.println(Massage.GET_NAME_STUDENT.getMessage());
                deleteStudent(scanner.next());
                if (status==STATUS_DELETE){
                    deleteStudent(scanner.nextLine());
                } else if (status==STATUS_UPDATE) {
                    updateStudent(scanner.nextLine());
                }
                break;
            case 0 :
                showStudentMenu();
                break;
        }
    }

    private static void updateStudent(int codeMeli) {
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null){
                if (students[i].getCodMeli()==codeMeli) {
                    createStudent(i);
                    System.out.println(Massage.UPDATE_STUDENT.getMessage());
                    return;
                }else {
                    System.out.println("فیلد "+i+" : "+Massage.ERROR_404_STUDENT.getMessage());
                }
            }
        }
        showStudentMenu();
    }

    private static void updateStudent(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null){
                if (students[i].getName().equals(name)) {
                    createStudent(i);
                    System.out.println(Massage.UPDATE_STUDENT.getMessage());
                    return;
                }else {
                    System.out.println("فیلد "+i+" : "+Massage.ERROR_404_STUDENT.getMessage());
                }

            }
        }
        showStudentMenu();
    }

    private static void deleteStudent(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null) {
                if (students[i].getName().equals(name)) {
                    students[i] = null;
                    System.out.println(Massage.DELETE_STUDENT.getMessage());
                }else {
                    System.out.println("فیلد "+i+" : "+Massage.ERROR_404_STUDENT.getMessage());
                }
            }
        }
        showStudentMenu();
    }
    private static void deleteStudent(int codMeli) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getCodMeli()==codMeli) {
                    students[i] = null;
                    System.out.println(Massage.DELETE_STUDENT.getMessage());
                    return;
                }else {
                    System.out.println("فیلد "+i+" : "+Massage.ERROR_404_STUDENT.getMessage());
                }
            }
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