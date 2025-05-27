package aliyar.mostafa.project.objects.view;

import java.util.Scanner;

import static aliyar.mostafa.project.objects.controller.LessonMenu.showLessonsMenu;
import static aliyar.mostafa.project.objects.view.StudentMenu.showStudentMenu;
import static aliyar.mostafa.project.objects.view.TeacherMenu.showTeacherMenu;

public class FirstMenu extends MainMenu {

    public FirstMenu(Scanner scanner) {
        super(scanner);
    }


    public void start (){
        showMainMenu();
    }
    protected static void showMainMenu() {
        System.out.println(Massage.TITEL_MAIN_MENU.getMessage());
        showSupMenu(scanner.nextInt());

    }
    protected static void showSupMenu(int index) {
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
            case 3:
                showLessonsMenu();
                break;
        }
    }
}
