package aliyar.mostafa.project.objects.view;

import aliyar.mostafa.project.objects.controller.FirstMenu;
import aliyar.mostafa.project.objects.controller.PersonController;
import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PersonController personController;
    public static void main(String[] args) {
        firstQuestion();
    }

    private static void firstQuestion() {
        int numberStudent;
        int numberTeacher;
        System.out.println(Massage.WELCOME.getMessage());
        System.out.println(Massage.GET_NUMBER_STUDENT.getMessage());
        numberStudent = scanner.nextInt();
        System.out.println(Massage.GET_NUMBER_TEACHER.getMessage());
        numberTeacher = scanner.nextInt();
        personController = new PersonController(new Student[numberStudent],new Teacher[numberTeacher]);
        System.out.println("دانشگاه با ضرفیت "+PersonController.students.length+" دانشجو و "+PersonController.teachers.length+ "تعداد استاد ایجاد شد.");
        System.out.println(Massage.LINE.getMessage());
        FirstMenu firstMenu = new FirstMenu(scanner);
        firstMenu.start();
        System.out.println(Massage.LINE.getMessage());
    }
}