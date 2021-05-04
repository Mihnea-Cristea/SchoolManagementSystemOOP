package Service;

import Persoane.Elev;
import Persoane.Profesor;

import java.util.Random;

public class Servisiu {


    public static int test(int severitateProf) {
        Random rand = new Random();
        int notaElev;
        notaElev = (rand.nextInt(10) + 4) %10;
        if (notaElev < 5 && severitateProf <= 2)
            notaElev = 5; /// Daca profesorul e indulgent, elevul va fi trecut in cazul in care pica testul
        if (severitateProf > 5) notaElev--;
        return notaElev;
    }


    public static void testSurpriza(int numar, char litera, Elev[] elevi, Profesor[] profesori) {
        Random rand = new Random();
        Profesor profTest = profesori[rand.nextInt(6)];
        System.out.println("Clasa a " + numar + "-a " + litera + " da un test surpriza cu profesorul "
                + profTest.getNume() + " la materia " + profTest.getMaterie() + "...");
        System.out.println("Testul a luat sfarsit. Profesorul striga notele: ");
        for (Elev elev : elevi) {
            if (elev.getClasa() == numar && elev.getLiteraClasa() == litera)
                System.out.println("Elevul " + elev.getNume() + " a obtinut nota " + (Servisiu.test(profTest.getSeveritate())));
        }
    }

     void ascultare()
    {

    }
}
