import java.util.Scanner;


class ex03 {


    static String num2bin(int n) {
        int aux;
        String bin = "";

        while (n != 0) {
            aux = n % 10;
            n /= 10;
            bin += aux;

        }
        return bin;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        number = scanner.nextInt();

        System.out.println("Binary: " + num2bin(number));

        scanner.close();

    }
}
