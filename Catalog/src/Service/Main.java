package Service;

import Materii.*;
import Persoane.*;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ///Instantiere elevi
        Elev[] elevi = new Elev[11];
        elevi[0] = new Elev("Popescu Bogdan", 18, 12, 'A');
        elevi[1] = new Elev("Florescu Adriana", 16, 10, 'C');
        elevi[2] = new Elev("Margarit Tudor", 17, 11, 'B');
        elevi[3] = new Elev("Stroilescu Vlad", 15, 9, 'A');
        elevi[4] = new Elev("Coman Alexandra", 18, 12, 'C');
        elevi[5] = new Elev("Andronache Alexandru", 18, 12, 'B');
        elevi[6] = new Elev("Beldica Florin", 18, 11, 'A');
        elevi[7] = new Elev("Baltag Maria", 18, 10, 'B');
        elevi[8] = new Elev("Dragan Alexia", 18, 10, 'C');
        elevi[9] = new Elev("Gramada Mihaela", 18, 9, 'C');
        elevi[10] = new Elev("Brotoiu Stefan", 18, 9, 'A');


        ///Instantiere profesori

        Profesor[] profi = new Profesor[4];
        profi[0] = new Profesor("Petru Nicolae", 35, "Romana", 2);
        profi[1] = new Profesor("Baciu Radu", 40, "Romana", 10);
        profi[2] = new Profesor("Gavrilescu Teodor", 60, "Matematica", 6);
        profi[3] = new Profesor("Sinpetru Bogdan", 35, "Matematica", 4);

        ///1. Downcasting de la Profesor la diriginte + polimorfism dinamic

        Profesor profesor = new Diriginte("Sendroiu Alin", 33, "Matematica", 5, 12, 'A');
        Diriginte diriginte = (Diriginte) profesor;
        diriginte.Afisare();

        ///2.Instantierea Directorului + Afisare

        new Director();
        Director.AfisareDirector();

        /// 3. Sortare in ordine alfabetica a elevilor

        Arrays.sort(elevi);

        for (int i = 0; i < elevi.length; i++) {
            System.out.println("Elevul " + (i + 1) + " : ");
            elevi[i].Afisare();
            System.out.println();
        }

        /// 4. Ascultare elev random si profesor random

        int elevRand, profRand, profMate, profRomana;
        Random indexRand = new Random();
        elevRand = indexRand.nextInt(elevi.length);
        elevi[elevRand].Ascultare();
        profRand = indexRand.nextInt(4);
        profi[profRand].Ascultare();
        profMate = indexRand.nextInt((2) + 2);   /// Tinand cont ca profii de mate se afla la index 2 si 3 , iar la romana pe 0 si 1, am folosit rand pentru o selectie random dintr-un sir care nu e generat random
        profRomana = indexRand.nextInt(2);

        ///5. Instantiere materie + Afisare ( L am adaugat in numerotare pt interogari datorita modului in care am calculat mediile

        Matematica mate = new Matematica(profi[profMate], "3 probleme de aprofundare");
        mate.Afisare();
        Romana romana = new Romana(profi[profRomana], "Moara cu noroc, Morometii");
        romana.Afisare();

        /// 6. Test surpriza

        int clasaTest = indexRand.nextInt(4) + 9;
        char[] litere = {'A', 'B','C'};
        char literaTest = litere[indexRand.nextInt(litere.length)];
        Profesor profTest = profi[profRand];

        System.out.println("Clasa a " + clasaTest + "-a " + literaTest + " da un test surpriza cu profesorul " + profTest.getNume() + " la materia " + profTest.getMaterie() + "...");
        System.out.println("Testul a luat sfarsit. Profesorul striga notele: ");
        for (Elev elev : elevi) {
            if (elev.getClasa() == clasaTest && elev.getLiteraClasa() == literaTest)
                System.out.println("Elevul " + elev.getNume() + " a obtinut nota " + mate.testSurpriza(profTest.getSeveritate()));
        }

        /// 7. Sedinta cu parintii

        diriginte.sedintaCuParintii();

        /// 8. Simulare clasa a 12-a

        System.out.println("Elevii de clasa a 12-a au dat simulare astazi. Notele sunt dupa cum urmeaza : ");
        for (int i=0;i<elevi.length;i++)
        {
            elevi[i].simulare(elevi[i],diriginte,romana,mate);
        }

        double medieMate=Double.parseDouble(mate.getMedie());
        double medieRomana=Double.parseDouble(romana.getMedie());

    }
}

