package Medicaments;

public class antibiotiques extends medicament implements Remboursable{
    protected String bacterie;
    public  antibiotiques(String labelle,int reference,float prix,String datefabrication,String bacterie) {
        super(labelle,reference,prix,datefabrication);
        this.bacterie = bacterie;
    }
    public antibiotiques(){};
    @Override
    public float calculTaxeAppliquee() {
        float taux;
        switch(bacterie){
            case "thermophyle":
                taux = prix*0.1f;
                break;
            case "mésophyle":
                taux = prix*0.12f;
                break;
            default:
                taux = prix*0.15f;
                break;
        }
        return taux;
    };
    @Override
    public float remboursemant() {
        return prix-(prix * 0.9F);
    }
    @Override
    public String toString() {
        return super.toString()+"antibiotiques [bacterie=" + bacterie + "]";
    }
}
