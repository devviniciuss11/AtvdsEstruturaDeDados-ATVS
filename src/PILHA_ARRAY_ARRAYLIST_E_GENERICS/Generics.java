

package PILHA_ARRAY_ARRAYLIST_E_GENERICS;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[]args){
        Caixa<String>StringBox=new Caixa();

        StringBox.guardar("Vinicius11");
        StringBox.guardar("givanildo22");
        System.out.println(StringBox.obterTodos());
        for (int i = 0; i < 2; i++) {

        }

    }
}
//Criei uma Classe genérica simples: uma "Caixa" que guarda UM valor de qualquer tipo.
//O <T> é o parâmetro de tipo (type parameter).
class Caixa<T>{
    private List<T> conteudos = new ArrayList<>();
    public void guardar(T conteudos){
        this.conteudos.add(conteudos);
    }
    public List<T> obterTodos(){
        return conteudos;
    }
    class StringBox{
        private String conteudo;
        public void guardar(String valor){
            this.conteudo=valor;
        }
        public String obter(){
            return conteudo;
        }
    }
}
