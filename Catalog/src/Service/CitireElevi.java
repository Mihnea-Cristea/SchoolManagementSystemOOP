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
        File file = new File(path);
        try {
            Scanner in = new Scanner(file);
            String linie;
            for (int i = 0;i<n;i++)
            {
                linie=in.nextLine();
                String[] splitter = linie.split(", ");
                elevi[i]= new Elev(splitter[0], Integer.parseInt(splitter[1]), Integer.parseInt(splitter[2]), splitter[3].charAt(0));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}