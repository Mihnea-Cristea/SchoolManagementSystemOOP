package Persoane;

public final class Director {   ///Clasa de tip singleton
     static String nume;
     static Director director;

    public Director() {
        nume = " Sava Catalin ";
    }

    public static Director getDirector() {
        if (director == null) director = new Director();
        return director;
    }

    public static void AfisareDirector()
    {
        System.out.println(nume+" este directorul scolii.");
    }
}