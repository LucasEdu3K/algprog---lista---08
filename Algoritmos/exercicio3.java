import java.util.Scanner;
public class exercicio3 {
    public static int somarTresNumeros(int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();

        int somaTotal = somarTresNumeros(num1, num2, num3);

        System.out.println("A soma dos tres numeros = " + somaTotal);

        sc.close();

    }
    
}
