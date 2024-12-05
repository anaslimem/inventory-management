package Medicaments;

public abstract class medicament {
        protected String libelle;
        protected int reference;
        protected float prix;
        protected String datefabrication;
public medicament() {};
public medicament(String libelle, int reference, float prix, String datefabrication) {
    this.libelle = libelle;
    this.reference = reference;
    this.prix = prix;
    this.datefabrication = datefabrication;
}
public String tostring() {
    return("la libelle est: "+libelle +"\n"+"la reference est: "+ reference + "\n"+"le prix est: "+prix+"\n"+"la datefabrication est: "+datefabrication);
};
public abstract float calculTaxeAppliquee();


    }
