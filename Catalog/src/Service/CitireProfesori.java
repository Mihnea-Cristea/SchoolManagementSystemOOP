package Service;
import Persoane.Profesor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitireProfesori {
    private static CitireProfesori citire;
    public CitireProfesori(){}
    public static CitireProfesori getInstance()
    {
        if(citire==null)
            citire = new CitireProfesori();
        return citire;
    }

    public void citire(String path,Profesor[] profesori, int n) {
        try {
            Scanner in = new Scanner(new File("C:\\Users\\Baciu\\Desktop\\Facultate\\Sem2\\Java\\ScoalaPrivata\\Catalog\\src\\Fisiere\\Profesori.csv"));
            String linie;
            in.nextLine();
            for (int i = 0;i<n;i++)
            {
                linie=in.nextLine();
                String[] splitter = linie.split(", ");
                profesori[i]= new Profesor(splitter[0],Integer.parseInt(splitter[1]),splitter[2],Integer.parseInt(splitter[4]));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
