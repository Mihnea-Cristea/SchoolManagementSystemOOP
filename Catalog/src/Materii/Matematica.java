package Materii;

import Persoane.Elev;
import Persoane.Profesor;

public class Matematica extends Materie{
    private String tema;

    public Matematica( Profesor profesor, String tema) {
        super(profesor);
        this.tema=tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void Afisare() {
        System.out.println("Ora de matematica este sustinuta de profesorul "+ this.profesor.getNume()+" iar tema ce trebuia pregatita pentru astazi este: "+ this.tema);
        System.out.println("Media clasei este: "+this.getMedie());
    }



}
