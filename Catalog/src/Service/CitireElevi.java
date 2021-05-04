package Service;
import Persoane.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitireElevi {
    private static CitireElevi citire;
    public CitireElevi(){}
    public static CitireElevi getInstance()
    {
        if(citire==null)
            citire = new CitireElevi();
        return citire;
    }

    public void citire(String path, Elev[] elevi, int n) {
        try {
            Scanner in = new Scanner(new File("C:\\Users\\Baciu\\Desktop\\Facultate\\Sem2\\Java\\ScoalaPrivata\\Catalog\\src\\Fisiere\\Elevi.csv"));
            String linie;
            in.nextLine();
            for (int i = 0;i<n;i++)
            {
                linie=in.nextLine();
                String[] splitter = linie.split(", ");
                elevi[i]= new Elev(splitter[0],Integer.parseInt(splitter[1]),Integer.parseInt(splitter[2]), (char) Character.toUpperCase(Integer.parseInt(splitter[4])));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}