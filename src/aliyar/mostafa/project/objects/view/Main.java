package aliyar.mostafa.project.objects.view;

import aliyar.mostafa.project.objects.controller.FirstMenu;
import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static Student[] students;

    public static void main(String[] args) {
        firstQuestion();
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
        FirstMenu firstMenu = new FirstMenu(scanner,students,teachers);
        firstMenu.start();
        System.out.println(Massage.LINE.getMessage());
    }
}