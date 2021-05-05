package Service;

import Materii.Matematica;
import Materii.Romana;
import Persoane.Director;
import Persoane.Diriginte;
import Persoane.Elev;
import Persoane.Profesor;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Meniu implements Audit{
    public void meniu (Elev[] elevi, Profesor[] profesori, Director director, Diriginte[] diriginti, Romana romana, Matematica mate)
    {
        System.out.println("------Selectati o optiune :------");
        System.out.println();
        System.out.println("1.Lista elevior scolii :");
        System.out.println("2.Lista profesorilor scolii :");
        System.out.println("3.Cine este directorul scolii? :");
        System.out.println("4.Afisare elevi in ordine alfabetica :");
        System.out.println("5.Asculta un elev la intamplare :");
        System.out.println("6.Da un test surpriza unei clase :");
        System.out.println("7.Da simulare clasei a 12-a :");
        System.out.println("8.Organizeaza o sedinta cu parintii unei clase:");
        System.out.println("9.Iesire");
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Introduceti numarul corespunzator comenzii pe care doriti sa o executati :");
        Scanner scanner = new Scanner(System.in);
        int comanda = scanner.nextInt();
        Servisiu servisiu = new Servisiu();
        Random indexRand = new Random();
        while (comanda>=10){
            System.out.println("Alegeti o optiune valida.");
            comanda = scanner.nextInt();
        }
       do {

            switch (comanda) {
                case 1: {
                    audit("Lista elevior scolii");


                    System.out.println();
                    for (int i = 0; i < elevi.length; i++)
                        elevi[i].afisare();
                    System.out.println();
                    break;
                }
                case 2: {
                    audit("Lista profesorilor scolii");


                    System.out.println();
                    for (int i = 0; i < profesori.length; i++)
                        profesori[i].afisare();
                    System.out.println();
                    break;
                }
                case 3: {
                    audit("Afisare directorul scolii");


                    System.out.println();
                    Director.getDirector();
                    Director.afisareDirector();
                    System.out.println();
                    break;
                }
                case 4: {
                    audit("Afisare elevi in ordine alfabetica");


                    System.out.println();
                    Arrays.sort(elevi);
                    for (int i = 0; i < elevi.length; i++) {
                        System.out.println("Elevul " + (i + 1) + " : ");
                        elevi[i].afisare();
                        System.out.println();
                    }
                    break;
                }
                case 5: {
                    audit("Ascultare un elev la intamplare");


                    System.out.println("La ce materie doriti sa se desfasoare ascultarea ?:");
                    System.out.println();
                    System.out.println("1.Matematica");
                    System.out.println("2.Romana");
                    int comanda2 = scanner.nextInt();

                    int elevRand, profRand;
                    elevRand = indexRand.nextInt(elevi.length);


                    if (comanda2 == 1) {
                        System.out.println("Ascultarea se va face la Matematica");
                        profRand = indexRand.nextInt(3) + 3;

                    } else {
                        System.out.println("Ascultarea se va face la Romana");
                        profRand = indexRand.nextInt(3);
                    }

                    elevi[elevRand].ascultare();
                    profesori[profRand].ascultare();
                    break;
                }
                case 6: {
                    audit("Test surpriza unei clase");


                    System.out.println("Introduceti numarul clasei :");
                    int comanda2 = scanner.nextInt();

                    System.out.println("Introduceti litera specifica clasei : A , B , C ");
                    char litera = scanner.next().charAt(0);

                    Servisiu.testSurpriza(comanda2, litera, elevi, profesori);
                    break;
                }
                case 7: {
                    audit("Simulare clasa a 12-a");


                    System.out.println("Elevii de clasa a 12-a au dat simulare astazi. Notele sunt dupa cum urmeaza : ");
                    for (Elev elev : elevi) {
                        elev.simulare(elev, romana, mate);
                    }
                    break;
                }
                case 8: {
                    audit("Sedinta cu parintii");

                    System.out.println("Introduceti numarul si litera clasei :");
                    int comanda3 = scanner.nextInt();
                    char comanda3litera = scanner.next().charAt(0);
                    System.out.println("Se va desfasura o sedinta cu parintii clasei a "+ comanda3 + comanda3litera);
                    int aux=0;
                    for (int i=0; i< diriginti.length;i++)
                    {
                        if (comanda3==diriginti[i].getClasa() && comanda3litera==diriginti[i].getLiteraClasa())
                            aux=i;
                    }
                    diriginti[aux].sedinta(comanda3, comanda3litera);
                    break;
                }
                case 9: {
                    audit("Iesire din aplicatie");
                    System.exit(0);
                    break;
                }
            }
        System.out.println("Mai doriti sa executati alta comanda?");
        System.out.println("1.Da        2.Nu (Iesire) ");
        int reset = scanner.nextInt();
        if (reset == 1)
        {
            System.out.println("------Selectati o optiune :------");
            System.out.println();
            System.out.println("1.Lista elevior scolii :");
            System.out.println("2.Lista profesorilor scolii :");
            System.out.println("3.Cine este directorul scolii? :");
            System.out.println("4.Afisare elevi in ordine alfabetica :");
            System.out.println("5.Asculta un elev la intamplare :");
            System.out.println("6.Da un test surpriza unei clase :");
            System.out.println("7.Da simulare clasei a 12-a :");
            System.out.println("8.Organizeaza o sedinta cu parintii unei clase:");
            System.out.println("9.Iesire");
            System.out.println("---------------------------------");
            System.out.println();
            System.out.println("Introduceti numarul corespunzator comenzii pe care doriti sa o executati :");
            comanda = scanner.nextInt();
        }
        else {
            System.exit(1);
        }
       }while (comanda < 10);


    }
}
