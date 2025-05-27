package aliyar.mostafa.project.objects.controller;

import aliyar.mostafa.project.objects.model.lessons.Lesson;
import aliyar.mostafa.project.objects.model.lessons.TypeLesson;
import aliyar.mostafa.project.objects.view.Massage;

import java.util.Scanner;

import static aliyar.mostafa.project.objects.controller.LessonMenu.showLessonsMenu;


public class LessonController {
    public static Lesson[] lessons;
    private static int indexIDLesson = 0;
    private static int indexIDStudent = 0;
    private static int indexIDTeacher = 0;
    public LessonController(int numberOfLessons) {
        lessons = new Lesson[numberOfLessons];
    }

    public static int checkCapacity(Lesson[] lessons) {
        for (int i = 0; i < lessons.length; i++) {
            if (lessons[i]==null)
                return i;
        }
        return -1;
    }
    public static void createLesson (Scanner scanner,int i,TypeLesson typeLesson){
        if (i==-1){
            System.out.println(Massage.NO_CAPACITY_LESSON.getMessage());
        }else {
            System.out.println(Massage.GET_NAME_LESSON.getMessage());
            String name = scanner.next();
            LessonController.lessons[i] = new Lesson(3,name,LessonController.getID(new Lesson()), typeLesson);
            System.out.println(Massage.CREATE_LESSON_DONE.getMessage());
        }
        showLessonsMenu();
    }

    public static int getID(Object object) {
        String nameClass = object.getClass().getSimpleName();
        System.out.println(nameClass);
        return switch (nameClass) {
            case "Lesson" -> Integer.parseInt("10" + indexIDLesson++);
            case "Student" -> Integer.parseInt("20" + indexIDStudent++);
            case "Teacher" -> Integer.parseInt("30" + indexIDTeacher++);
            default -> 0;
        };
    }

    public static void deleteLesson(Scanner scanner) {
        System.out.println(Massage.GET_NAME_LESSON.getMessage());
        String name = scanner.next();
        boolean status = false;
        for (int i=0 ;i<LessonController.lessons.length;i++){
            if (LessonController.lessons[i].getName().equals(name)){
                System.out.println("درس "+LessonController.lessons[i].getName()+"با کد "+LessonController.lessons[i].getId()+" حذف شد!");
                LessonController.lessons[i]= null;
                status = true;
                return;
            }
        }
        if (!status){
            System.out.println(Massage.ERROR_404_LESSON.getMessage());
        }
    }
    static void createLessonBayTitle(TypeLesson typeLesson, Scanner scanner) {
        int i = LessonController.checkCapacity(LessonController.lessons);
        LessonController.createLesson(scanner,i,typeLesson);
        showLessonsMenu();
    }
    public static void showListLesson(Lesson[] lessons){
        for (int i = 0; i < lessons.length; i++) {
            if (lessons[i]!=null){
                System.out.println(i+")"+lessons[i].getName()+"\t با کد"+lessons[i].getId());
            }
        }
    }
}
