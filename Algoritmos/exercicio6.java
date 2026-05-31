import java.util.Scanner;

public class exercicio6 {

    // Função 1: Responsável apenas por fazer a conversão
    public static int[] converter24para12(int hora, int minuto) {
        int periodo;
        int novaHora;

        // Regra para definir A.M. ou P.M.
        if (hora >= 12) {
            periodo = 'P'; // P.M.
            if (hora > 12) {
                novaHora = hora - 12;
            } else {
                novaHora = 12; // Meio-dia (12:xx PM)
            }
        } else {
            periodo = 'A'; // A.M.
            if (hora == 0) {
                novaHora = 12; // Meia-noite (00:xx vira 12:xx AM)
            } else {
                novaHora = hora;
            }
        }

        // Retorna um array com a nova hora e o período
        return new int[]{novaHora, periodo};
    }

    // Função 2: Responsável apenas por formatar e exibir a saída
    public static void exibirHorario(int hora12, int minuto, char periodo) {
        String sufixo = (periodo == 'P') ? "P.M." : "A.M.";
        
        // Usamos %02d para formatar os minutos sempre com dois dígitos (ex: 2:05 em vez de 2:5)
        System.out.printf("Horário convertido: %d:%02d %s%n", hora12, minuto, sufixo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        // Loop que permite repetir o cálculo quantas vezes o usuário desejar
        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = sc.nextInt();

            System.out.print("Digite os minutos (0-59): ");
            int minuto = sc.nextInt();

            // Executa a conversão
            int[] resultado = converter24para12(hora, minuto);
            int horaConvertida = resultado[0];
            char periodoConvertido = (char) resultado[1]; // Converte de volta int para char

            // Executa a saída
            exibirHorario(horaConvertida, minuto, periodoConvertido);

            // Pergunta se o usuário quer continuar
            System.out.print("\nDeseja converter outro horário? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);
            System.out.println("------------------------------------");

        } while (continuar == 'S');

        System.out.println("Programa encerrado. Até mais!");
        sc.close();
    }
}