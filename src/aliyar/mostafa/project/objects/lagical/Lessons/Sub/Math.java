package aliyar.mostafa.project.objects.lagical.Lessons.Sub;

import aliyar.mostafa.project.objects.lagical.IdCreator;
import aliyar.mostafa.project.objects.lagical.Lessons.Orginal.Public;
import aliyar.mostafa.project.objects.lagical.Unit;

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
