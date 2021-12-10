public class Planet {

    String nom;
    String matiere;
    long diametre;
    int nbNouveauxHumains;
    Atmosphere atmosphere;

    int rotation(int angle) {
       return angle/360;
    };
    int revolution(int angle){
        return angle/360;
    };

    void accueillirVaisseau(int nbHumains) {
     //   nbHumains=8;
        nbNouveauxHumains=nbNouveauxHumains+nbHumains;
        //    return nombreNouveauxHumains;
    }

    void accueillirVaisseau(String typeVaisseau) {
        if (typeVaisseau.equals("chasseur")) {
            nbNouveauxHumains += 3;
        } else if (typeVaisseau.equals("fregate")) {
            nbNouveauxHumains += 12;
        } else if (typeVaisseau.equals("croiseur")) {
            nbNouveauxHumains += 50;
        }
    }
}
