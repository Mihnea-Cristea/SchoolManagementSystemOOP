package Materii;

import Persoane.Profesor;

import java.text.DecimalFormat;
import java.util.Random;

public abstract class Materie  {

    Profesor profesor;
    String medie;
    Random rand= new Random();
    DecimalFormat douaZecimale = new DecimalFormat("#.##");

    Materie(Profesor profesor) {

        this.profesor = profesor;
        this.medie = douaZecimale.format(rand.nextInt(5)+5 +rand.nextDouble());

    }
    Materie()
    {}


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

    public abstract void afisare();



}
