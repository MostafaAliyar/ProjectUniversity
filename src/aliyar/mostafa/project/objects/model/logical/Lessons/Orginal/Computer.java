package aliyar.mostafa.project.objects.model.logical.Lessons.Orginal;

import aliyar.mostafa.project.objects.controller.Unit;

public abstract class Computer extends Lesson {
    protected static final int ID = 1;
    public Computer(Unit[] numberUnit, String name, int id) {
        super(numberUnit, name, id);
    }
}
