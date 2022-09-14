// Os números de Fibonacci formam uma sequência em que cada número é igual à soma dos dois
// anteriores. Os dois primeiros números são, por definição igual a 1, segundo o exemplo abaixo:
// Ex: 1 1 2 3 5 8 13 ...
// Escreva um programa que carregue um carregue um número inteiro pelo teclado e indique se ele faz
// parte da sequência de Fibonacci.
import java.util.Scanner;

public class ex04 {

    static boolean checkFibonacci(int n) {
        
        int f1=1, f2=0, aux=0;

        while(aux <= n ) {
            aux = f1 + f2;
            f1 = f2;
            f2 = aux;

            if(n == aux) 
                return true; 
        
        }

        return false;
        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number: ");
        int num = scanner.nextInt();

        System.out.println("Is fibonacci? " + checkFibonacci(num) + ".");

        scanner.close();
    }
}
