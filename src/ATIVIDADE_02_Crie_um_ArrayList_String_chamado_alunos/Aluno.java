package ATIVIDADE_02_Crie_um_ArrayList_String_chamado_alunos;

import java.util.*;

public class Aluno {
    public String nome;
    public Aluno(String nome){
        this.nome=nome;
    }
    @Override
    public String toString(){
        return ("nome: "+nome+"\n");
    }
    public static void main(String[]args){
        ArrayList<Aluno> alunoslist =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10;i++){
            System.out.println("digite o nome do aluno:");
            String nome = sc.nextLine();
            Aluno aluno = new Aluno(nome);
            alunoslist.add(aluno);
        }
        System.out.println("Lista completa de Alunos:");
        System.out.println(alunoslist);

        System.out.println("colocando um novo aluno na posicao 2");
        alunoslist.add(1,new Aluno("vinizin"));
        System.out.println(alunoslist);

        System.out.println("Substituindo o nome da posicao 4 pela posicao 8:");
        Aluno temp = alunoslist.get(3);
        alunoslist.set(3, alunoslist.get(7));
        alunoslist.set(7, temp);
        System.out.println(alunoslist);

        System.out.println("removendo aluno da posicao 6");
        alunoslist.remove(5);
        System.out.println(alunoslist);

        System.out.println("removendo pelo nome carlos:");
        alunoslist.remove("carlos");
        System.out.println(alunoslist);

        System.out.println("essa lista contem ana? ");
        System.out.println("\nA lista contém Ana? " + alunoslist.contains("ana"));

        System.out.println("mostrndo a posicao de bruno");
        int posicao = alunoslist.indexOf("bruno");
        if(posicao != -1){
            System.out.println("bruno esta nessa posicao:"+ posicao);
        }
        else{
            System.out.println("nao existe bruno na lista!");
        }

        System.out.println("tamanho da lista de alunos:");
        System.out.println(alunoslist);
        System.out.println(alunoslist.size());

        System.out.println("lista em ordem Alfabetica:");
        Collections.sort(alunoslist, Comparator.comparing(Aluno -> Aluno.nome));
        System.out.println(alunoslist);

        System.out.println("Percorendo o ArrayList utilizando o for");
        for (int i = 0;alunoslist.size()>i;i++){
            System.out.println(alunoslist.get(i));
        }



    }
}
