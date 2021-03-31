package Service;


import Materii.Matematica;
import Materii.Romana;
import Persoane.Diriginte;
import Persoane.Elev;

public interface Serviciu {

    default void Afisare() {}
    default int testSurpriza(){
        return 0;
    }
    default void Ascultare(){}

    default void sedintaCuParintii() {}

    default void simulare(Elev elevi, Diriginte diriginte, Romana romana, Matematica mate) {

    }

}
