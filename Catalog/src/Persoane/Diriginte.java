package Persoane;

public class Diriginte extends Profesor{
    private int clasa;
    private char literaClasa;

    public Diriginte(String nume, int varsta, String materie, int severitate, int clasa, char literaClasa) {
        super(nume, varsta, materie, severitate);
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
    public void afisare() {
        System.out.println("Profesorul "+ this.nume+ " este dirigintele clasei "+this.clasa+this.literaClasa);
    }

    @Override
    public void ascultare() {
        super.ascultare();
    }


    public void sedinta(int numar, char litera)
    {
        if(this.varsta>55) System.out.println("Dirigintele clasei "+numar+litera+" va organiza o sedinta cu parintii din cauza ca e nebun");
        else System.out.println("Nu o sa aiba loc sedinta cu parintii, deoarece dirigintele este in relatii bune cu elevii sai.");
    }
}
