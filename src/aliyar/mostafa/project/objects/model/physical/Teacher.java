package aliyar.mostafa.project.objects.model.physical;


import aliyar.mostafa.project.objects.model.logical.Lessons.Orginal.Lesson;

import java.util.Date;

public class Teacher extends Persen {
    private Lesson[] lessons ;

    public Teacher(String name, int codMeli, Date birthday) {
        super(name, codMeli, birthday);
    }

    public Lesson[] getLessons() {
        return lessons;
    }
    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }
}
