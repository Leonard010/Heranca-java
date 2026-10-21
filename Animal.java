package Herança;

public class Animal {
	public String nome;
	public String tipo;
	public int idade;
	public int peso;
	public String sexo;
	public void dormir() {
		System.out.println("Está dormindo");
	}

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setTipo(String tipo) {
		 this.tipo = tipo;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", tipo=" + tipo + ", idade=" + idade + ", peso=" + peso + ", sexo=" + sexo
				+ ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getTipo()=" + getTipo()
				+ ", getPeso()=" + getPeso() + ", getSexo()=" + getSexo() + "]";
	}
	
	
 }
