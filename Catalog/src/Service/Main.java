package Service;

import Materii.Matematica;
import Materii.Romana;
import Persoane.Director;
import Persoane.Diriginte;
import Persoane.Elev;
import Persoane.Profesor;

public class Main extends Meniu {

    public static void main(String[] args) {

        ///Citire date din fisiere

        //Elevi
        CitireElevi citire1 = CitireElevi.getInstance();
        Elev[] elevi = new Elev[25];
        citire1.citire("fisiere/Elevi.csv",elevi, 25);

        //Profesori
        CitireProfesori citire2 = CitireProfesori.getInstance();
        Profesor[] profesori = new Profesor[6];
        citire2.citire("fisiere/Profesori.csv", profesori, 6);

        //Diriginti
        CitireDiriginti citire3 = CitireDiriginti.getInstance();
        Diriginte[] diriginti = new Diriginte[12];
        citire3.citire("fisiere/Diriginti.csv", diriginti, 12);

        Director director = Director.getDirector();
        Romana romana = new Romana();
        Matematica mate = new Matematica() ;
        Meniu meniu = new Meniu();

        meniu.meniu(elevi,profesori,director,diriginti,romana,mate);
    }
}

