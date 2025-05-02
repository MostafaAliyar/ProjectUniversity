package aliyar.mostafa.project.objects.model.logical.Lessons.Orginal;

import aliyar.mostafa.project.objects.controller.Unit;

public abstract class Lesson {
    private Unit[] numberUnit;
    private String name;
    private int id;
    public abstract String getID();
    public Lesson (Unit[] numberUnit , String name, int id){
        this.numberUnit = numberUnit;
        this.name = name;
        this.id = id;
    }
}
