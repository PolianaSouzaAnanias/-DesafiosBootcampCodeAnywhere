package desafiosBootcamp;
// Leia um n�mero inteiro que representa um c�digo de DDD para discagem interurbana. Em seguida, informe � qual cidade o DDD pertence, considerando a tabela abaixo:
// Se a entrada for qualquer outro DDD que n�o esteja presente na tabela acima, o programa dever� informar:
// Entrada: A entrada consiste de um �nico valor inteiro.
// Sa�da: Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso n�o existir DDD correspondente ao n�mero digitado.

import java.io.IOException;
import java.util.Scanner;

public class ddd {
	  public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	        
	        System.out.println("Para discagem interurbana, digire o DDD desejado.");
	        Scanner scanner = new Scanner(System.in);
	        int DDD = leitor.nextInt();
	        
	        switch (DDD) {
	        	case 81: System.out.println("Recife"); 81break;
		        case 61: System.out.println("Brasilia"); break;
		        case 71: System.out.println("Salvador"); break;
		        case 11: System.out.println("S�o Paulo"); break;
		        case 21: System.out.println("Rio de Janeiro"); break;
		        case 32: System.out.println("Ju�z de Fora"); break;
		        case 19: System.out.println("Campinas"); break;
		        case 27: System.out.println("Vit�ria"); break;
		        case 31: System.out.println("Belo Horizonte"); break;
		        default: System.out.println("DDD nao cadastrado");
		        
		        System.out.println(DDD);
	        }
	    }
}
