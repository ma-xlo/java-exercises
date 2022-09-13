/*
Escreva um programa que carregue dois valores A e B pelo teclado e imprima todos os números
ímpares entre A e B.
*/
import java.util.Scanner;

class ex01 {

    static void justOdds(float a, float b) {
        if(a > b) {
            while(b < a) {
                if(b % 2 != 0)
                    System.out.println(b);
                b++;
            }
        } else {
            while(a < b) {
                if(a % 2 != 0)
                    System.out.println(a);
                a++;
            }
        }
    }
    
    public static void main(String[] args) {

        float a, b;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.print("A: ");
        a = scanner.nextFloat();
        System.out.print("B: ");
        b = scanner.nextFloat();

        justOdds(a, b);
        
        scanner.close();

    }
}