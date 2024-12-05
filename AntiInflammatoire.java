package Medicaments;

public class AntiInflammatoire extends medicament implements Remboursable {
    protected String molecule;
    protected int acidite;
    public AntiInflammatoire(String labelle,int reference,float prix,String datefabrication,String molecule, int acidite) {
        super(labelle,reference,prix,datefabrication);
        this.molecule = molecule;
        this.acidite = acidite;
    }
    public AntiInflammatoire() {}

    @Override
    public float calculTaxeAppliquee() {
        float taux=0;
        switch (molecule){
            case "stéroïdien":
                taux = prix*0.1F;
                break;
            case "non stéroïdien":
                taux = prix*0.15F;
                break;
        }
        return taux;
    };

    @Override
    public float remboursemant() {
        return prix-(prix*0.8F);
    }
    @Override
    public String toString(){
        return super.toString()+"AntiInflammatoire[molecule="+molecule+",acidite="+acidite+"]";
    }


}
