package Persoane;

public final class Director {   ///Clasa de tip singleton
     private static String nume;
     private static Director director;

    private Director() {
        nume = " Sava Catalin ";
    }

    public static Director getDirector() {
        if (director == null) director = new Director();
        return director;
    }

    public static void afisareDirector()
    {
        System.out.println(nume+" este directorul scolii.");
    }
}