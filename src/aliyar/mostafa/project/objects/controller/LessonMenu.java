package aliyar.mostafa.project.objects.controller;

import aliyar.mostafa.project.objects.model.lessons.TypeLesson;
import aliyar.mostafa.project.objects.view.FirstMenu;
import aliyar.mostafa.project.objects.view.Massage;
import java.util.Scanner;

import static aliyar.mostafa.project.objects.controller.LessonController.createLessonBayTitle;
import static aliyar.mostafa.project.objects.controller.LessonController.showListLesson;

public class LessonMenu extends FirstMenu {
    public LessonMenu(Scanner scanner) {
        super(scanner);
    }
    public static void showLessonsMenu() {
        System.out.println(Massage.LINE.getMessage());
        System.out.println(Massage.LESSONS_MENU.getMessage());
        lessonsMenu(scanner.nextInt());
    }
    private static void lessonsMenu(int index) {
        switch (index) {
            case 0:
                FirstMenu.showSupMenu(index);
                break;
            case 1:
                System.out.println(Massage.LESSONS_SELECT_TITLE_MENU.getMessage());
                showSelectTitleLesson(scanner.nextInt());

                break;
            case 2:
                LessonController.deleteLesson(scanner);
                showLessonsMenu();
                break;
            case 3:
                showListUpdeate(scanner);
                showLessonsMenu();
                break;
            case 4:
                showListLesson(LessonController.lessons);
                showLessonsMenu();
                break;
            default:
                System.out.println(Massage.ERROR_INPUT.getMessage());
                showLessonsMenu();
                break;
        }
    }
    /*LESSONS_SELECT_UPDATE_MENU("منو تغیرات درس :" + System.lineSeparator() +
            "1) تعریف درس برای استاد" + System.lineSeparator() +
            "2) مدیریت ضرفیت کلاس" + System.lineSeparator() +
            "0)بازکشت به منو قبلی");*/
    private static void showListUpdeate(Scanner scanner) {
//        System.out.println(Massage.LESSONS_SELECT_UPDATE_MENU.getMessage());
//        switch (scanner.nextInt()){
//            case 1:
//                if (LessonController.lessons[1])
//              System.out.println(Massage.SELECT_LESSON_IN_LIST);
//        }


    }

    private static void showSelectTitleLesson(int index) {
        switch (index){
            case 0:
                showLessonsMenu();
                break;
            case 1:
                createLessonBayTitle(TypeLesson.PUBLIC,scanner);
                break;
            case 2:
                createLessonBayTitle(TypeLesson.COMPUTER,scanner);
                break;
            case 3:
                createLessonBayTitle(TypeLesson.ARCHITECTED,scanner);
                break;
        }
    }




}
