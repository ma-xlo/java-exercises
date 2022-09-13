/*
Escreva um programa que leia o nome e salário atual de um funcionário. O programa deve calcular
seu novo salário (segundo a tabela abaixo) e mostrar o nome, o salário atual e o salário reajustado do
funcionário:
    
- repita o processo acima até que seja digitado FIM no lugar do nome do funcionário;
- mostrar ao final do programa a soma dos salários atuais, a soma dos salários reajustados e a
diferença entre eles.
*/

import java.util.Scanner;

class ex02 {

    static float salaryReadjustment(float salary) {
        if (salary < 150)
            salary += salary * 0.25;
        else if (salary < 300)
            salary += salary * 0.20;
        else if(salary < 600) 
            salary += salary * 0.15;
        else 
            salary += salary * 0.10;
        
        return salary;
    }

    public static void main(String[] args) {
        String name;
        float salary, totalSalaries=0, totalSalReadjusted=0, diference;

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        
        while (true) {
            System.out.print("Name: ");
            name = scanner.next();

            if(name.equals("FIM"))
                break;

            System.out.print("Salary: ");
            salary = scanner.nextFloat();
            
            System.out.println("+----------------------------+");
            System.out.printf("|Worker: %20s|\n", name.toUpperCase());
            System.out.printf("|Salary: %20.2f|\n", salary);
            System.out.printf("|Readjustment: %14.2f|\n", salaryReadjustment(salary));
            System.out.println("+----------------------------+");

            totalSalaries += salary;
            totalSalReadjusted += salaryReadjustment(salary);


        }

        diference = totalSalaries - totalSalReadjusted;
        System.out.println("Total: $" + totalSalaries);
        System.out.println("Total readjusted: $" + totalSalReadjusted);
        System.out.println("Diference: $" + diference);

        scanner.close();
    }
}
