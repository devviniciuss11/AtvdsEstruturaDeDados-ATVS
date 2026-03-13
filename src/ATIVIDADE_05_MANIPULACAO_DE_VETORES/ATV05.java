package ATIVIDADE_05_MANIPULACAO_DE_VETORES;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ATV05 extends veitor{
    public static void main(String[]args){
        veitor veitor = new veitor();
        veitor.manipulacao();

        // Obter data e hora atuais
        LocalDateTime agora = LocalDateTime.now();

        // Formatar a data e hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatter);
        System.out.println("Data e hora atual: " + dataHoraFormatada);

        String[]semana = new String[7];
    semana[0]="segunda";
    semana[1]="terca";
    semana[2]="quarta";
    semana[3]="quinta";
    semana[4]="sexta";
    semana[5]="sabado";
    semana[6]="domingo";
        System.out.println("hoje e "+ semana[4]);
        //usar lacos de repeticao pra manipular vetores foreche for if else


    }

}
