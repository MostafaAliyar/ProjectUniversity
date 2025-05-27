package aliyar.mostafa.project.objects.view;

import aliyar.mostafa.project.objects.controller.PersonController;
import aliyar.mostafa.project.objects.controller.Status;

import java.util.Scanner;

import static aliyar.mostafa.project.objects.controller.PersonController.showListPerson;

public final class TeacherMenu extends FirstMenu {
    public TeacherMenu(Scanner scanner) {
        super(scanner);
    }
    public static void showTeacherMenu() {
        System.out.println(Massage.LINE.getMessage());
        System.out.println(Massage.TEACHER_MENU.getMessage());
        teacherMenu(scanner.nextInt());
    }
    private static void teacherMenu(int index) {
        switch (index) {
            case 0:
                showMainMenu();
                break;
            case 1:
                int capacityIndex = PersonController.checkCapacity(PersonController.teachers);
                if (capacityIndex>=0){
                    PersonController.createTeacher(capacityIndex,scanner);
                }else {
                    System.out.println(Massage.NO_CAPACITY_TEACHER.getMessage());
                    showTeacherMenu();
                }
                break;
            case 2:
                PersonController.questionForChange(Status.DELETE.getStatus(),scanner,PersonController.teachers);
                showTeacherMenu();
                break;
            case 3:
                PersonController.questionForChange(Status.UPDATE.getStatus(),scanner,PersonController.teachers);
                showTeacherMenu();
                break;
            case 4:
                showListPerson(PersonController.teachers);
                showTeacherMenu();
                break;
            default:
                System.out.println(Massage.ERROR_INPUT.getMessage());
                showTeacherMenu();
                break;
        }
    }




}
