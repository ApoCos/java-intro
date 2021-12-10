public class HelloWorld {
    public static void main(String... args) {
//        int planete = 0;
//        int annee = 1650;
//        String phrase = "En" + annee + ", le nombre de planete est de : ";
        //String phrase = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de: ";
        //phrase = "Il y a quelques années cependant, elles étaient au nombre de : ";
        //System.out.println(phrase+(planete+=1));
        //printf permet une lecture plus rapide et evite la construction de plusieurs phrase lorsqu'il y a plusieurs concatenation
        //System.out.printf("il y a %d planetes aujourd'hui", planete);

//        if(annee>=2006) {
//            System.out.println("En " + annee +" les planètes du système solaire étaient au nombre de " + planete);
//        } else {
//            System.out.println("En " + annee +" les planètes du système solaire étaient au nombre de " + (planete+=1));
//        };
// OU        System.out.println(annee>=2006 ? "il y a 8 planetes" : "il y a 9 planetes");

/*        if(1600 <=annee && annee<=2006) {
           if(annee>=2006) {
               planete = 8;
           } else if (annee<2006) {
               if (annee<1700) {
                   planete = 7;
               } else if (annee<1800) {
                   planete = 8;
               } else {
                   planete = 9;
               }
           }
            System.out.println(phrase + planete);
        } else {
            System.out.printf("le programme ne peut pas fournir de résultat pour l'année %d", annee);
        };
 */
        Planet mercure = new Planet();
        mercure.nom = "mercure";
        mercure.matiere = "tellurique";
        mercure.diametre = 4880;
        Planet venus = new Planet();
        venus.nom = "venus";
        venus.matiere = "tellurique";
        venus.diametre = 12100;
        Planet terre = new Planet();
        terre.nom = "terre";
        terre.matiere = "tellurique";
        terre.diametre = 12756;
        Planet mars = new Planet();
        mars.nom = "mars";
        mars.matiere = "tellurique";
        mars.diametre = 6792;
        Planet jupiter = new Planet();
        jupiter.nom = "jupiter";
        jupiter.matiere = "gazeuse";
        jupiter.diametre = 142984;
        Planet saturne = new Planet();
        saturne.nom = "saturne";
        saturne.matiere = "gazeuse";
        saturne.diametre = 120536;
        Planet uranus = new Planet();
        uranus.nom = "uranus";
        uranus.matiere = "gazeuse";
        uranus.diametre = 51118;
        Atmosphere atmosphere = new Atmosphere();
        uranus.atmosphere.txHydro = 83f;
        uranus.atmosphere.txHelium = 15f;
        uranus.atmosphere.txMethane = 2.5f;
        Planet neptune = new Planet();
        neptune.nom = "neptune";
        neptune.matiere = "gazeuse";
        neptune.diametre = 49532;
        Planet pluton = new Planet();
        pluton.nom = "pluton";
        pluton.matiere = "gazeuse";
        pluton.diametre = 2300;
    /* //   System.out.println("Jupiter est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre + " kilomètres.");
        Planet sedna = new Planet();
    //    System.out.println(sedna.nom + " est une planète " + sedna.matiere + " avec un diamètre de " + sedna.diametre + " kilomètres.");
    //    System.out.println(neptune.nom+" a fait " +neptune.revolution(-3542)+ " tours autour de son étoile");
    //    System.out.println(mars.nom+" a fait " +mars.rotation(-684)+ " tours sur elle-même");
        //autre façon de faire:
    //    int nbTours=venus.rotation(1250);
    //    System.out.println(venus.nom+" a fait " +nbTours+ " tours sur elle-même");
     */
/*
        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("fregate");
        System.out.println(mars.nbNouveauxHumains+" humains sont arrivés sur mars.");
 */
        System.out.println("L'atmosphère d'Uranus est composée: \n"+"à " + uranus.atmosphere.txHydro+"% d'hydrogène, à " + uranus.atmosphere.txArgon+"% d'Argon, à " + uranus.atmosphere.txDioxCarbone+"% de Dioxyde de carbone, à " + uranus.atmosphere.txAzote+"% d'Azote, à " + uranus.atmosphere.txHelium+"% d'Hélium, à " + uranus.atmosphere.txMethane+"% d'Methane, à " + uranus.atmosphere.txSodium+"% d'Sodium");
    }
}
