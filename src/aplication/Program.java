package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Pessoa;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			
			Pessoa pessoa = new Pessoa(nome, idade);
			System.out.printf(" %s tem %d anos.\n", pessoa.getName(), pessoa.getIdade());
		}
		catch (DomainException e) {
			System.out.print(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.print("Deu ruim");
		}
		finally {
			System.out.print("\nPrograma Finalizado.");
		}
	}

}
