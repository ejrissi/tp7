public class AssietteRonde  extends Assiette
{
    private  double rayon;

    public AssietteRonde( int annee,double rayon) {
        super(annee);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }


    public double calculerSurface()
    {
       return  this.rayon*this.rayon*3.14;
    }

  

    




  


    
}
