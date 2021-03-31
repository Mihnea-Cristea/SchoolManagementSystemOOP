package Persoane;

import Materii.Matematica;
import Materii.Romana;
import Service.Serviciu;

public abstract class Persoana implements Serviciu {
    String nume;
    int varsta;
    Persoana(String nume,int varsta)
    {
        this.nume=nume;
        this.varsta=varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    abstract public void Afisare();
    abstract public void Ascultare();
}
