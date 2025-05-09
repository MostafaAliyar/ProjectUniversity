package aliyar.mostafa.project.objects.model.logical.Lessons.Sub;

import aliyar.mostafa.project.objects.controller.Unit;
import aliyar.mostafa.project.objects.model.logical.Lessons.Sup.Public;

public class Math extends Public {
    private final int ID = 01;
    public Math(Unit[] numberUnit, String name, int id) {
        super(numberUnit, name, id);
    }
    @Override
    public String getID() {
        return "14041"+super.ID+this.ID;
    }
}
