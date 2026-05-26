package Inserir_no_início;

import Criar_a_estrutura_do_nó.No;

class Lista {
    No inicio;
    public void inserirInicio(int valor){
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
    }
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirInicio(1);
        System.out.println(lista.inicio);
    }
}
