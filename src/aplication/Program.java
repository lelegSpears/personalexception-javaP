package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Pessoa;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			int idade = sc.nextInt(); // Idade vem primeiro por conta do Buffer
			String nome = sc.nextLine();
			
			
			Pessoa pessoa = new Pessoa(nome, idade); // Aplica regra de negócio no construtor
			System.out.printf(" %s tem %d anos.\n", pessoa.getName(), pessoa.getIdade());
		}
		catch (DomainException e) { // Exceção de regras de negócio
			System.out.print(e.getMessage());
		}
		catch (InputMismatchException e) { // Exceção de Entrada inválida;
			System.out.print("Deu ruim");
		}
		finally { // Geralmente usado para limpeza tecnica
			System.out.print("\nPrograma Finalizado.");
		}
	}
}

