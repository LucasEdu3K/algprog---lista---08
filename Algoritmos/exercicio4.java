import java.util.Scanner;

public class exercicio4 {
    public static char positivoNegativo (int n){
        if (n > 0){
            return  'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero (n): ");
        int n = sc.nextInt();

        char resultado = positivoNegativo(n);
        System.out.println(resultado);

        sc.close();
    }
}
