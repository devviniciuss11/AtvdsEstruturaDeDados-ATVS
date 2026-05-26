package Lista_encadeada_com_ii_if_ip_bv;

class No {
    int valor;
    No proximo;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaEncadeada {
    No inicio;

    public void inserirInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
    }

    public void inserirFim(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No atual = inicio;

        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
    }

    public void imprimir() {
        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
    }

    public boolean buscar(int valor) {
        No atual = inicio;

        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }

        return false;
    }
}
