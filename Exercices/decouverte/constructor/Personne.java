package constructor;

import java.util.Objects;

public class Personne {
    private String nom;
    private String prenom;
    private String profession;

    public Personne(String nom, String prenom, String profession) {
        this.nom = nom;
        this.prenom = prenom;
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return nom.equals(personne.nom) && prenom.equals(personne.prenom) && profession.equals(personne.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, profession);
    }

    //    @Override
//    public boolean equals(Object obj){
//        boolean egal = false;
//
//        if(obj != null && obj.getClass() == this.getClass()){
//            Personne other = (Personne) obj;
//            egal = this.nom.equals(other.nom) && this.prenom.equals(other.prenom) && this.profession.equals(other.profession);
//        }
//        return egal;
//    }
}
