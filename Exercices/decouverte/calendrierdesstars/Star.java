package calendrierdesstars;

import java.time.LocalDate;

public class Star {
    private String name;
    private LocalDate birthday;

    public Star(String name, LocalDate birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBirthday(LocalDate birthday){
        this.birthday = birthday;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getBirthday(){
        return this.birthday;
    }
}
