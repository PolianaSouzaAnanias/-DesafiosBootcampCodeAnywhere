package desafiosBootcamp;

import java.util.Scanner;

public class cpf {
	//Elabore um programa que possuas as caracter�sticas abaixo:
	//- Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
	//- Imprima os quatro grupos num�ricos, sendo um valor por linha.
	//Entrada: A entrada consiste v�rios arquivos de teste e cada um possuindo uma linha com formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD s�o n�meros inteiros.
	//Sa�da: Para cada arquivo da entrada, tem que ter um arquivo de sa�da com quatro linhas, e em cada linha um n�mero inteiro de acordo com procedimento 2 descrito no Desafio. Confira o exemplo abaixo:

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String cpf = scanner.next();
			
			String[] cpfList = new String[4] ;
						
			cpfList[0] = cpf.substring(0, 3);
			cpfList[1] = cpf.substring(4,7);
			cpfList[2] = cpf.substring(8,11);
			cpfList[3] = cpf.substring(12,14);
			
			for(int i =0; i < cpfList.length; i++) {
				System.out.println(cpfList[i]);
			}
		}
}
