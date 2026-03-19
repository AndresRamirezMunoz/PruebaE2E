package co.com.test.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class CaculoNumeros {


    public static <T extends Actor> int[] posicionAleatoria(int cantidad, Target productos, T actor) {
        int maximo = productos.resolveAllFor(actor).size();
        int[] posiciones = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            posiciones[i] = (int) (Math.random() * maximo) + 1;
        }
        return posiciones;
    }
}
