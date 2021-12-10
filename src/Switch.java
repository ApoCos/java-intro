public class Switch {
    public static void main(String... args) {
 //   int mois = 4;

  /*  switch (mois) {
        case 1 :
            System.out.println("Janvier");
            break;
        case 2 :
            System.out.println("Février");
            break;
        case 3 :
            System.out.println("Mars");
            break;
        default:
        System.out.println("le mois n'est pas connu");
    } */
/*
        switch (mois) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("C'est le printemps");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("C'est l'été'");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println("C'est l'automne");
                break;
            case 10 :
            case 11 :
            case 12 :
                System.out.println("C'est l'hiver");
                break;
            default:
                System.out.println("le mois n'est pas connu");
        }
        */

     int nbPlanetes = 7;
     while (nbPlanetes<10) {
            switch (nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanetes);
            }
         nbPlanetes++;
        };
}}