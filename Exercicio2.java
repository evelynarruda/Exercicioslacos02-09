package Atividades;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {

		int vetor[] = new int[10];
		int totalPar = 0, totalImpar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "� n�mero");
			vetor[i] = leia.nextInt();
		}
		for(int numero : vetor) {
			if(numero%2==0) {
				System.out.println("O n�mero: " + numero + " � par");
				totalPar++;
			}
			if(numero%2!=0) {
				System.out.println("O n�mero: " + numero + " � �mpar");
				totalImpar++;
			}
		}
		System.out.println("\nExistem " + totalPar + " n�meros pares e " 
		+ totalImpar + " n�meros �mpares");
		leia.close();
	}
}