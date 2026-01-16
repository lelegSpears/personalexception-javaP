package entities;

import exceptions.DomainException;

public class Pessoa {
	private String name;
	private int idade;
	
	public Pessoa(String name, int idade) {
		validarIdade(idade);
		this.name = name;
		this.idade = idade;
	}
	
	private void validarIdade(int idade){
		if(idade < 18) {
			throw new DomainException("Esta pessoa está abaixo da idade necessária.");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		validarIdade(idade);
		this.idade = idade;
	}
	
	
}
