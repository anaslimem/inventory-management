package Medicaments;

public class Pharmacie {
    private medicament[] lesMedicaments;
    private int nbMedicaments;
    public Pharmacie(int taille) {
        lesMedicaments = new medicament[taille];
        nbMedicaments = 0;
    }
    @Override
    public String toString() {
        String res = null;
        for (int i = 0; i < nbMedicaments; i++) {
            res += lesMedicaments[i].toString()+"\n";
        }
        return res;
    }
    public void ajoute(medicament medicament) {
        if (nbMedicaments < lesMedicaments.length) {
            lesMedicaments[nbMedicaments] = medicament;
        }
        else{
            System.out.println("Vous n'avez pas le medicament");
        }
    }
    public int recherche(int reference){
        int i=0, indice=-1;
        while (i < nbMedicaments && lesMedicaments[i].reference != reference) {
            i++;
        }
        if (i < nbMedicaments) {
            indice = i;
        }
        return indice;
    }
    public void supprime(int reference) {
        if(nbMedicaments != 0){
            int i=0;
            while (i < nbMedicaments && lesMedicaments[i].reference != reference) {
                i++;
            }
            if (i < nbMedicaments) {
                for (int j = i; j < nbMedicaments-1; j++) {
                    lesMedicaments[j] = lesMedicaments[j+1];
                    nbMedicaments--;
                }
            }
            else{
                System.out.println("Vous n'avez pas le medicament");
            }
        }
        else{
            System.out.println("Stock est vide");
        }
    }
    public void affiche(String categorie){
        String nomCategorie= "class" + categorie;
        String nomClasse;
        System.out.println("liste des medicaments de categorie " + categorie);
        for (int i = 0; i < nbMedicaments; i++) {
            nomClasse = lesMedicaments[i].toString();
            if(nomCategorie.equals(nomClasse)){
                System.out.println(lesMedicaments[i].toString());
            }
        }
    }
}

