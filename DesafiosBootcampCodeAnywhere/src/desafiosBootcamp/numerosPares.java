package desafiosBootcamp;
import java.io.IOException;
//Desafios: Crie um programa que leia um n�mero e mostre os n�meros pares at� esse n�mero, inclusive ele mesmo.
// Entrada: Voc� receber� 1 valor inteiro N, onde N > 0.
// Sa�da:Exiba todos os n�meros pares at� o valor de entrada, sendo um em cada linha. 

public class numerosPares {
	
	  public static void main(String[] args) {
		
		for (int i = 1 ; i <= 6 ; i++) {
		if ((i  % 2) == 0){
		System.out.println(i);
		   }
		 }
	}
}
