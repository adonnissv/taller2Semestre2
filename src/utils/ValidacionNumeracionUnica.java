package utils;

import java.util.HashSet;
import java.util.Set;

public class ValidacionNumeracionUnica {
    private Set<Integer> numerosUnicos;

    public ValidacionNumeracionUnica() {
        numerosUnicos = new HashSet<>();
    }

    public boolean esNumeracionUnica(int numero) {
        if (numerosUnicos.contains(numero)) {
            return false;
        } else {
            numerosUnicos.add(numero);
            return true;
        }
    }
}
