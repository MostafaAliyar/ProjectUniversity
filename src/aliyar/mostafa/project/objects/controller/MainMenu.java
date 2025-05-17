package aliyar.mostafa.project.objects.controller;

import aliyar.mostafa.project.objects.model.physical.Persen;
import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import aliyar.mostafa.project.objects.view.Massage;

import java.util.Scanner;



public abstract class MainMenu {
    protected static Scanner scanner ;
        MainMenu(Scanner scanner) {
            this.scanner = scanner;
        }

}
