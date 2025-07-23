import java.util.Scanner;

public class teste {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[6];

    //Entrada de dados
    for (int i = 0; i < 6; i++) {
        System.out.print("Digite o número " + (i + 1) + ": ");
        numeros[i] = sc.nextInt();
    }

    //Inicializa maior e menor com o primeiro elemento
    int maior = numeros[0];
    int menor = numeros[0];

    //Calcula maior e menor
    for (int i = 1; i < 6; i++) {
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }

    //Saída de dados
    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
}
}

