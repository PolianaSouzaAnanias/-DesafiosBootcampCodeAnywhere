package desafiosBootcamp;
// Voc� est� na feira com a sua sacola e parou em uma banca. O feirante lhe entregou piment�es amarelos e vermelhos. Agora iremos somar os pimet�es amarelos e vermelhos para descobrir o total de piment�es na sacola.  Voc� receber� 2 inteiros que devem ser lidos e armazenados nas vari�veis A (piment�es amarelos) e B (piment�es vermelhos). Fa�a a soma de A e B atribuindo o seu resultado na vari�vel X (total de piment�es). Apresente X como descrito na mensagem de exemplo abaixo. N�o apresente outra mensagem al�m da mensagem especificada.
// Entrada: A entrada cont�m 2 valores inteiros, separados por um espa�o.
// Sa�da: Imprimir a mensagem "X = " (sendo a letra X mai�scula) seguido pelo valor da vari�vel X e pelo final de linha. Assegure que exista um espa�o antes e depois do sinal de igualdade.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class visitaNaFeira {
	public static void main(String[] args) throws IOException {
		
	   // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   // StringTokenizer st = new StringTokenizer(br.readLine());
	   
	    System.out.println("Didite o valor dos piment�es amarelos: ");
	    int a = Integer.parseInt(st.nextToken());
	    
	    System.out.println("Didite o valor dos piment�es vermelhos: ");
	    int b = Integer.parseInt(st.nextToken());
	    
	    int x = a + b; // Altere o valor da vari�vel com o c�lculo esperado
	    
	    
	    System.out.println("X = " + x);
	  }
	}
