package Recursividade;

public class potencia {
    public int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        return base * potencia(base, expoente - 1);
    }
}
