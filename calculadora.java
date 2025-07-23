import java.util.Scanner;

public class calculadora {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int o;
        	do {
            System.out.println("\nCalculadora Simples");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");
            o = scanner.nextInt();

            if (o >= 1 && o <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                double r = 0;

                switch (o) {
                    case 1:
                        r = num1 + num2;
                        System.out.println("Resultado: " + r);
                        break;
                    case 2:
                        r = num1 - num2;
                        System.out.println("Resultado: " + r);
                        break;
                    case 3:
                        r = num1 * num2;
                        System.out.println("Resultado: " + r);
                        break;
                    case 4:
                        if (num2 != 0) {
                            r = num1 / num2;
                            System.out.println("Resultado: " + r);
                        } else {
                            System.out.println("Erro");
                        }
                        break;
                }
            } 

        	} while (o != 5);

        System.out.println("Calculadora encerrada.");
        scanner.close();
    
}
}
