

import java.util.Scanner;

public class JogoDaAdvinhacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 69;
		int tentativas = 10;
		System.out.println("Jogo da adivinhação: "
				+ "Tente adivinhar um número entre 0 - 100");
		System.out.println("Você tem 10 tentativas!\n");
		
		int num2 = 0;
		while(num2 != num1 && tentativas > 0) {
			System.out.println("Digite um número de 0 a 100:");
			System.out.printf("Você tem %d tentativas\n", tentativas);
			if(num2 != num1) {
			num2 = entrada.nextInt();
			tentativas--;
			}
		}
		
		if(num2 == num1) {
			System.out.println("Parabéns, você acertou!!");
		}else
			System.out.println("Que pena, suas tentativas acabaram :(");
		
		entrada.close();
	}
}
