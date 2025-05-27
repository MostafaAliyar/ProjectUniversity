package aliyar.mostafa.project.objects.model.lessons;

public enum TypeLesson {
    COMPUTER(2,"computer"),
    ARCHITECTED(3,"architected"),
    PUBLIC(1,"public Lesson");
    private final int value ;
    private final String name ;
    TypeLesson(int value, String name) {
        this.value = value;
        this.name = name;
    }
    int getValue() {
        return value;
    }
    String getName() {
        return name;
    }
}
