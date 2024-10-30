package projetosoma;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
	Scanner negativoPositivo = new Scanner(System.in);
	
	// Entrada de Dados
	
	System.out.print("Digite um número: ");
	int numero = negativoPositivo.nextInt();
	
	// Verificação Par ou Ímpar
	
	String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";
	
	// Verificação Positivo ou Negativo
    
	String positivoOuNegativo;
    if (numero > 0) {
        positivoOuNegativo = "positivo";
    } else if (numero < 0) {
        positivoOuNegativo = "negativo";
    } else {
        positivoOuNegativo = "zero"; // Para o caso em que o número é 0
    }
    
    // Saída de dados
    
    if (numero != 0) {
        System.out.println("O Número " + numero + " é " + parOuImpar + " e " + positivoOuNegativo + "!");
    } else {
        System.out.println("O Número " + numero + " é zero!");
    }

    negativoPositivo.close();
	

	}

}
