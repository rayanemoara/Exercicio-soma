package projetosoma;

import java.util.Scanner;

public class ExercicioSoma {

	public static void main(String[] args) {
	Scanner valor = new Scanner(System.in);
		
	 // Entrada de dados e Leitura dos Valores A, B e C
	
	System.out.print("Digite o número A: ");
        int A = valor.nextInt();

    System.out.print("Digite o número B: ");
        int B = valor.nextInt();

    System.out.print("Digite o número C: ");
        int C = valor.nextInt();

        // Cálculo da soma
        
        int soma = A + B;

        // Comparação e saída de dados
        
        if (soma > C) {
       System.out.println(A + " + " + B + " = " + soma + " > " + C);
        	
      System.out.println("A Soma de A + B é Maior do que C");
        } else if (soma < C) {
        	
        System.out.println(A + " + " + B + " = " + soma + " < " + C);
            
        System.out.println("A Soma de A + B é Menor do que C");
        } else {
        
        System.out.println(A + " + " + B + " = " + soma + " = " + C);
            
        System.out.println("A Soma de A + B é Igual a C");
        }

        valor.close();
	

	}

}
