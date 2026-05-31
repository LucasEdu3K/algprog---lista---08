import java.util.Scanner;
public class exercicio5 {
    public static double somaImposto(double taxaImposto, double custo){
        double valorImposto = custo * (taxaImposto / 100);
        double custoAtualizado = custo + valorImposto;
        return custoAtualizado;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o custo incial do item (R$): ");
        double custoItem = sc.nextDouble();

        System.out.println("Digite a taxa de imposto (%): ");
        double taxa = sc.nextDouble();

        custoItem = somaImposto(taxa, custoItem);

        System.out.printf("O custo final do item com imposto é: R$ %.2f%n", custoItem);
    }
}
