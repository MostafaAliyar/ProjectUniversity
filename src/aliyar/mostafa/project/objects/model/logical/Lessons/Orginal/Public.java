package aliyar.mostafa.project.objects.model.logical.Lessons.Orginal;

import aliyar.mostafa.project.objects.controller.Unit;

public abstract class Public extends Lesson {
    protected  static final int ID = 0;

    public Public(Unit[] numberUnit, String name, int id) {
        super(numberUnit, name, id);
    }
}
