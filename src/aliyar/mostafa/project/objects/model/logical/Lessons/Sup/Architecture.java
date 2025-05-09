package aliyar.mostafa.project.objects.model.logical.Lessons.Sup;

import aliyar.mostafa.project.objects.controller.Unit;

public abstract class Architecture extends Lesson {
    protected static final int ID = 2;
    public Architecture(Unit[] numberUnit, String name, int id) {
        super(numberUnit, name, id);
    }
}
