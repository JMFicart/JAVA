package collections;

import java.time.LocalDate;
import java.util.Objects;

public class Personne implements Comparable<Personne> {
    private String name;
    private String firstname;
    private LocalDate birthday;

    public Personne(String name, String firstname, LocalDate birthday){
        this.name = name;
        this.firstname = firstname;
        this.birthday = birthday;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setBirthday(LocalDate birthday){
        this.birthday = birthday;
    }

    public String getName(){
        return this.name;
    }

    public String getFirstname(){
        return this.firstname;
    }
    public LocalDate getBirthday(){
        return this.birthday;
    }

    @Override
    public String toString(){
        return "Personnel{" + "name = '" + name + "\'" + ",firstname = '" + firstname +
                "\', birthday = '" + birthday + "\'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return Objects.equals(name, personne.name) && Objects.equals(firstname, personne.firstname) && Objects.equals(birthday, personne.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, firstname, birthday);
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Personne o) {
        int i = this.name.compareTo(o.name);
        if (i==0){
            i = this.firstname.compareTo(o.firstname);
            if (i==0){
                i = -this.birthday.compareTo(o.birthday);
            }
        }
        return i;
    }
}
