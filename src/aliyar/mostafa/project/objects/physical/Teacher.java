package aliyar.mostafa.project.objects.physical;

import aliyar.mostafa.project.objects.lagical.Lessons.Orginal.Lesson;

import java.util.Date;

public class Teacher extends Persen{
    private Lesson [] lessons ;

    public Teacher(String name, int codMeli, Date birthday,Lesson [] lessons) {
        super(name, codMeli, birthday);
        this.lessons = lessons;
    }

    public Lesson[] getLessons() {
        return lessons;
    }
    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }
}
