package Medicaments;


public class homéopathiques extends medicament {
    String plante;
    public homéopathiques(){}

    @Override
    public float calculTaxeAppliquee() {
        return prix-prix*0.2F;
    };
    public homéopathiques(String labelle,int reference,float prix,String datefabrication,String plante){
        super(labelle,reference,prix,datefabrication);
        this.plante=plante;
    }
    @Override
    public String tostring() {
        return super.tostring()+"homéopathiques[plante"+plante+"]";
    }
}
