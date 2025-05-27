package aliyar.mostafa.project.objects.model.lessons;

import aliyar.mostafa.project.objects.model.physical.Student;
import aliyar.mostafa.project.objects.model.physical.Teacher;

public final class Lesson {
    //private Unit[] numberUnit;
    private final int numberUnit;
    private final String name;
    private final TypeLesson typeLesson;
    private final int id;
    private Teacher teacher;
    private Student[] students;

    public Lesson (int numberUnit , String name, int id,TypeLesson typeLesson){
        this.numberUnit = numberUnit;
        this.name = name;
        this.id = id;
        this.typeLesson = typeLesson;
    }
    public Lesson (int numberUnit , String name, int id, Teacher teacher, Student[] students,TypeLesson typeLesson){
        this.numberUnit = numberUnit;
        this.name = name;
        this.id = id;
        this.teacher = teacher;
        this.students = students;
        this.typeLesson = typeLesson;
    }
    public Lesson() {
        this.numberUnit = 0;
        this.name = "";
        this.id = 0;
        this.typeLesson = TypeLesson.PUBLIC;
    }
    public Student[] getStudents() {
        try {
            return students;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
