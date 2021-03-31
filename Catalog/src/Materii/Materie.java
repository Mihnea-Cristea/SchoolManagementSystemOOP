package Materii;

import Persoane.*;
import Service.Serviciu;

import java.text.DecimalFormat;
import java.util.Random;

import static java.text.ChoiceFormat.nextDouble;

public abstract class Materie implements Serviciu {

    Profesor profesor;
    String medie;
    Random rand= new Random();
    DecimalFormat douaZecimale = new DecimalFormat("#.##");

    Materie(Profesor profesor) {

        this.profesor = profesor;
        this.medie = douaZecimale.format(rand.nextInt(5)+5 +rand.nextDouble());

    }


    public String getMedie() {
        return medie;
    }

    public void setMedie(String medie) {
        this.medie = medie;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public abstract void Afisare();

    public int testSurpriza(int severitateProf) {
            int notaElev;
            notaElev = rand.nextInt(10) + 1;
            if (notaElev < 5 && severitateProf <= 2)
                notaElev = 5; /// Daca profesorul e indulgent, elevul va fi trecut in cazul in care pica testul
            if (severitateProf > 5) notaElev--;
            return notaElev;
        }

}
