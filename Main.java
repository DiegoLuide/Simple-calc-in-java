package calc;
import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;
        int numberFour;

        System.out.println("Bem vindo a calculadora!");

        System.out.println("Digite qual operação deseja fazer:");
        System.out.println("1 para somar.");
        System.out.println("2 para subtrair.");
        System.out.println("3 para multiplicar.");
        System.out.println("4 para dividir.");
        System.out.println("5 para sair.");
        numberThree = read.nextInt();

        if (numberThree == 1) {
            System.out.println("Digite um número:");
            numberOne = read.nextInt();
    
            System.out.println("Digite outro número");
            numberTwo = read.nextInt();

            numberFour = numberOne + numberTwo;

            System.out.println(numberFour);
        } else if (numberThree == 2) {
            System.out.println("Digite um número:");
            numberOne = read.nextInt();
    
            System.out.println("Digite outro número");
            numberTwo = read.nextInt();

            numberFour = numberOne - numberTwo;

            System.out.println(numberFour);
        } else if (numberThree == 3) {
            System.out.println("Digite um número:");
            numberOne = read.nextInt();
    
            System.out.println("Digite outro número");
            numberTwo = read.nextInt();

            numberFour = numberOne * numberTwo;

            System.out.println(numberFour);
        } else if (numberThree == 4) {
            System.out.println("Digite um número:");
            numberOne = read.nextInt();
    
            System.out.println("Digite outro número");
            numberTwo = read.nextInt();

            numberFour = numberOne / numberTwo;

            System.out.println(numberFour);
        } else if (numberThree == 5) {
            System.out.println("Saindo...");
        }

    }
}
