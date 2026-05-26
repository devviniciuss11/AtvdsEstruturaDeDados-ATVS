package LISTA_ENCADEADAS_Adicionas_Pessoas_aos_Nós;

public class Main
{
    public static void main(String[] args) {
        Pessoa p= new Pessoa();
        p.nome="Ricardo";
        p.idade=2;
        System.out.println("Nome: "+p.nome);
        NoSimples<Pessoa> n1_pessoa=new NoSimples<>(p);
        System.out.println("No 1 pessoa nome:"+n1_pessoa.dados.nome);
        System.out.println("No 1 pessoa idade:"+n1_pessoa.dados.idade);
        //--------------------------------
        Pessoa p2= new Pessoa();
        p2.nome="Maria";
        p2.idade=5;
        System.out.println("Nome: "+p2.nome);
        NoSimples<Pessoa> n2_pessoa=new NoSimples<>(p2);
        System.out.println("No 2 pessoa nome:"+n2_pessoa.dados.nome);
        System.out.println("No 2 pessoa idade:"+n2_pessoa.dados.idade);

        n2_pessoa.proximo=n1_pessoa;

        //--------------------------------
        Pessoa p3= new Pessoa();
        p3.nome="Fabio";
        p3.idade=51;
        System.out.println("Nome: "+p3.nome);
        NoSimples<Pessoa> n3_pessoa=new NoSimples<>(p3);
        n2_pessoa.proximo.proximo=n3_pessoa;

        System.out.println("N3 pessoa nome: "+n2_pessoa.proximo.proximo.dados.nome);
        System.out.println("N3 pessoa idade: "+n1_pessoa.proximo.dados.idade);

        //-------------------------------

        Pessoa p4 = new Pessoa();
        p4.nome="Pedro";
        p4.idade=20;
        NoSimples<Pessoa> n4_pessoa=new NoSimples<>(p4);
        n2_pessoa.proximo.proximo.proximo=n4_pessoa;
        System.out.println("N4 pessoa nome:"+n3_pessoa.proximo.dados.nome);
        System.out.println("N4 pessoa idade:"+n3_pessoa.proximo.dados.idade);

        //---------------------------------------

        Pessoa p5 = new Pessoa();
        p5.nome="Ana";
        p5.idade=15;
        NoSimples<Pessoa> n5_pessoa=new NoSimples<>(p5);
        n2_pessoa.proximo.proximo.proximo.proximo=n5_pessoa;
        System.out.println("N5 pessoa nome:"+n4_pessoa.proximo.dados.nome);
        System.out.println("N5 pessoa idade:"+n4_pessoa.proximo.dados.idade);

        //------------------------------------------------------------------
        Pessoa p6 = new Pessoa();
        p6.nome="Joao";
        p6.idade=10;
        NoSimples<Pessoa> n6_pessoa=new NoSimples<>(p6);
        n5_pessoa.proximo=n6_pessoa;
        System.out.println("N6 pessoa nome:"+n5_pessoa.proximo.dados.nome);
        System.out.println("N6 pessoa idade:"+n5_pessoa.proximo.dados.idade);

        //----------------------------------------------

        Pessoa p7 = new Pessoa();
        p7.nome="Marcos";
        p7.idade=12;
        NoSimples<Pessoa> n7_pessoa=new NoSimples<>(p7);
        n6_pessoa.proximo=n7_pessoa;
        System.out.println("N7 pessoa nome:"+n2_pessoa.proximo.proximo.proximo.proximo.proximo.dados.nome);
        System.out.println("N7 pessoa idade:"+n5_pessoa.proximo.proximo.dados.idade);

        //----------------------------------------------

        Pessoa p8 = new Pessoa();
        p8.nome="Vinicius";
        p8.idade=20;
        NoSimples<Pessoa> n8_pessoa=new NoSimples<>(p8);
        n7_pessoa.proximo=n8_pessoa;
        System.out.println("N8 pessoa nome:"+n5_pessoa.proximo.proximo.proximo.dados.nome);
        System.out.println("N8 pessoa idade:"+n7_pessoa.proximo.dados.idade);



    }
}