package Medicaments;

import java.awt.print.PrinterJob;

public class Test {
    public static void main(String[] args) {
        medicament[] med = new medicament[5];
        med[0] = new antibiotiques("Clamoxyl 500",4432,5910,"18/02/2010","thermophyle");
        med[1] = new antibiotiques("Augmentin",4433,7850,"14/11/2010","thermophyle");
        med[2] = new AntiInflammatoire("Maxilase",4434,3880,"28/04/2010","steroidien",8);
        med[3] = new homéopathiques("oscillococcinum",4435,8750,"23/12/2010","saccharose");
        med[4] = new AntiInflammatoire("Slupred",4436,13980,"28/04/2010","steroidien",6);
        for (int i=0; i<med.length; i++) {
            System.out.println(med[i].toString() + " taxe " + med[i].calculTaxeAppliquee());
            if (med[i] instanceof homéopathiques) {
                System.out.println("Non Remboursable");
            }
            else if (med[i] instanceof antibiotiques) {
                System.out.println("Remboursable :" + ((antibiotiques) med[i]).remboursemant());
            }
            else{
                System.out.println("Remboursable: "+ ((AntiInflammatoire) med[i]).remboursemant());
            }
        }
        Pharmacie ph = new Pharmacie(100);
        for (int i=0; i<med.length; i++) {
            ph.ajoute(med[i]);
            ph.affiche("antibiotiques");
        }
    }
}