public class AssietteCarre extends  Assiette {

    private double cote;

    public AssietteCarre( int annee,double cote) {
        super(annee);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }



    public double calculerSurface()
    {
        return this.cote*this.cote;
        
    }

    public int calculerValeur()
    {
        return  5 *super.calculerValeur();
    }

  

 




    
    
}
