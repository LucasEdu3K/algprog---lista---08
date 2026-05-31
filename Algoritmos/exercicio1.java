import java.util.Scanner; 
public class exercicio1 {

     public static void imprimirPadrao(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(i + " ");
                    
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n; 

        System.out.println("Digite um numero (n): ");
        n = sc.nextInt(); 
        imprimirPadrao(n);

        sc.close();

    }
}