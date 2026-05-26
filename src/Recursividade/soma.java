package Recursividade;

import java.util.Scanner;

public class soma {
    public int soma(int n) {
        if (n == 1) {
            return 1;
        }

        return n + soma(n - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = input.nextInt();
        soma s = new soma();
        int soma = s.soma(n);
        System.out.println(soma);
    }
}
