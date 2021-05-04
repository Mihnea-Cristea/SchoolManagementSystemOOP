package Persoane;

import java.util.Random;

public class Profesor extends Persoana {
    protected String materie;
    protected int severitate;

    public Profesor(String nume, int varsta, String materie, int severitate)
     {
         super(nume,varsta);
        this.materie=materie;
        this.severitate=severitate;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public int getSeveritate() {
        return severitate;
    }

    public void setSeveritate(int severitate) {
        this.severitate = severitate;
    }

    @Override
    public void afisare() {
        System.out.println(this.nume+" "+this.varsta+" este Profesor la materia "+ this.materie +" si ofera de obicei note in jur de "+ (10-(this.severitate/2)));
    }
    Random rand= new Random();
    public void ascultare() {
        System.out.println("Profesorul "+this.nume+" asculta un elev in momentul acesta.");
    }

}
