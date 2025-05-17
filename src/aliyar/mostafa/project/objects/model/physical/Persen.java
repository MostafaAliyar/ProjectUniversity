package aliyar.mostafa.project.objects.model.physical;

import java.util.Date;

public abstract class Persen {
    private String name;
    private int codMeli;
    private Date birthday;
    public Persen(String name, int codMeli , Date birthday) {
        this.name = name;
        this.codMeli = codMeli;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCodMeli() {
        return codMeli;
    }
    public void setCodMeli(int codMeli) {
        this.codMeli = codMeli;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
