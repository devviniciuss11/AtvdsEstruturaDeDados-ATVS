package ATV_1_CriarUmArrayList;//Este trabalho consiste no desenvolvimento de um programa em Java com o objetivo de aplicar os conceitos de Estrutura de Dados utilizando a classe ArrayList.
//A atividade envolve a criação e manipulação de objetos do tipo ATV_1_CriarUmArrayList.Pessoa
// realizando operações como inserção, acesso, alteração, remoção, verificação, iteração e limpeza da lista, praticando os principais métodos da API de coleções.
import java.util.ArrayList;
public class Pessoa {
    public String nome;
    public String genero;
    public int idade;

    public Pessoa(String nome, String genero, int idade){
        this.nome=nome;
        this.genero=genero;
        this.idade=idade;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Gênero: " + genero + "\n";
    }
    public static void main(String[]args){
        ArrayList<Pessoa>lista=new ArrayList<>();
        lista.add(new Pessoa("vinicius","masculino",20));
        lista.add(new Pessoa("hugo","masculino",23));
        lista.add(new Pessoa("givanildo","masculino",9));
        lista.add(new Pessoa("fernando","masculino",33));
        lista.add(new Pessoa("neymar","masculino",34));
        lista.add(new Pessoa("Fernanda", "Feminino", 21));
        lista.add(new Pessoa("Gabriel", "masculino", 22));
        lista.add(new Pessoa("Helena", "Feminino", 23));
        lista.add(new Pessoa("Igor", "masculino", 27));
        lista.add(new Pessoa("Juliana", "Feminino", 24));

        System.out.println("Lista De Pessoas Completa: ");
        System.out.println(lista);

        System.out.println("Tamanho Da lista: "+ lista.size());

        System.out.println("Elemneto 0 da Lista:");
        System.out.println(lista.get(0));

        System.out.println("Alterando o elemento da posicao 3 pra 9:");
        Pessoa temp = lista.get(2);
        lista.set(2, lista.get(8));
        lista.set(8, temp);
        System.out.println(lista);

        System.out.println("Removendo o elemento da Posicao 5 e 2: ");
        lista.remove(5);
        lista.remove(2);
        System.out.println(lista);

        System.out.println("Percorrendo a lista com for:");
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));

        }

        System.out.println("limpando Lista...");
        lista.clear();
        System.out.println("\nA lista esta vazia ? "+lista.isEmpty());




    }
}
