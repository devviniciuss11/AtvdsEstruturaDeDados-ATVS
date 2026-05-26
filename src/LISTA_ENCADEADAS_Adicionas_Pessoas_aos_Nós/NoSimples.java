package LISTA_ENCADEADAS_Adicionas_Pessoas_aos_Nós;

public class NoSimples<T> {
    T dados;
    NoSimples<T> proximo;

    public NoSimples(T dados) {
        this.dados = dados;
        this.proximo = null;
    }
}
