package aliyar.mostafa.project.objects.view;

import aliyar.mostafa.project.objects.controller.PersonController;
import aliyar.mostafa.project.objects.controller.Status;

import java.util.Scanner;

import static aliyar.mostafa.project.objects.controller.PersonController.showListPerson;

public final class StudentMenu extends FirstMenu {
    StudentMenu(Scanner scanner) {
        super(scanner);
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
                int capacityIndex = PersonController.checkCapacity(PersonController.students);
                if (capacityIndex>=0){
                    PersonController.createStudent(capacityIndex,scanner);
                }else {
                    System.out.println(Massage.NO_CAPACITY_STUDENT.getMessage());
                    showStudentMenu();
                }
                break;
            case 2:
                PersonController.questionForChange(Status.DELETE.getStatus(),scanner,PersonController.students);
                showStudentMenu();
                break;
            case 3:
                PersonController.questionForChange(Status.UPDATE.getStatus(),scanner,PersonController.students);
                showStudentMenu();
                break;
            case 4:
                showListPerson(PersonController.students);
                showStudentMenu();
                break;
            default:
                System.out.println(Massage.ERROR_INPUT.getMessage());
                showStudentMenu();
                break;
        }
    }



}

