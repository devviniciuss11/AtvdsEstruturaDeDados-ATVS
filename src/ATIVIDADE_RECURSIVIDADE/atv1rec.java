package ATIVIDADE_RECURSIVIDADE;

public class atv1rec {
    //Recursividade
    public int fibonacci(int n){
        if(n == 1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n-2);
    }
    public int fatorial(int n){
        //caso Base Caso que vai acontecer pro meto parar de chamar ele mesmo
        if(n==1 || n==0){
            return 1;
        }
        //Chamada Recursiva Parte da funcao que chama ela mesma
        return n* fatorial(n-1);

    }
    public static void main(String[]args){
        // instanciei ou criei o objeto atv1rec para conseguir usar o metodo fatorial
        atv1rec atv1rec = new atv1rec();
        //criei uma variavel pra armazenar o resultado re vai retornar um int, dps exibi o resultado
        int resultado = atv1rec.fatorial(4);
        int resulfibo = atv1rec.fibonacci(8);
        System.out.println("o fatorial é:"+ resultado);
        System.out.println("a posicao de fibonaci é:"+resulfibo);
    }
}
