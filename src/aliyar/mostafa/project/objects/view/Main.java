package aliyar.mostafa.project.objects.view;

import aliyar.mostafa.project.objects.controller.LessonController;
import aliyar.mostafa.project.objects.controller.PersonController;
import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PersonController personController;
    static LessonController lessonController;
    public static void main(String[] args) {
        firstQuestion();
    }

    private static void firstQuestion() {
        int numberStudent;
        int numberTeacher;
        int numberLesson;
        System.out.println(Massage.WELCOME.getMessage());
        System.out.println(Massage.GET_NUMBER_STUDENT.getMessage());
        numberStudent = scanner.nextInt();
        System.out.println(Massage.GET_NUMBER_TEACHER.getMessage());
        numberTeacher = scanner.nextInt();
        System.out.println(Massage.GET_NUMBER_LESSON.getMessage());
        numberLesson = scanner.nextInt();
        personController = new PersonController(new Student[numberStudent],new Teacher[numberTeacher]);
        lessonController = new LessonController(numberLesson);
        System.out.println("دانشگاه با ضرفیت "+PersonController.students.length+" دانشجو و "+PersonController.teachers.length+ " استاد و "+numberLesson+"درس برای این ترم ایجاد شد.");
        System.out.println(Massage.LINE.getMessage());
        FirstMenu firstMenu = new FirstMenu(scanner);
        firstMenu.start();
        System.out.println(Massage.LINE.getMessage());
    }
}