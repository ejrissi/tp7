public  class Ustensile {

    private int annee ;

    public Ustensile(int annee) {
        this.annee = annee;
    }

    

    public int getAnnee() {
        return annee;
    }


    public int calculerValeur()
    {
        if (2024- annee <50)
        {
            return 0;
        }

        else

        {
            return 2024 - annee -50;
        }
    }



    
}
