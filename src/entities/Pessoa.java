package entities;

import exceptions.DomainException;

public class Pessoa {
	private String name;
	private Integer idade;
	
	public Pessoa(String name, Integer idade) {
		validarIdade(idade);
		validarNome(name);
		this.name = name;
		this.idade = idade;
	}
	
	private void validarIdade(Integer idade){ // Método privado de validação de nome
		if(idade == null || idade < 18) {
			throw new DomainException("Esta pessoa está abaixo da idade necessária.");
		}
	}
	private void validarNome(String name){ // Método privado de validação de nome
	if(name == null || name.trim().isEmpty()){
	throw new DomainException(" Preencha o campo nome");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		validarIdade(idade);
		this.idade = idade;
	}
	
	
}

