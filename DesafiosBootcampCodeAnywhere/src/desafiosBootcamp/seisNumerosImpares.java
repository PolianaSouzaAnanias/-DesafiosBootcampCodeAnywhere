package desafiosBootcamp;

// Leia um valor inteiro X. Em seguida apresente os 6 valores �mpares consecutivos a partir de X, um valor por linha, inclusive o X se for o caso.
// Entrada: A entrada ser� um valor inteiro positivo.
// Sa�da: A sa�da ser� uma sequ�ncia de seis n�meros �mpares.

 
import java.io.IOException;
import java.util.Scanner;

public class seisNumerosImpares {
	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

//continue a solucao de acordo com o solicitado no enunciado

       while(cont <6) { // A condi��o While indica que enquanto 'cont' menor que 6 (verdadeiro), ocorre o la�o de repeti��o.
        if ((x % 2) == 1) { // Se a vari�vel 'x' for um valor �mpar, ele resta 1, ent�o � condi��o verdadeira.
       
        System.out.println(x); // Imprime o valor da vari�vel 'x'.
        cont++; // Acrescenta +1 a vari�vel 'cont'. 
           	}
        x++; // Conta +1 a vari�vel 'x' ap�s o System.out.println.
        }
    }
}

