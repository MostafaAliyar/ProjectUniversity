package aliyar.mostafa.project.objects.controller;

public enum Unit {
    PUBLIC(500),
    PRACTICAL(1000),
    WORKSHOP(1250);
    private int prise;
    Unit(int prise) {
        this.prise = prise;
    }
    public int getPrise() {
        return prise;
    }


}
