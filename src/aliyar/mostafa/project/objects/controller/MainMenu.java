package aliyar.mostafa.project.objects.controller;

import aliyar.mostafa.project.objects.model.physical.Persen;
import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;
import aliyar.mostafa.project.objects.view.Massage;

import java.util.Scanner;



public abstract class MainMenu {
    protected static Scanner scanner ;
    protected static Student[] students ;
    protected static Teacher[] teachers ;
        MainMenu(Scanner scanner, Student[] students, Teacher[] teachers) {
            this.scanner = scanner;
            this.students = students;
            this.teachers = teachers;
        }

}
