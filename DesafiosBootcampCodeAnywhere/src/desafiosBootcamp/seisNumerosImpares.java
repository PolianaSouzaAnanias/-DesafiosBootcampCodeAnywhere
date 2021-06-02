package desafiosBootcamp;

// Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.
// Entrada: A entrada será um valor inteiro positivo.
// Saída: A saída será uma sequência de seis números ímpares.

 
import java.io.IOException;
import java.util.Scanner;

public class seisNumerosImpares {
	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

//continue a solucao de acordo com o solicitado no enunciado

       while(cont <6) { // A condição While indica que enquanto 'cont' menor que 6 (verdadeiro), ocorre o laço de repetição.
        if ((x % 2) == 1) { // Se a variável 'x' for um valor ímpar, ele resta 1, então é condição verdadeira.
       
        System.out.println(x); // Imprime o valor da variável 'x'.
        cont++; // Acrescenta +1 a variável 'cont'. 
           	}
        x++; // Conta +1 a variável 'x' após o System.out.println.
        }
    }
}

