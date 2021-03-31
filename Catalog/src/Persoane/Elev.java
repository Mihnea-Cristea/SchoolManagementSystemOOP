package Persoane;
import Materii.Matematica;
import Materii.Materie;
import Materii.Romana;
import Service.Serviciu;

import java.util.*;

public class Elev extends Persoana implements Comparable<Elev> {
    private int clasa;
    private char literaClasa;
    public Elev(String nume,int varsta, int clasa, char literaClasa)
    {
        super(nume,varsta);
        this.clasa=clasa;
        this.literaClasa=literaClasa;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public char getLiteraClasa() {
        return literaClasa;
    }

    public void setLiteraClasa(char literaClasa) {
        this.literaClasa = literaClasa;
    }

    @Override
    public void Ascultare() {
        System.out.println(this.nume+" este la ascultare la scoala.");
    }

    @Override
    public void Afisare() {
        System.out.println(this.nume+" este Elev cu varsta de "+this.varsta+" ani, in clasa "+ this.clasa+this.literaClasa);
    }




    @Override
    public int compareTo(Elev elev) {
        String nume = this.nume;
        String comparat = elev.nume;
        return nume.compareTo(comparat); // in ordine alfabetica
    }

    @Override
    public void simulare(Elev elevi, Diriginte diriginte, Romana romana, Matematica mate)
    {
        if(elevi.getClasa()==12)
        {
            double notaRomana=romana.testSurpriza(diriginte.getSeveritate());
            double notaMate=mate.testSurpriza(diriginte.getSeveritate());
            double medieSimulare=notaMate+notaRomana/2;
            System.out.println("Elevul "+elevi.getNume()+" a obtinut :");
            System.out.println("Romana = "+ notaRomana+" ; Matematica = "+notaMate+" ;"+" Situatie: "+ (medieSimulare>5 ? "Admis" : "Picat"));
        }
    }
}
