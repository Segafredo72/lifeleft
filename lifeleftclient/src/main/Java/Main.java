import generated.leftlife.LifeLeft;
import generated.leftlife.LifeLeftService;

public class Main {

    public static void main(String[] args) {
        LifeLeft lifeleft = new LifeLeft();

        LifeLeftService lifeleftsrv = lifeleft.getLifeLeftServicePort();

        String resultat = lifeleftsrv.anneeRestantesAVivre("john", "homme", 1980);

        System.out.println(resultat);

    } }
