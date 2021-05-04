package Service;
import Persoane.Diriginte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitireDiriginti {
    private static CitireDiriginti citire;
    public CitireDiriginti(){}
    public static CitireDiriginti getInstance()
    {
        if(citire==null)
            citire = new CitireDiriginti();
        return citire;
    }

    public void citire(String path, Diriginte[] diriginti, int n) {
        try {
            Scanner in = new Scanner(new File("C:\\Users\\Baciu\\Desktop\\Facultate\\Sem2\\Java\\ScoalaPrivata\\Catalog\\src\\Fisiere\\Diriginti.csv"));
            String linie;
            in.nextLine();
            for (int i = 0;i<n;i++)
            {
                linie=in.nextLine();
                String[] splitter = linie.split(", ");
                diriginti[i]= new Diriginte(splitter[0],Integer.parseInt(splitter[1]),splitter[2],Integer.parseInt(splitter[3]),Integer.parseInt(splitter[4]), (char) Character.toUpperCase(Integer.parseInt(splitter[5])));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}